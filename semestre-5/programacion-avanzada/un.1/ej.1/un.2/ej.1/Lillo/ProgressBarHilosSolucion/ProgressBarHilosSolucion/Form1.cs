using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProgressBarHilosSolucion
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            Control.CheckForIllegalCrossThreadCalls = false; // Para usar objetos del form en distintos hilos
        }

        private void btnIniciar_Click(object sender, EventArgs e)
        {
            Thread t1 = new Thread(llenarBarra1);
            Thread t2 = new Thread(llenarBarra2);
            Thread t3 = new Thread(llenarBarra3);
            t1.Start();
            t2.Start();
            t3.Start();
        }

        private void llenarBarra1()
        {
            int x = 5;
            while (true)
            {
                if (pBar1.Value >= 100)
                {
                    break;
                }
                pBar1.Value += x;
                Thread.Sleep(500);
            }
        }
        private void llenarBarra2()
        {
            int x = 10;
            while (true)
            {
                if (pBar2.Value >= 100)
                {
                    break;
                }
                pBar2.Value += x;
                Thread.Sleep(200);
            }
        }
        private void llenarBarra3()
        {
            int x = 2;
            while (true)
            {
                if (pBar3.Value >= 100)
                {
                    break;
                }
                pBar3.Value += x;
                Thread.Sleep(100);
            }
        }
    }
}
