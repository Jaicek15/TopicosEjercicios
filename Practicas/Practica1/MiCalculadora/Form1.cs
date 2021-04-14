using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MiCalculadora
{
    public partial class Form1 : Form
    {
        private double primerNum;
        private double segunNum;
        private double resul;
        private string oper;


        public Form1()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {
            PantallaRes.Clear();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "7";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "8";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "9";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            oper = "-";
            primerNum = double.Parse(PantallaRes.Text);
            PantallaRes.Clear();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "4";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "5";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "6";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            oper = "+";
            primerNum = double.Parse(PantallaRes.Text);
            PantallaRes.Clear();
        }

        private void button10_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "1";
        }

        private void button11_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "2";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "3";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            oper = "/";
            primerNum = double.Parse(PantallaRes.Text);
            PantallaRes.Clear();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            oper = "*";
            primerNum = double.Parse(PantallaRes.Text);
            PantallaRes.Clear();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + "0";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            PantallaRes.Text = PantallaRes.Text + ".";
        }

        private void button17_Click(object sender, EventArgs e)
        {
            segunNum = double.Parse(PantallaRes.Text);

            switch (oper) {
                case "+":
                    resul = primerNum + segunNum;
                    PantallaRes.Text = resul.ToString();
                    break;
                case "-":
                    resul = primerNum - segunNum;
                    PantallaRes.Text = resul.ToString();
                    break;
                case "*":
                    resul = primerNum * segunNum;
                    PantallaRes.Text = resul.ToString();
                    break;
                case "/":
                    resul = primerNum / segunNum;
                    PantallaRes.Text = resul.ToString();
                    break;
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
