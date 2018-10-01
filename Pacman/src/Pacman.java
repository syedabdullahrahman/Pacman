import java.awt.EventQueue;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pacman extends JFrame {

    public Pacman() {
        initUI();
    }
    
    private void initUI() {
        add(new Board());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380,420);
        setLocationRelativeTo(null);
        setVisible(true);
    }

//    public void Pacmanmain() {
//
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                Pacman ex = new Pacman();
//                ex.setVisible(true);
//            }
//        });
//    }
}
