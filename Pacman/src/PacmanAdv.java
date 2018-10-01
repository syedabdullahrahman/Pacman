import java.awt.EventQueue;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PacmanAdv extends JFrame {

    public PacmanAdv() {
        initUI();
    }
    
    private void initUI() {
        add(new BoardAdv());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380,420);
        setLocationRelativeTo(null);
        setVisible(true);
    }

//    public void PacmanAdvmain() {
//
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                PacmanAdv ex = new PacmanAdv();
//                ex.setVisible(true);
//            }
//        });
//    }
}
