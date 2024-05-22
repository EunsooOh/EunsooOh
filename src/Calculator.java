import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
    private static final String[] BUTTON_LABELS = {
        "BackSpace", "", "", "CE", "C", 
        "7", "8", "9", "/", "sqrt", 
        "4", "5", "6", "x", "%", 
        "1", "2", "3", "-", "1/x", 
        "0", "+/-", ".", "+", "=" 
    };

    private double result = 0;
    private String operator = "";
    private JTextField display;

    public Calculator() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Calculator");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setBackground(Color.WHITE);

        JPanel displayPanel = new JPanel(new GridLayout(1, 1));
        displayPanel.add(display);

        JPanel buttonPanel = createButtonPanel();

        setLayout(new BorderLayout());
        add(displayPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 5, 3, 3));

        for (String label : BUTTON_LABELS) {
            JButton button = createButton(label);
            panel.add(button);
        }

        return panel;
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.setBackground(Color.YELLOW);
        button.setForeground(label.equals("BackSpace") || label.equals("CE") || label.equals("C") ? Color.RED : Color.BLUE);
        button.addActionListener(e -> handleButtonClick(label));
        return button;
    }

    private void handleButtonClick(String label) {
        switch (label) {
            case "BackSpace":
                handleBackspace();
                break;
            case "CE":
                display.setText("");
                break;
            case "C":
                result = 0;
                display.setText("");
                break;
            case "+/-":
                handleToggleSign();
                break;
            case "=":
                calculateResult();
                break;
            case "+":
            case "-":
            case "x":
            case "/":
            case "%":
            case "sqrt":
            case "1/x":
                setOperator(label);
                break;
            default:
                handleNumberOrDecimal(label);
                break;
        }
    }

    private void handleBackspace() {
        String currentText = display.getText();
        if (!currentText.isEmpty()) {
            display.setText(currentText.substring(0, currentText.length() - 1));
        }
    }

    private void handleToggleSign() {
        String currentText = display.getText();
        if (!currentText.isEmpty()) {
            if (currentText.startsWith("-")) {
                display.setText(currentText.substring(1));
            } else {
                display.setText("-" + currentText);
            }
        }
    }

    private void setOperator(String operator) {
        if (!display.getText().isEmpty()) {
            result = Double.parseDouble(display.getText());
            this.operator = operator;
            display.setText("");
        }
    }

    private void handleNumberOrDecimal(String input) {
        display.setText(display.getText() + input);
    }

    private void calculateResult() {
        if (display.getText().isEmpty() || operator.isEmpty()) return;

        double current = Double.parseDouble(display.getText());
        switch (operator) {
            case "+":
                result += current;
                break;
            case "-":
                result -= current;
                break;
            case "x":
                result *= current;
                break;
            case "/":
                if (current != 0) result /= current;
                break;
            case "%":
                result %= current;
                break;
            case "sqrt":
                result = Math.sqrt(result);
                break;
            case "1/x":
                if (result != 0) result = 1 / result;
                break;
        }
        display.setText(String.valueOf(result));
        operator = "";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}