import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorTest extends JFrame implements ActionListener {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    private JComboBox<String> operatorComboBox;

    public CalculatorTest() {
        setTitle("계산기");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        num1Field = new JTextField(5);
        add(num1Field);//GPT사용

        String[] operators = {"+", "-", "*", "/"};
        operatorComboBox = new JComboBox<>(operators);
        add(operatorComboBox);  //GPT 사용


        num2Field = new JTextField(5);
        add(num2Field);

        JButton calculateButton = new JButton("=");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel("결과: ");
        add(resultLabel);

    }
    public static void main(String[] args) {
        var frame = new CalculatorTest();

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}