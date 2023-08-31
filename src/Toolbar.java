import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private StringListener textListener;

    private JButton helloButton;
    private JButton byeButton;

    public Toolbar() {
        setBorder(BorderFactory.createEtchedBorder());

        helloButton = new JButton("Hello");
        byeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        byeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(byeButton);
    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();

        if (btn == helloButton) {
            if (textListener != null) {
                textListener.textEmitted("Hello\n");
            }
        } else if (btn == byeButton) {
            if (textListener != null) {
                textListener.textEmitted("Goodbye\n");
            }
        }
    }
}
