import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Test2 
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var frame = new JFrame("NOR Gate");
            var panel = new JPanel(new GridLayout(1,3));
            var firstInputButton = new JButton("S=0");
            var secondInputButton = new JButton("Q=0");
            var outputLabel = new JLabel("!Q=0", JLabel.CENTER);
            panel.add(firstInputButton);
            panel.add(secondInputButton);
            panel.add(outputLabel);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(500,500);
            });
            }
}