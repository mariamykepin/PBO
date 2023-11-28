package pbo11;
        
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PBO13_01 extends JFrame {
    JButton numBtn[];
    JButton btnMultiply, btnAdd, btnSubtract, btnDivide, btnDelete, btnClear, btnEquals;
    JTextField output;
    String current, previous, operator;
    OperatorBtnHandler opBtnHandler;
    OtherBtnHandler otherBtnHandler;

    public PBO13_01() {
        super("Box Calculator");
        JPanel mainPanel = new JPanel();
        current = "";

        JPanel[] rows = new JPanel[5];

        for (int i = 0; i < rows.length; i++) {
            rows[i] = new JPanel();
        }

        output = new JTextField(16);

        NumberBtnHandler numBtnHandler = new NumberBtnHandler();
        opBtnHandler = new OperatorBtnHandler();
        otherBtnHandler = new OtherBtnHandler();

        numBtn = new JButton[11];

        for (int count = 0; count < numBtn.length; count++) {
            numBtn[count] = new JButton(count == 9 ? "0" : String.valueOf(count + 1));
            numBtn[count].setFont(new Font("Monospaced", Font.BOLD, 22));
            numBtn[count].addActionListener(numBtnHandler);
        }

        output.setMaximumSize(new Dimension(185, 40));
        output.setFont(new Font("Monospaced", Font.BOLD, 27));
        output.setDisabledTextColor(new Color(0, 0, 0));
        output.setMargin(new Insets(0, 5, 0, 0));
        output.setText("0");

        for (JButton btn : numBtn) {
            btn.addActionListener(numBtnHandler);
        }

        rows[0].setLayout(new BoxLayout(rows[0], BoxLayout.LINE_AXIS));
        rows[1].setLayout(new BoxLayout(rows[1], BoxLayout.LINE_AXIS));
        rows[2].setLayout(new BoxLayout(rows[2], BoxLayout.LINE_AXIS));
        rows[3].setLayout(new BoxLayout(rows[3], BoxLayout.LINE_AXIS));
        rows[4].setLayout(new BoxLayout(rows[4], BoxLayout.LINE_AXIS));

        rows[0].add(numBtn[0]);
        rows[0].add(numBtn[1]);
        rows[0].add(numBtn[2]);
        rows[0].add(opBtnHandler.getOperatorButton("+"));

        rows[1].add(numBtn[3]);
        rows[1].add(numBtn[4]);
        rows[1].add(numBtn[5]);
        rows[1].add(opBtnHandler.getOperatorButton("-"));

        rows[2].add(numBtn[6]);
        rows[2].add(numBtn[7]);
        rows[2].add(numBtn[8]);
        rows[2].add(opBtnHandler.getOperatorButton("*"));

        rows[3].add(numBtn[9]);
        rows[3].add(otherBtnHandler.getOtherButton("C")); // "C" button
        rows[3].add(opBtnHandler.getOperatorButton("="));
        rows[3].add(opBtnHandler.getOperatorButton("/"));

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(output);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        for (JPanel row : rows) {
            mainPanel.add(row);
        }

        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(205, 280);
    }

    public void delete() {
        if (current.length() > 0) {
            current = current.substring(0, current.length() - 1);
        }
    }

    public void clear() {
        current = "";
        previous = "";
        operator = null;
    }

    public void updateOutput() {
        output.setText(current);
    }

    public void appendToOutput(String num) {
        // Prevents adding more than one dot on the output
        if (num.equals(".") && current.contains(".")) {
            return;
        }
        current += num;
    }

    public void selectOperator(String newOperator) {
        if (current.isEmpty()) {
            operator = newOperator;
            return;
        }

        if (!previous.isEmpty()) {
            calculate();
        }

        operator = newOperator;
        previous = current;
        current = "";
    }

    public void calculate() {
        if (previous.length() < 1 || current.length() < 1) {
            return;
        }
        double result = 0.0;
        double num1 = Double.parseDouble(previous);
        double num2 = Double.parseDouble(current);
        switch (operator) {
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                break;
        }
        current = String.valueOf(result);
        operator = null;
        previous = "";
        processOutputNumber();
    }

    public void processOutputNumber() {
        if (current.length() > 0) {
            String integerPart = current.split("\\.")[0];
            String decimalPart = current.split("\\.")[1];
            if (decimalPart.equals("0")) {
                current = integerPart;
            }
        }
    }

    private class NumberBtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selectedBtn = (JButton) e.getSource();
            for (JButton btn : numBtn) {
                if (selectedBtn == btn) {
                    appendToOutput(btn.getText());
                    updateOutput();
                }
            }
        }
    }

    private class OperatorBtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selectedBtn = (JButton) e.getSource();
            String operator = selectedBtn.getText();
            selectOperator(operator);
            updateOutput();
        }

        public JButton getOperatorButton(String text) {
            JButton operatorButton = new JButton(text);
            operatorButton.setFont(new Font("Monospaced", Font.BOLD, 22));
            operatorButton.addActionListener(this);
            return operatorButton;
        }
    }

    private class OtherBtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selectedBtn = (JButton) e.getSource();
            if (selectedBtn.getText().equals("C")) {
                clear();
            } else if (selectedBtn.getText().equals("=")) {
                calculate();
            } else if (selectedBtn.getText().equals("Delete")) {
                delete();
            }
            updateOutput();
        }

        public JButton getOtherButton(String text) {
            JButton otherButton = new JButton(text);
            otherButton.setFont(new Font("Monospaced", Font.BOLD, 22));
            otherButton.addActionListener(this);
            return otherButton;
        }
    }

    public static void main(String[] args) {
        new PBO13_01();
    }
}



