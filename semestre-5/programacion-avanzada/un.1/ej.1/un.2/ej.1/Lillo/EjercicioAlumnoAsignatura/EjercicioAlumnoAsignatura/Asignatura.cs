using System;
using System.Collections.Generic;
using System.Text;

namespace EjercicioAlumnoAsignatura
{
    class Asignatura
    {
        public int id { get; set; }
        public string nombre { get; set; }
        public int numero_notas { get; set; }

        public static Asignatura getById(int id)
        {
            foreach (Asignatura a in Program.asignaturas)
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
