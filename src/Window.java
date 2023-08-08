import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Observer{
    private JButton btnSend = new JButton();
    private JTextField message = new JTextField();
    private static JTextArea display = new JTextArea();

    public Window(String title){
        setTitle(title);
        setSize(400,400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        btnSend.setText("Send");
        btnSend.setFont(new Font("",1,20));

        display.setFont(new Font("",1,15));

        message.setFont(new Font("",1,12));

        btnSend.addActionListener((evt)->{
            Observable.getMessage(message.getText());

        });


        display.setEditable(true);

        add("South",btnSend);
        add("North",message);
        add("Center",display);

    }


    @Override
    public void setMessage(String message) {
        display.append(message+"\n");
    }
}
