import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Akira Shinohara
 * @since 2018.10.31
 */
public class AWTTest {
    public static void main(String args[]) {
        new AWTMainMenu();
    }
}

class AWTMainMenu extends Frame implements ActionListener {
    AWTMainMenu() {
        BorderLayout border = new BorderLayout();
        Button btn_01 = new Button("OK");

        setLayout(border);
        add(btn_01, BorderLayout.NORTH);

        btn_01.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });

        setSize(500,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt){
        System.out.println("ボタンが押下されました。");
    }

}
