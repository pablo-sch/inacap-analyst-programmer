using System;
using System.Collections;
using System.Collections.Generic;

namespace EjercicioAlumnoAsignatura
{
    class Program
    {
        public static List<Alumno> alumnos = new List<Alumno>();
        public static List<Asignatura> asignaturas = new List<Asignatura>();
        public static List<AlumnoAsignatura> alu_asig = new List<AlumnoAsignatura>();

        private static int id_asig = 0;
        private static int id_alum = 0;
        static void Main(string[] args)
        {
            Console.WriteLine("Bienvenido al programa!!");
            int opcion = 0;
            do
            {   
                Console.WriteLine("1. Crear Asignatura (id, nombre, numero_de_notas)");
                Console.WriteLine("2. Crear Alumno(id, nombre, apellido)");
                Console.WriteLine("3. Asociar alumnos a una asignatura");
                Console.WriteLine("4. Ingresar Notas");
                Console.WriteLine("5. Calcular el promedio de un Alumno, según su Asignatura");
                Console.WriteLine("0. Salir");

                opcion = Int32.Parse(Console.ReadLine());
                switch (opcion)
                {
                    case 1:
                        agregarAsignatura();
                        break;
                    case 2:
                        agregarAlumno();
                        break;
                    case 3:
                        asociarAlumnosAsignaturas();
                        break;
                    case 4:
                        agregarNota();
                        break;
                    case 5:
                        calcularPromedioAlumno();
                        break;
                }
            } while (opcion != 0);
        }

        static void agregarAsignatura()
        {
            Asignatura a = new Asignatura();
            Console.WriteLine("Para agregar asignatura agregue los siguientes campos:");
            Console.WriteLine("Nombre: ");
            a.nombre = Console.ReadLine();
            Console.WriteLine("Número de Notas: ");
            a.numero_notas = Int32.Parse(Console.ReadLine());
            a.id = id_asig;
            asignaturas.Add(a);
            id_asig++;
        }

        static void agregarAlumno()
        {
            Alumno a = new Alumno();
            Console.WriteLine("Para agregar asignatura agregue los siguientes campos:");
            Console.WriteLine("Nombre: ");
            a.nombre = Console.ReadLine();
            Console.WriteLine("Apellido: ");
            a.apellido = Console.ReadLine();
            a.id = id_alum;
            alumnos.Add(a);
            id_alum++;
        }

        static void asociarAlumnosAsignaturas()
        {
            int idAlu = listadoAlumnosParaSeleccionar();
            int idAsig = listadoAsignaturasParaSeleccionar();
            Asignatura a = Asignatura.getById(idAsig);
            if (a != null)
            {
                alu_asig.Add(new AlumnoAsignatura(idAlu, idAsig, a.numero_notas));
            } else
            {
                Console.WriteLine("La opción seleccionada no es válida");
            }
            
        }

        static int listadoAlumnosParaSeleccionar()
        {
            int idSeleccionado;
            Console.WriteLine("Indique el ID de uno de los alumnos de la lista: ");
            Console.WriteLine("ID \t\t NOMBRE \t\t APELLIDO");
            foreach (Alumno a in alumnos)
            {
                Console.Write("{0} \t\t {1} \t\t {2} \n", a.id, a.nombre, a.apellido);
            }
            idSeleccionado = Int32.Parse(Console.ReadLine());
            return idSeleccionado;
        }

        static int listadoAsignaturasParaSeleccionar()
        {
            Console.WriteLine("Indique el ID de una de las asignaturas de la lista para asociarla: ");
            Console.WriteLine("ID \t\t NOMBRE ASIGNATURA \n");
            foreach (Asignatura a in asignaturas)
            {
                Console.Write("{0} \t\t {1} \n", a.id, a.nombre);
            }
            int idSeleccionado = Int32.Parse(Console.ReadLine());
            return idSeleccionado;
        }
        static void agregarNota()
        {
            int idAlu = listadoAlumnosParaSeleccionar();
            List<AlumnoAsignatura> listAluAsig = alu_asig.FindAll(x => x.idAlu == idAlu); // expresión LAMBDA
            Console.WriteLine("Seleccione en qué asignatura agregará una nota: ");
            Console.WriteLine("ID \t\t NOMBRE ASIGNATURA \n");
            foreach (AlumnoAsignatura o in listAluAsig)
            {
                foreach (Asignatura a in asignaturas.FindAll(x => x.id == o.idAsig))
                {
                    Console.Write("{0} \t\t {1} \n", a.id, a.nombre);
                }
            }
            int idAsig = Int32.Parse(Console.ReadLine());

            int alu_asig_index = alu_asig.FindIndex(x => x.idAlu == idAlu && x.idAsig == idAsig);
            Asignatura asignatura = Asignatura.getById(idAsig);
            Console.WriteLine("Esta asignatura tiene las siguientes notas. Cuál desea modificar?");
            for (int i = 0; i < asignatura.numero_notas; i++)
            {
                Console.WriteLine("{0}) {1}", i + 1, alu_asig[alu_asig_index].nota[i]);
            }
            int posicionNota = Int32.Parse(Console.ReadLine()) - 1;
            Console.WriteLine("Ingrese la nota: ");
            int nuevaNota = Int32.Parse(Console.ReadLine());
            alu_asig[alu_asig_index].nota[posicionNota] = nuevaNota;
        }

        static void calcularPromedioAlumno()
        {
            int idAlu = listadoAlumnosParaSeleccionar();
            int idAsig = listadoAsignaturasParaSeleccionar();
            foreach (AlumnoAsignatura o in alu_asig)
            {
                if (o.idAlu.Equals(idAlu) && o.idAsig.Equals(idAsig))
                {
                    int sumaNotas = 0;
                    foreach (int nota in o.nota)
                    {
                        sumaNotas += nota;
                    }

                    double promedio = sumaNotas / o.nota.Length;
                    Console.WriteLine("El promedio de notas es: {0}", promedio);
                }
            }
        }
    }
}
