import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton btn;

    public MainFrame() {
        super("Hello World!");

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        btn = new JButton("Click me!");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
    }
}
