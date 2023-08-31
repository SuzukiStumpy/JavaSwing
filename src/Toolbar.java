import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private TextPanel textPanel;

    private JButton helloButton;
    private JButton byeButton;

    public Toolbar() {
        helloButton = new JButton("Hello");
        byeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        byeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(byeButton);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();

        if (btn == helloButton) {
            textPanel.appendText("Hello\n");
        } else if (btn == byeButton) {
            textPanel.appendText("Goodbye\n");
        }
    }
}
