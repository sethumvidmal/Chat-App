import javax.swing.*;
import java.awt.*;
public class Window extends JFrame implements Observer{
    private final JButton btnSend = new JButton();
    private final JTextField message = new JTextField();
    private  final JTextArea display = new JTextArea();
    private final String title;
    public Window(String title){
        this.title = title;
        setTitle(title);
        setSize(400,400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        display.setEditable(false);
        btnSend.setText("Send");
        btnSend.setFont(new Font("",1,20));
        display.setFont(new Font("",1,15));
        message.setFont(new Font("",1,12));
        btnSend.addActionListener((evt)->{
            Observable.getInstance().getMessage(title,message.getText());
            message.setText("");
        });
        add("South",btnSend);
        add("North",message);
        add("Center",display);
    }
    @Override
    public void setMessage(String senderName, String message) {
        if(senderName == title) {
            display.append("Me : " + message + "\n");
        }else {
            display.append(senderName + " : " + message + "\n");
        }
    }
    @Override
    public String getTitle() {
        return title;
    }
}