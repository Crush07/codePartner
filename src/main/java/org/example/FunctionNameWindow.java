package org.example;

import java.awt.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FunctionNameWindow extends JFrame {
    private JTextField inputField;
    private JTextField inputField1;
    private JTextArea displayArea;

    public FunctionNameWindow() {
        setTitle("Function Name Window");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(20);
        inputField1 = new JTextField(20);
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        inputField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                updateText();
            }

            public void removeUpdate(DocumentEvent e) {
                updateText();
            }

            public void changedUpdate(DocumentEvent e) {
                updateText();
            }

            private void updateText() {
                String functionName = inputField.getText();
                displayArea.setText(functionName);
            }
        });


        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(inputField, gbc);
        add(inputField, gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(inputField1, gbc);
        add(inputField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.insets = new Insets(10, 10, 10, 10);
        gridBagLayout.setConstraints(scrollPane, gbc);
        add(scrollPane, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FunctionNameWindow::new);
    }
}
