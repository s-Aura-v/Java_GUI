import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIDemo {

    private JFrame frame;
    private JButton button;
    private int width;
    private int height;

    public GUIDemo(int w, int h) {
        frame = new JFrame();
        button = new JButton("Click Me");
        this.width = w;
        this.height = h;
    }

    public void setUpGUI() {
        frame.setSize(width,height);
        frame.setTitle("GUI Demo");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // HIDE is another option
        frame.setVisible(true);
    }

    public void setUpButtonListener() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click!");
            }
        };
        button.addActionListener(buttonListener);
    }
}
