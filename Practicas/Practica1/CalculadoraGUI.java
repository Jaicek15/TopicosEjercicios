package Practicas.Practica1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraGUI extends JFrame {

    // Variables
    JTextField txtResul;
    JButton btnC, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    JButton btnSuma, btnResta, btnDiv, btnMulti, btnEleva, btnIgual;
    JPanel Menu, contNum;
    int priNum, segNum;
    String operador;

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private OperacionesCalcu op;

    public CalculadoraGUI(String nombre) {
        super(nombre);
        initComponents();
    }

    // Componentes
    public void initComponents() {

        this.setLayout(new BorderLayout());

        op = new OperacionesCalcu();

        txtResul = new JTextField();
        txtResul.setEditable(false);
        txtResul.setFont(new Font("Open Sans", 1, 18));
        txtResul.setForeground(new Color(51, 51, 51));
        txtResul.setText("0123456789");
        txtResul.setPreferredSize(new Dimension(300, 30));
        txtResul.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtResultadokeyTyped(evt);
            }
        });

        btnC = new JButton("C");
        btnC.setFocusable(false);
        btnC.setFont(new Font("Open Sans", 4, 20));
        btnC.addActionListener(evt -> btnCActionPerformed(evt));

        btn0 = new JButton("0");
        btn0.setFocusable(false);
        btn0.setFont(new Font("Open Sans", 3, 30));
        btn0.addActionListener(evt -> btn0ActionPerformed(evt));

        btn1 = new JButton("1");
        btn1.setFocusable(false);
        btn1.setFont(new Font("Open Sans", 3, 30));
        btn1.addActionListener(evt -> btn1ActionPerformed(evt));

        btn2 = new JButton("2");
        btn2.setFocusable(false);
        btn2.setFont(new Font("Open Sans", 3, 30));
        btn2.addActionListener(evt -> btn2ActionPerformed(evt));

        btn3 = new JButton("3");
        btn3.setFocusable(false);
        btn3.setFont(new Font("Open Sans", 3, 30));
        btn3.addActionListener(evt -> btn3ActionPerformed(evt));

        btn4 = new JButton("4");
        btn4.setFocusable(false);
        btn4.setFont(new Font("Open Sans", 3, 30));
        btn4.addActionListener(evt -> btn4ActionPerformed(evt));

        btn5 = new JButton("5");
        btn5.setFocusable(false);
        btn5.setFont(new Font("Open Sans", 3, 30));
        btn5.addActionListener(evt -> btn5ActionPerformed(evt));

        btn6 = new JButton("6");
        btn6.setFocusable(false);
        btn6.setFont(new Font("Open Sans", 3, 30));
        btn6.addActionListener(evt -> btn6ActionPerformed(evt));

        btn7 = new JButton("7");
        btn7.setFocusable(false);
        btn7.setFont(new Font("Open Sans", 3, 30));
        btn7.addActionListener(evt -> btn7ActionPerformed(evt));

        btn8 = new JButton("8");
        btn8.setFocusable(false);
        btn8.setFont(new Font("Open Sans", 3, 30));
        btn8.addActionListener(evt -> btn8ActionPerformed(evt));

        btn9 = new JButton("9");
        btn9.setFocusable(false);
        btn9.setFont(new Font("Open Sans", 3, 30));
        btn9.addActionListener(evt -> btn9ActionPerformed(evt));

        btnSuma = new JButton("+");
        btnSuma.setFocusable(false);
        btnSuma.setFont(new Font("Open Sans", 1, 40));
        btnSuma.addActionListener(evt -> btnSumaActionPerformed(evt));

        btnResta = new JButton("-");
        btnResta.setFocusable(false);
        btnResta.setFont(new Font("Open Sans", 1, 40));
        btnResta.addActionListener(evt -> btnRestaActionPerformed(evt));

        btnDiv = new JButton("/");
        btnDiv.setFocusable(false);
        btnDiv.setFont(new Font("Open Sans", 1, 40));
        btnDiv.addActionListener(evt -> btnDivActionPerformed(evt));

        btnMulti = new JButton("*");
        btnMulti.setFocusable(false);
        btnMulti.setFont(new Font("Open Sans", 1, 40));
        btnMulti.addActionListener(vst -> btnMultiActionPerformed(vst));

        btnEleva = new JButton("^");
        btnEleva.setFocusable(false);
        btnEleva.setFont(new Font("Open Sans", 1, 40));
        btnEleva.addActionListener(vst -> btnElevaActionPerformed(vst));

        btnIgual = new JButton("=");
        btnIgual.setFocusable(false);
        btnIgual.setFont(new Font("Open Sans", 1, 50));
        btnIgual.addActionListener(evt -> btnIgualActionPerformed(evt));

        Menu = new JPanel();
        Menu.add(txtResul, BorderLayout.WEST);
        Menu.add(btnC, BorderLayout.EAST);

        contNum = new JPanel();
        contNum.setLayout(new GridLayout(4, 4, 4, 4));

        // Partes de la Calculadora
        contNum.add(btn7);
        contNum.add(btn8);
        contNum.add(btn9);
        contNum.add(btnResta);

        contNum.add(btn4);
        contNum.add(btn5);
        contNum.add(btn6);
        contNum.add(btnSuma);

        contNum.add(btn1);
        contNum.add(btn2);
        contNum.add(btn3);
        contNum.add(btnMulti);

        contNum.add(btnDiv);
        contNum.add(btn0);
        contNum.add(btnEleva);
        contNum.add(btnIgual);

        this.add(Menu, BorderLayout.NORTH);
        this.add(contNum, BorderLayout.CENTER);

        // Ventana
        this.setTitle("MI CALCULADORA");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    private void btnCActionPerformed(ActionEvent e) {
        this.txtResul.setText("");
    }

    private void btn0ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn0.getText());
    }

    private void btn1ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn1.getText());
    }

    private void btn2ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn2.getText());
    }

    private void btn3ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn3.getText());
    }

    private void btn4ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn4.getText());
    }

    private void btn5ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn5.getText());
    }

    private void btn6ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn6.getText());
    }

    private void btn7ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn7.getText());
    }

    private void btn8ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn8.getText());
    }

    private void btn9ActionPerformed(ActionEvent e) {
        txtResul.setText(txtResul.getText() + btn9.getText());
    }

    // Operaciones

    private void btnSumaActionPerformed(ActionEvent e) {
        priNum = Integer.parseInt(txtResul.getText());
        operador = "+";
        txtResul.setText("");
    }

    private void btnRestaActionPerformed(ActionEvent e) {
        priNum = Integer.parseInt(txtResul.getText());
        operador = "-";
        txtResul.setText("");
    }

    private void btnDivActionPerformed(ActionEvent e) {
        priNum = Integer.parseInt(txtResul.getText());
        operador = "/";
        txtResul.setText("");
    }

    private void btnMultiActionPerformed(ActionEvent e) {
        priNum = Integer.parseInt(txtResul.getText());
        operador = "*";
        txtResul.setText("");
    }

    private void btnElevaActionPerformed(ActionEvent e) {
        priNum = Integer.parseInt(txtResul.getText());
        operador = "^";
        txtResul.setText("");
    }

    private void btnIgualActionPerformed(ActionEvent e) {
        segNum = Integer.parseInt(txtResul.getText());
        txtResul.setText(op.opResultado(operador, priNum, segNum));
    }

    private void txtResultadokeyTyped(KeyEvent evt) {
        if (txtResul.getText().length() <= 25) {
            txtResul.setText("Desbordamiento");
        }
    }

    public static void main(String[] args) {
        CalculadoraGUI c = new CalculadoraGUI("Calculadora");
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}