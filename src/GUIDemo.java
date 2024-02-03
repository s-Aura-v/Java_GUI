import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIDemo {

    private JFrame frame;
    private JTextField input;
    private JTextArea ta;
    private JLabel label;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private int width;
    private int height;

    public GUIDemo(int w, int h) {
        frame = new JFrame();
        button = new JButton("Send!");
        button2 = new JButton("Jump Scare");
        button3 = new JButton("Apologies");
        label = new JLabel("Hello");
        // JTextArea allows multiple lines unlike JLabel
        ta = new JTextArea("Hello. \n This is a JTextArea.");
        // JTextField(column size);
        // Column Size = How many letters can fix in the box
        input = new JTextField(10);
        this.width = w;
        this.height = h;
    }

    public void setUpGUI() {
        Container cp = frame.getContentPane();
//        FlowLayout flow = new FlowLayout();
//        BorderLayout bord = new BorderLayout();
        GridLayout grid = new GridLayout(2,3);
        cp.setLayout(grid);
        frame.setSize(width,height);
        frame.setTitle("GUI Demo");
        // Adding content into the FlowLayout format
        cp.add(input);
        cp.add(label);
        cp.add(ta);
        cp.add(button);
        cp.add(button2);
        cp.add(button3);
        // Remove it from the original content pane
//        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // HIDE is another option
        frame.setVisible(true);
    }

    public void setUpButtonListener() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj == button) {
                    String s = input.getText();
                    label.setText(s);
                    // Clear input field after clicking send
                    input.setText("");
                } else if (obj == button2) {
                    System.out.println("Boo");
                }
            }
        };
        button.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
    }
}
