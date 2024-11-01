import java.awt.*;
import javax.swing.*;

public class CalculatorTest extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    private JComboBox<String> operatorComboBox;

    public CalculatorTest() {
        setTitle("계산기");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

    }
    public static void main(String[] args) {
        var frame = new CalculatorTest();

        frame.setVisible(true);
    }
}