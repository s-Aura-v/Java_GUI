import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIDemo {

    private JFrame frame;
    private JTextField input;
    private JLabel label;
    private JButton button;
    private JButton button2;
    private int width;
    private int height;

    public GUIDemo(int w, int h) {
        frame = new JFrame();
        button = new JButton("Click Button!");
        button2 = new JButton("Button 2");
        label = new JLabel("Hello");
        // JTextField(column size);
        // Column Size = How many letters can fix in the box
        input = new JTextField(10);
        this.width = w;
        this.height = h;
    }

    public void setUpGUI() {
        Container cp = frame.getContentPane();
        FlowLayout flow = new FlowLayout();
        cp.setLayout(flow);
        frame.setSize(width,height);
        frame.setTitle("GUI Demo");
        // Adding content into the FlowLayout format
        cp.add(input);
        cp.add(label);
        cp.add(button);
        cp.add(button2);
        // Remove it from the original content pane
//        frame.add(button);
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
