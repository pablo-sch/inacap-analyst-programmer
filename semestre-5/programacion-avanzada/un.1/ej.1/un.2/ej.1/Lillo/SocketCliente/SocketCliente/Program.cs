using System;
using System.Net;
using System.Net.Sockets;
using System.Text;

namespace SocketCliente
{
    class Program
    {
        public static int Main(String[] args)
        {
            StartClient();
            return 0;
        }


        public static void StartClient()
        {
            byte[] bytes = new byte[1024];

            try
            {
                // Conectar a un servidor Remoto  
                // Obtener la dirección IP del Host que es usada para establecer una conexión
                // En este caso, obtenemos una dirección IP de localhost que es: 127.0.0.1
                // Si un Host tiene multiples direcciones, obtendrás una lista de direcciones
                IPHostEntry host = Dns.GetHostEntry("localhost");
                IPAddress ipAddress = host.AddressList[0];
                IPEndPoint remoteEP = new IPEndPoint(ipAddress, 11000);

                // Crea un Socket TCP/IP
                Socket sender = new Socket(ipAddress.AddressFamily, SocketType.Stream, ProtocolType.Tcp);

                // Conecta el Socket al endpoint remoto. Capturar cualquier error.
                try
                {
                    // Connect to Remote EndPoint  
                    sender.Connect(remoteEP);

                    Console.WriteLine("Socket conectado a {0}",
                        sender.RemoteEndPoint.ToString());

                    string texto = "";
                    while (!texto.Equals("exit"))
                    {
                        // HACER 3 PASOS PARA ENVIAR UN MENSAJE
                        // 1. CODIFICAR el mensaje que queremos enviar
                        Console.WriteLine("Mande un mensaje: ");
                        texto = Console.ReadLine();
                        byte[] mensaje = Encoding.ASCII.GetBytes(texto);
                        // 2. ENVIAR LA DATA
                        int bytesSent = sender.Send(mensaje);
                        // 3. RECIBIR RESPUESTA del dispositivo remoto
                        int bytesReceived = sender.Receive(bytes);
                        Console.WriteLine("Respuesta del servidor = {0}", Encoding.ASCII.GetString(bytes, 0, bytesReceived));
                    }
                    Console.WriteLine("Saliendo del while......");
                    /*
                    // Codificar los datos string en un arreglo bytes
                    byte[] msg = Encoding.ASCII.GetBytes("Esto es un test.. <EOF>");
                    // Enviar la data a través del socket
                    int bytesSent = sender.Send(msg);
                    // Recibir la respuesta desde el dispositivo remoto  
                    int bytesRec = sender.Receive(bytes);
                    Console.WriteLine("Echoed test = {0}", Encoding.ASCII.GetString(bytes, 0, bytesRec));
                    */

                    // Liberar el Socket
                    sender.Shutdown(SocketShutdown.Both);
                    sender.Close();
                }
                catch (ArgumentNullException ane)
                {
                    Console.WriteLine("ArgumentNullException : {0}", ane.ToString());
                }
                catch (SocketException se)
                {
                    Console.WriteLine("SocketException : {0}", se.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine("Unexpected exception : {0}", e.ToString());
                }

            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
        }

    }
}
