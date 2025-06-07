using System;
using System.Collections;
using System.Threading;

namespace EjercicioColasSolucion
{
    class Program
    {
        static void Main(string[] args)
        {
            int opcion;
            Queue cola = new Queue();
            do
            {
                Console.WriteLine("1. Encolar mensajes");
                Console.WriteLine("2. Enviar mensajes");
                Console.WriteLine("0. Salir");
                opcion = Int32.Parse(Console.ReadLine());
                switch (opcion)
                {
                    case 1:
                        Console.WriteLine("Escriba el mensaje a continuación que desea enviar: ");
                        string mensaje = Console.ReadLine();
                        cola.Enqueue(mensaje);
                        break;
                    case 2:
                        Console.WriteLine("Enviando mensajes........");
                        int largo = cola.Count;
                        for (int i=0; i<largo; i++)
                        {
                            string msg = (string) cola.Dequeue();
                            Console.WriteLine("Mensaje: {0} \n Ha sido enviado.", msg);
                            Thread.Sleep(2000);
                        }
                        break;
                }
            } while (opcion != 0);
        }
    }
}
