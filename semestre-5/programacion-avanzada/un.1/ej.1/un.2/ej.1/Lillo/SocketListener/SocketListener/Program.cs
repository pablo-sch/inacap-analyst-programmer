using System;
using System.Net;
using System.Net.Sockets;
using System.Text;

namespace SocketListener
{
    // Socket Listener actúa como un servidor y escucha los mensajes entrantes
    // en el puerto y protocolo especificados

    class Program
    {
        static int Main(string[] args)
        {
            StartServer();
            return 0;
        }

        private static void StartServer()
        {
            // Obtiene la dirección IP Host que es usada para establecer una conexión
            // En este caso, obtenemos una dirección IP de localhost que es al IP: 127.0.0.1
            // Si un Host tiene multiples direcciones, obtendrás una lista de direcciones
            IPHostEntry host = Dns.GetHostEntry("localhost");
            IPAddress ip = host.AddressList[0];
            IPEndPoint localEndPoint = new IPEndPoint(ip, 11000);

            try
            {
                // Crea un Socket que usará el protocolo TCP  
                Socket listener = new Socket(ip.AddressFamily, SocketType.Stream, ProtocolType.Tcp);
                // Un Socket debe estar asociado con un endpoint (dispositivo informático remoto) usando el método Bind
                listener.Bind(localEndPoint);
                // Especifica cuántos requests un Socket puede escuchar antes de que responda al Servidor que está ocupado
                // Escharemos 10 request a la vez
                listener.Listen(10);

                Console.WriteLine("Esperando una conexión...");
                Socket handler = listener.Accept();

                // Datos entrantes desde el cliente
                string data = null; // en este string se guardará la data que vaya enviando el cliente
                byte[] bytes = null; // buffer de bytes que espera recibir

                while (true)
                {
                    bytes = new byte[1024];
                    int bytesRec = handler.Receive(bytes);  // recibiendo la data contenida en el buffer de bytes
                    data += Encoding.ASCII.GetString(bytes, 0, bytesRec); // decodificando la data a un texto entendible
                    if (data.IndexOf("exit") > -1)
                        break;
                    /*
                    if (data.IndexOf("<EOF>") > -1)
                    {
                        break;
                    }
                    */
                    Console.WriteLine("Texto recibido : {0}", data);
                    byte[] msg = Encoding.ASCII.GetBytes("Ok.. mensaje recibido"); // codificando mensaje de respuesta ok
                    //byte[] msg = Encoding.ASCII.GetBytes("Mensaje recibido: ok"); // codificando mensaje de respuesta ok
                    handler.Send(msg);  // envío la respuesta como arreglo de bytes
                }
                // Liberar el Socket
                handler.Shutdown(SocketShutdown.Both);
                handler.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }

            Console.WriteLine("\n Presione cualquier tecla para continuar...");
            Console.ReadKey();
        }
    }
}
