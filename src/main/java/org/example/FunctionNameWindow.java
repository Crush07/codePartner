import java.awt.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.*;

public class FunctionNameWindow extends JFrame {
    private JTextField inputField;
    private JTextArea displayArea;

    public FunctionNameWindow() {
        setTitle("Function Name Window");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(20);
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        inputField.addInputMethodListener(new InputMethodListener() {
            public void caretPositionChanged(InputMethodEvent e) {
                // 处理光标位置变化事件
                String functionName = inputField.getText();
                displayArea.setText(functionName);
            }

            public void inputMethodTextChanged(InputMethodEvent e) {
                String functionName = inputField.getText();
                displayArea.setText(functionName);
            }
        });

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 0, 0, 0);
        add(inputField, gbc);

        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(scrollPane, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FunctionNameWindow());
    }
}