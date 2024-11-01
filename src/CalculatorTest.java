import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorTest extends JFrame implements ActionListener {
    private JTextField display;


    public CalculatorTest() {
        setTitle("계산기");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        String[] buttons ={"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};

        for (String text : buttons) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        panel.add(button);
        }

    add(panel, BorderLayout.CENTER);
        setVisible(true);
    }


    public static void main(String[] args) {
        var frame = new CalculatorTest();

        frame.setVisible(true);
    }
}