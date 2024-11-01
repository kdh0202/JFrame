import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorTest extends JFrame implements ActionListener {
    private JTextField display;
    private double num1, num2, result;
    private char operator;

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
    @Override
    public void actionPerformed(ActionEvent e) {            //GPT사용
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        }
        else if(command.charAt(0) =='C'){
            display.setText("");
            num1 = num2 = result = 0;
        }
        else if (command.charAt(0) =='='){
            num2 = Double.parseDouble(display.getText());       //GPT사용

            switch(operator){       //switch 사용법 인터넷 검색
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            display.setText("" + result);
        }
        else{
            operator = command.charAt(0);
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorTest();

    }
}