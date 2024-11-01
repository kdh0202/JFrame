import javax.swing.*;
import java.awt.*;

public class calculator extends JFrame {

    private JTextField inputSpace;

    public calculator() {
        setLayout(null);
        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
        inputSpace.setBounds(8,10,270,70);

        add(inputSpace);

        setTitle("계산기");
        setVisible(true);
        setSize(300, 370);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new calculator();
    }
}
