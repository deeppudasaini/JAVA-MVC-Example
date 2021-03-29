import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    JPanel panelMain = new JPanel();
    JTextField txt_numberOne=new JTextField();
    JTextField txt_numberTwo=new JTextField();
    JButton addButton = new JButton("Add");
    public CalculatorView()
    {
        this.setSize(400,400);
        this.getContentPane().add(panelMain);
panelMain.setLayout(null);
      txt_numberOne.setBounds(50,50,50,50);
      panelMain.add(txt_numberOne);
        txt_numberTwo.setBounds(100,100,50,50);
        panelMain.add(txt_numberTwo);
        addButton.setEnabled(true);
        addButton.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
        addButton.setFont(new Font("SansSerif", Font.BOLD, 20));
        addButton.setBounds(150, 150, 50, 50);

        addButton.setBackground(new Color(74, 31, 61));
        addButton.setForeground(new Color(255, 255, 255));
        panelMain.add(addButton);

    }
    public  void setNumberOne(String NumberOneNew) {
        txt_numberOne.setText(NumberOneNew);
    }
    public  void setNumberTwo(String NumberTwoNew) {
        txt_numberTwo.setText(NumberTwoNew);
    }
    public  int getNumberOne() {
        return Integer.parseInt(txt_numberOne.getText());
    }
    public  int getNumberTwo() {
        return Integer.parseInt(txt_numberTwo.getText());
    }
    public void addAddButtonActionListener(ActionListener e)
    {
        addButton.addActionListener(e);
    }
}

