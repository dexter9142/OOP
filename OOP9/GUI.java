package OOP9;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JFrame frame = new JFrame("Lab 9");
    private JButton CalculateButton = new JButton("Calculate");
    private JTextField Dividend = new JTextField();
    private JTextField Divisor = new JTextField();
    private JLabel Title = new JLabel("Division Pseudocalculator");
    private JLabel ResultLabel = new JLabel("Result:");
    private JLabel DivisionLabel = new JLabel("Divided By");
    private JLabel ExceptionLabel = new JLabel();

    private void FrameSettings(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().add(DivisionLabel);
        DivisionLabel.setSize(100,20);
        DivisionLabel.setText("Divided by");
        DivisionLabel.setLocation(150, 90);
    }

    private void SetTitle(){
        Title.setSize(180,20);
        Title.setLocation(110,30);  //relative to window
        Title.setForeground(Color.PINK);
        frame.getContentPane().add(Title);
    }

    private void SetDividends(){
        Dividend.setSize(100,20);
        Dividend.setLocation(130,70);
        frame.getContentPane().add(Dividend);


    }


    private void SetDivisors(){
        Divisor.setSize(100,20);
        Divisor.setLocation(130,120);
        frame.getContentPane().add(Divisor);


    }

    private void SetResults(double res){
        ResultLabel.setSize(100,20);
        ResultLabel.setLocation(130,180);
        frame.getContentPane().add(ResultLabel);
        ExceptionLabel.setText(" ");
        ResultLabel.setText("Result " + res);
    }

    private void SetExceptions(String ExceptionText){
        ExceptionLabel.setForeground(Color.red);
        ExceptionLabel.setSize(400,20);
        ExceptionLabel.setLocation(130,180);
        frame.getContentPane().add(ExceptionLabel);
        ResultLabel.setText(" ");
        ExceptionLabel.setText(ExceptionText);
    }

    private void SetCalculate(){
        CalculateButton.setSize(100,40);
        CalculateButton.setLocation(130,210);
        CalculateButton.setBackground(Color.cyan);
        CalculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                try {
                    System.out.println(2);
                    double num1 = Float.parseFloat(Dividend.getText());
                    double num2 = Float.parseFloat(Divisor.getText());

                    if (num2 == 13) {
                        throw new UnluckyException();
                    }

                    SetResults(num1/num2);

                } catch (NullPointerException NPE) {
                    SetExceptions("Error: All fields are required.");
                } catch (NumberFormatException NFE) {
                    SetExceptions("Error: Input is not a number.");
                } catch (ArithmeticException AE) {
                    SetExceptions("Error: Invalid expression");
                } catch (UnluckyException UE) {
                    SetExceptions("Unlucky Exception.");
                }
            }
        });

        frame.getContentPane().add(CalculateButton);

    }

    public void create() {
        FrameSettings();
        SetTitle();
        SetDivisors();
        SetDividends();
        SetCalculate();
    }
}
