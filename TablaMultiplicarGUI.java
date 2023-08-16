import javax.swing.*;

public class TablaMultiplicarGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tabla de Multiplicar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            JLabel label = new JLabel("Ingresa un número:");
            JTextField textField = new JTextField(10);
            JButton button = new JButton("Generar Tabla");
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);

            button.addActionListener(e -> {
                try {
                    int numero = Integer.parseInt(textField.getText());
                    StringBuilder tabla = new StringBuilder();
                    tabla.append("Tabla de multiplicar del ").append(numero).append(":\n");

                    for (int i = 1; i <= 10; i++) {
                        int resultado = numero * i;
                        tabla.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
                    }

                    textArea.setText(tabla.toString());
                } catch (NumberFormatException ex) {
                    textArea.setText("Ingresa un número válido.");
                }
            });

            panel.add(label);
            panel.add(textField);
            panel.add(button);
            panel.add(new JScrollPane(textArea));

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}

