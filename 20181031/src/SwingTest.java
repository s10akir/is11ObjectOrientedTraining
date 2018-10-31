import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Akira Shinohara
 * @since 2018.10.31
 */
public class SwingTest{
    public static void main(String args[]) {
        new SwingMainMenu();
    }
}

class SwingMainMenu extends JFrame implements ActionListener {
    SwingMainMenu(){
        BorderLayout border = new BorderLayout();
        JButton btn_01 = new JButton("OK");

        getContentPane().setLayout(border);
        getContentPane().add(btn_01, BorderLayout.NORTH);

        btn_01.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent evt){
        System.out.println("ボタンが押下されました。");
    }
}
