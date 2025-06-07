using System;

namespace _03_Arreglos
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] x = new int[10];
            int[] arreglo = {10, 5, 8, 1};

            for (int i = 0; i < arreglo.Length; i++)
            {
                Console.WriteLine(arreglo[i]);
            }

            Console.WriteLine("El primer valor del arreglo es {0}", arreglo[0]);
            Console.WriteLine("Modificando el último valor del arreglo al valor 6");
            arreglo[3] = 6;

            for (int i = 0; i < arreglo.Length; i++)
            {
                Console.WriteLine(arreglo[i]);
            }
        }
    }
}
