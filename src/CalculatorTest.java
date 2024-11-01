import java.awt.*;
import javax.swing.*;

public class CalculatorTest extends JFrame {
    CalculatorTest() {
        setTitle("계산기");

    setLayout(new BorderLayout(10,10));
    showNorth(); showCenter(); showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 500);
        setVisible(true);
    }

    void showNorth() {
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(5,40);
        area.setEditable(false);
        area.setForeground(Color.BLACK);

        panel.add(area);

        add(panel, BorderLayout.NORTH);
    }



    void showCenter() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10 ,10));

        JButton cal = new JButton("계산");
        JButton cal1 = new JButton("+");
        JButton cal2 = new JButton("-");
        JButton cal3 = new JButton("*");
        JButton cal4 = new JButton("/");
        JButton reset = new JButton("리셋");

        panel.add(cal); panel.add(cal1); panel.add(cal2); panel.add(cal3); panel.add(cal4); panel.add(reset);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        JPanel p1 = new JPanel();

        JButton cal = new JButton("1");
        JButton cal1 = new JButton("2");
        JButton cal2 = new JButton("3");

        p1.add(cal); p1.add(cal1); p1.add(cal2);
        add(p1, BorderLayout.SOUTH);

        JPanel p2 = new JPanel();

        JButton cal3 = new JButton("3");
        JButton cal4 = new JButton("4");
        JButton cal5 = new JButton("5");
        p2.add(cal3);  p2.add(cal4);  p2.add(cal5);
        add(p2, BorderLayout.EAST);

    }
    public static void main(String[] args) {
        new CalculatorTest();
    }
}
