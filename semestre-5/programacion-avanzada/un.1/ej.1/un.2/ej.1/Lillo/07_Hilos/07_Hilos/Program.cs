using System;
using System.Threading;

namespace _07_Hilos
{
    class Program
    {
        static string[] nombres = { "Pedro", "Juan", "Pablo", "Maritza", "Claudia", "Diego", "Andy", "Fernanda" };
        static string[] frutas = { "durazno", "peras", "manzanas", "ciruelas", "avellanas", "damasco" };
        static string[] deportes = { "fútbol", "basquetball", "tennis", "golf", "tennis de mesa", "natación" };
        static void Main(string[] args) 
        {
            Thread hilo = new Thread(proceso1);
            Thread hilo2 = new Thread(proceso2);
            Thread hilo3 = new Thread(proceso3);

            hilo.Start();   // Así damos inicio al hilo. Sin Start() no se iniciará el trabajo
            hilo.Join();    // Con este método obligan a que se termine de ejecutar este hilo, antes de que continúen los otros
            hilo2.Start();
            hilo3.Start();

            Console.WriteLine("Este es un mesaje del hilo principal......");
        }

        public static void proceso1()
        {
            foreach (string nom in nombres)
            {
                Console.WriteLine("Nombre persona: " + nom);
                Thread.Sleep(100);
            }
        }

        public static void proceso2()
        {
            foreach (string nom in frutas)
            {
                Console.WriteLine("Nombre fruta: " + nom);
                Thread.Sleep(200);
            }
        }

        public static void proceso3()
        {
            foreach (string nom in deportes)
            {
                Console.WriteLine("Nombre deporte: " + nom);
                Thread.Sleep(300);
            }
        }

    }
}
