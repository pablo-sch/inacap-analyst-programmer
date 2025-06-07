using System;

namespace _03_ClasesMetodos
{
    class Program
    {
        static void Main(string[] args)
        {
            Persona p = new Persona();
            p.nombre = "Pablo";
            p.fechaNacimiento = new DateTime(1998, 04, 10);
            p.estatura = 1.75;   // en mts
            p.peso = 75;    // en kgs

            Console.WriteLine("Nombre: {0}", p.nombre);
            p.calcularMayoriaEdad();
            double imc = p.calcularIMC();
            Console.WriteLine("Tu IMC es de: " + imc);
        }
    }
}
