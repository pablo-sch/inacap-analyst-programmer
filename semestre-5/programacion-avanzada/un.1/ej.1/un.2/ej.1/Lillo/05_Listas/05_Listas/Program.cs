using System;
using System.Collections.Generic;

namespace _05_Listas
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> listaDeEnteros = new List<int>();
            listaDeEnteros.Add(5);
            listaDeEnteros.Add(10);
            listaDeEnteros.Add(2);
            listaDeEnteros.Add(8);
            listaDeEnteros.Add(40);
            listaDeEnteros.Add(35);

            for (int i=0; i<listaDeEnteros.Count; i++)
            {
                Console.WriteLine("Elemento {0} de la lista tiene el valor: {1}", i, listaDeEnteros[i]);
            }

            foreach (int valor in listaDeEnteros)
            {
                Console.WriteLine(valor);
            }
        }
    }
}
