import java.awt.*;
import javax.swing.*;

public class CalculatorTest extends JFrame {

    String operand;
    String operator;
    CalculatorTest() {
        setTitle("계산기");

        setLayout(new BorderLayout(10,10));
        showNorth(); showCenter(); showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 500);
        setVisible(true);
    }

    void showNorth() {
    JTextField textField = new JTextField();

    add (textField, BorderLayout.NORTH);
    }



    void showCenter() {
        JPanel panel = new JPanel();
        setLayout(new GridLayout(4,4));
        String[] buttons = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "/", "0", "Clear", "=" };

        add(panel, BorderLayout.CENTER);

        for(String button : buttons) {

            var btn = new JButton(button);
            btn.setFont(new Font("Arial", Font.PLAIN, 30));
            btn.addActionListener(e -> {

                Label textField = null;
                if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
                    textField.setText(textField.getText() + button);
                }
                else if (button.equals("Clear")) {
                    textField.setText("");
                    operand = "";
                    operator = "";
                }
                else if (button.equals("=")) {
                    long op1 = Long.valueOf(operand);
                    long op2 = Long.valueOf(textField.getText());

                    if (operator.equals("+")) {
                        textField.setText(String.valueOf(op1 + op2));
                    } else if (operator.equals("-")) {
                        textField.setText(String.valueOf(op1 - op2));
                    } else if (operator.equals("*")) {
                        textField.setText(String.valueOf(op1 * op2));
                    } else if (operator.equals("/")) {
                        textField.setText(String.valueOf(op1 / op2));
                    }
                }
                else {
                    operand = textField.getText();
                    operator = button;
                    textField.setText("");
                }
            });

            panel.add(btn);
        }

        add(panel);
    }

    void showSouth() {

    }
    public static void main(String[] args) {
        var frame = new CalculatorTest();

        frame.setVisible(true);
    }
}