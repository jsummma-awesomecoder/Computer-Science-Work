package testrigs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TestRigs extends JPanel {

    private JTextField paidField;
    private JButton calcButton;

    // Stores the results that will be displayed
    private String[] breakdownLines = {
        "Enter an amount and press Calculate."
    };

    public TestRigs() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 12));
        setBackground(new Color(245, 248, 250));

        // Amount input
        JLabel amountLabel = new JLabel("Amount Paid: $");
        amountLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(amountLabel);

        paidField = new JTextField(7);
        add(paidField);

        // Calculate button
        calcButton = new JButton("Calculate");
        calcButton.setBackground(new Color(70, 130, 180));
        calcButton.setForeground(Color.WHITE);
        add(calcButton);

        // When the button is pressed
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateChange();
                repaint();
            }
        });
    }

    // Calculates the bills and coins
    private void calculateChange() {
        try {
            double paid = Double.parseDouble(paidField.getText());

            if (paid < 0) {
                breakdownLines = new String[]{"Please enter a positive amount."};
                return;
            }

            int cents = (int) Math.round(paid * 100);

            int tens = cents / 1000;
            cents %= 1000;

            int fives = cents / 500;
            cents %= 500;

            int ones = cents / 100;
            cents %= 100;

            int quarters = cents / 25;
            cents %= 25;

            int dimes = cents / 10;
            cents %= 10;

            int nickels = cents / 5;
            cents %= 5;

            int pennies = cents;

            breakdownLines = new String[]{
                 "Bills:  $10 x " + tens,

                "        $5 x " + fives
                    + "   $1 x " + ones,

             
                "Coins:  25¢ x " + quarters
                    + "   10¢ x " + dimes
                    + "   5¢ x " + nickels
                    + "   1¢ x " + pennies
            };

        } catch (NumberFormatException ex) {
            breakdownLines = new String[]{
                "Invalid - Please put a positive number."
            };
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Title
        g.setFont(new Font("Serif", Font.BOLD, 17));
        g.setColor(new Color(45, 45, 45));
        g.drawString("Simple Change Breakdown", 125, 75);

        // Results
        g.setFont(new Font("Serif", Font.PLAIN, 13));
        g.setColor(Color.BLACK);

        int y = 140;

        for (String line : breakdownLines) {
            g.drawString(line, 20, y);
            y += 22;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Money Breakdown");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 280);
        frame.setLocationRelativeTo(null);

        TestRigs panel = new TestRigs();
        frame.setContentPane(panel);

        frame.setVisible(true);
    }
}
