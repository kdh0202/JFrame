import java.awt.*;
import javax.swing.*;

public class CalculatorTest extends JFrame {

    String operand;
    String operator;
    CalculatorTest() {
        setTitle("계산기");
        setLayout(new BorderLayout(10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 500);
        setVisible(true);

        var textField = new JTextField();

        add(textField, BorderLayout.NORTH);

        var panel = new JPanel(new GridLayout(4,4));

        String[] buttons = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "/", "0", "Clear", "=" };

    }

    public static void main(String[] args) {
        new CalculatorTest();
    }
}


