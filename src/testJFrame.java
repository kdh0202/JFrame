import java.awt.*;
import javax.swing.*;

public class testJFrame extends JFrame{
    CardLayout layout;

    public void rotate(){
        while (true){
            try {
                Thread.sleep(500);
            } catch (Exception e){
                }
                layout.next(this.getContentPane());
            }
        }

            testJFrame(){
                setTitle("카드 레이아웃!");
                layout = new CardLayout();
                setLayout(layout);

                add(new JButton("버튼 0"));
                add(new JButton("버튼 1"));
                add(new JButton("버튼 2"));

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(500, 110);
            setVisible(true);
        }

        public static void main(String[] args){
            new testJFrame().rotate();
        }
}
