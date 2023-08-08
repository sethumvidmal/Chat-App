import javax.swing.*;
import java.awt.*;
public class Window extends JFrame implements Observer{
    private final JButton btnSend = new JButton();
    private final JButton btnClear = new JButton();
    private final JTextField message = new JTextField();
    private  final JTextArea display = new JTextArea();
    private final String title;
    public Window(String title){
        this.title = title;
        setTitle(title);
        setSize(400,350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        display.setEditable(false);
        display.setFont(new Font("",1,15));
        display.setBounds(15, 60, 360, 200);
        add(display);

        btnSend.setText("Send");
        btnSend.setFont(new Font("",1,20));
        btnSend.setBounds(220, 265, 90, 40);
        btnSend.addActionListener((evt)->{
            Observable.getInstance().getMessage(title,message.getText());
            message.setText("");
        });
        add(btnSend);

        message.setFont(new Font("",1,12));
        message.setBounds(15, 10, 360, 35);
        add(message);

        btnClear.setText("Clear");
        btnClear.setFont(new Font("",1,20));
        btnClear.setBounds(120, 265, 90, 40);
        btnClear.addActionListener((evt)->{
            display.setText("");
        });
        add(btnClear);

        setVisible(true);
    }
    @Override
    public void setMessage(String senderName, String message) {
        if(senderName == title) {
            display.append("Me : " + message + "\n");
        }else {
            display.append(senderName + " : " + message + "\n");
        }
    }
}