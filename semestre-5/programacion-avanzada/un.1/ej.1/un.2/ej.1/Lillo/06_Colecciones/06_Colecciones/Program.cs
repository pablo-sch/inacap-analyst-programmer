using System;
using System.Collections;
using System.Collections.Generic;

namespace _06_Colecciones
{
    class Program
    {
        static void Main(string[] args)
        {
            //List<int> numeros = new List<int>();
            Console.WriteLine("DICCIONARIO, salidas de datos");
            // DICCIONARIOS
            Dictionary<string, int> diccionario = new Dictionary<string, int>();
            diccionario.Add("hola", 10);
            diccionario.Add("x", 28);
            diccionario.Add("asdf", 2);
            diccionario.Add("plm", 15);

            diccionario["x"] = 10000;
            Console.WriteLine("Valor: " + diccionario["x"]);

            int value = 0;
            Console.WriteLine("Intento con TryGetValue: " + diccionario.TryGetValue("fhgzdfs", out value));

            // COLAS - funcionamiento FIFO
            Console.WriteLine("COLAS, salidas de datos");
            Queue cola = new Queue();
            cola.Enqueue(4);
            cola.Enqueue("hola");
            cola.Enqueue(true);
            cola.Enqueue(20);
            cola.Enqueue("mundo");

            // DESENCOLAR ELEMENTOS DE LA COLA
            Object x = cola.Dequeue();
            Console.WriteLine("Mostrando elemento desencolado: {0}", x);
            // CONTAR ELEMENTOS DE LA COLA
            Console.WriteLine("Cantidad de elementos: {0}", cola.Count);
            // PINTAR VALORES ENCOLADOS
            foreach (Object obj in cola)
                Console.WriteLine("    {0}", obj);

            // STACK O PILAS - funcionamiento LIFO
            Console.WriteLine("PILAS, salidas de datos");
            Stack pila = new Stack();
            pila.Push("Hello");
            pila.Push("World");
            pila.Push("!");

            // CONTAR ELEMENTOS DE LA PILA
            Console.WriteLine("Cantidad de elementos: {0}", pila.Count);
            // QUITAR Y, A LA VEZ, OBTENER ELEMENTO DE LA PILA
            Object y = pila.Pop();
            Console.WriteLine("Mostrando elemento desapilado: {0}", y);
            // PINTAR VALORES DE LA PILA
            foreach (Object obj in pila)
                Console.WriteLine("    {0}", obj);

        }
    }
}
