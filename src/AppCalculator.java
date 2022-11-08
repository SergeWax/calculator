import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppCalculator extends JFrame {
    public int result = 0;
    public AppCalculator (){
        setTitle("Калькулятор");
        JPanel panel = new JPanel();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JTextField x1 = new JTextField("1");
        JTextField x2 = new JTextField("2");
        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        }
    }
}
