import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4 extends JFrame {

    private JTextField score1Field, weight1Field;
    private JTextField score2Field, weight2Field;
    private JTextField score3Field, weight3Field;
    private JTextField score4Field, weight4Field;
    private JLabel resultLabel;

    public lab4() {
        setTitle("Weighted Average Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel and layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Test score and weight input fields
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Test Score 1:"), gbc);
        score1Field = new JTextField();
        gbc.gridx = 1;
        panel.add(score1Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Weight 1:"), gbc);
        weight1Field = new JTextField();
        gbc.gridx = 1;
        panel.add(weight1Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Test Score 2:"), gbc);
        score2Field = new JTextField();
        gbc.gridx = 1;
        panel.add(score2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Weight 2:"), gbc);
        weight2Field = new JTextField();
        gbc.gridx = 1;
        panel.add(weight2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Test Score 3:"), gbc);
        score3Field = new JTextField();
        gbc.gridx = 1;
        panel.add(score3Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Weight 3:"), gbc);
        weight3Field = new JTextField();
        gbc.gridx = 1;
        panel.add(weight3Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(new JLabel("Test Score 4:"), gbc);
        score4Field = new JTextField();
        gbc.gridx = 1;
        panel.add(score4Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(new JLabel("Weight 4:"), gbc);
        weight4Field = new JTextField();
        gbc.gridx = 1;
        panel.add(weight4Field, gbc);

        // Calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        panel.add(calculateButton, gbc);

        // Result label
        resultLabel = new JLabel("Weighted Average: ");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        panel.add(resultLabel, gbc);

        add(panel);
    }

    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Retrieve test scores and weights from text fields
                double score1 = Double.parseDouble(score1Field.getText());
                double weight1 = Double.parseDouble(weight1Field.getText());
                double score2 = Double.parseDouble(score2Field.getText());
                double weight2 = Double.parseDouble(weight2Field.getText());
                double score3 = Double.parseDouble(score3Field.getText());
                double weight3 = Double.parseDouble(weight3Field.getText());
                double score4 = Double.parseDouble(score4Field.getText());
                double weight4 = Double.parseDouble(weight4Field.getText());

                // Calculate weighted average
                double weightedAverage = (score1 * weight1 + score2 * weight2 + score3 * weight3 + score4 * weight4) /
                        (weight1 + weight2 + weight3 + weight4);

                // Display result
                resultLabel.setText(String.format("Weighted Average: %.2f", weightedAverage));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(lab4.this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new lab4().setVisible(true);
            }
        });
    }
}
