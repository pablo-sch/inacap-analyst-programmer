using System;
using System.Collections.Generic;
using System.Text;

namespace _03_ClasesMetodos
{
    class Persona
    {
        public string nombre { get; set; }
        public string apellido { get; set; }
        public DateTime fechaNacimiento { get; set; }
        public double peso { get; set; }
        public double estatura { get; set; }

        public void calcularMayoriaEdad()
        {
            Console.WriteLine("Fecha nacimiento: " + fechaNacimiento);
        }

        public void comer()
        {
            peso += 1;
        }

        public double calcularIMC()
        {
            // IMC = peso [kg]/ estatura [m2])
            double imc = peso / (estatura * estatura);
            return imc;
        }

    }
}
