using System;
using System.Collections.Generic;
using System.Text;

namespace EjercicioAlumnoAsignatura
{
    class Alumno
    {
        public int id { get; set; }
        public string nombre { get; set; }
        public string apellido { get; set; }

        public static Alumno getById(int id)
        {
            foreach (Alumno a in Program.alumnos)
            {
                if (a.id == id)
                {
                    return a;
                }
            }
            return null;
        }

    }
}
