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
    }

    public static void main(String[] args) {
        new CalculatorTest();
    }
}


