using System;
using System.Collections.Generic;
using System.Text;

namespace EjercicioAlumnoAsignatura
{
    class AlumnoAsignatura
    {
        public int idAlu { get; set; }
        public int idAsig { get; set; }
        public int[] nota { get; set; }

        public AlumnoAsignatura(int idAlu, int idAsig, int cantidadNotas)
        {
            this.idAlu = idAlu;
            this.idAsig = idAsig;
            this.nota = new int[cantidadNotas];
        }
    }
}
