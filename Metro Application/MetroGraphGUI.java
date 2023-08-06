import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetroGraphGUI {
    private JFrame frame;
    private JTextArea outputArea;
    private JTextField sourceField;
    private JTextField destinationField;
    private Metro_Graph metroGraph;

    public MetroGraphGUI() {
        metroGraph = new Metro_Graph();
        Metro_Graph.Create_Metro_Map(metroGraph);

        frame = new JFrame("Delhi Metro Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel sourceLabel = new JLabel("Source Station:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(sourceLabel, gbc);

        sourceField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        inputPanel.add(sourceField, gbc);

        JLabel destinationLabel = new JLabel("Destination Station:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(destinationLabel, gbc);

        destinationField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        inputPanel.add(destinationField, gbc);

        JButton calculateButton = new JButton("Calculate Shortest Distance");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String source = sourceField.getText();
                String destination = destinationField.getText();
                String result = getShortestDistance(source, destination);
                outputArea.setText(result);
            }
        });
        inputPanel.add(calculateButton, gbc);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    private String getShortestDistance(String source, String destination) {
        HashMap<String, Boolean> processed = new HashMap<>();
        if (!metroGraph.containsVertex(source) || !metroGraph.containsVertex(destination) || !metroGraph.hasPath(source, destination, processed))
            return "Invalid input or no path exists.";

        ArrayList<String> str = metroGraph.get_Interchanges(metroGraph.Get_Minimum_Distance(source, destination));
        StringBuilder result = new StringBuilder();
        result.append("Source Station: ").append(source).append("\n");
        result.append("Destination Station: ").append(destination).append("\n");
        result.append("Total Distance: ").append(str.get(str.size() - 1)).append(" KM").append("\n");
        result.append("Number of Interchanges: ").append(str.get(str.size() - 2)).append("\n\n");
        result.append("Shortest Path: ").append("\n");
        for (int i = 0; i < str.size() - 3; i++) {
            result.append(str.get(i)).append(" => ");
        }
        result.append(str.get(str.size() - 3));

        return result.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MetroGraphGUI();
            }
        });
    }
}
