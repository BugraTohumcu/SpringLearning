import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponentExample extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JTextArea textArea;
    private JButton button;
    private JCheckBox checkBox;
    private JComboBox<String> comboBox;
    private JList<String> list;
    private JRadioButton radioButton1, radioButton2;
    private ButtonGroup radioGroup;
    private JTable table;

    public SwingComponentExample() {
        // Set up the frame
        setTitle("Swing Component Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Using BorderLayout for the main frame
        setLayout(new BorderLayout());

        // North: Label and TextField
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        label = new JLabel("Enter some text:");
        northPanel.add(label);
        textField = new JTextField(20);
        northPanel.add(textField);
        add(northPanel, BorderLayout.NORTH);

        // Center: Table and Text Area with ScrollPane
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column

        // Table data
        String[] columnNames = {"Name", "Age", "City"};
        Object[][] data = {
                {"Alice", 25, "New York"},
                {"Bob", 30, "Los Angeles"},
                {"Charlie", 28, "Chicago"}
        };

        table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        centerPanel.add(tableScrollPane, BorderLayout.CENTER);

        textArea = new JTextArea(5, 20);
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);
        centerPanel.add(textAreaScrollPane, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // South: Radio buttons and Grouped Panel
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());

        // Radio buttons with grouping
        radioButton1 = new JRadioButton("Option 1");
        radioButton2 = new JRadioButton("Option 2");
        radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        southPanel.add(radioButton1);
        southPanel.add(radioButton2);

        // Panel for grouping components with GridLayout
        JPanel groupedPanel = new JPanel();
        groupedPanel.setBorder(BorderFactory.createTitledBorder("Grouped Components"));
        groupedPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
        groupedPanel.add(new JLabel("A label in the group"));
        groupedPanel.add(new JButton("Button in the group"));
        southPanel.add(groupedPanel);
        add(southPanel, BorderLayout.SOUTH);

        // West: Button and CheckBox
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
        button = new JButton("Click me!");
        westPanel.add(button);
        checkBox = new JCheckBox("Check me!");
        westPanel.add(checkBox);
        add(westPanel, BorderLayout.WEST);

        // East: ComboBox and List with ScrollPane
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
        comboBox = new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3"});
        eastPanel.add(comboBox);
        list = new JList<>(new String[]{"Apple", "Banana", "Orange", "Grape", "Mango", "Pineapple"});
        JScrollPane listScrollPane = new JScrollPane(list);
        eastPanel.add(listScrollPane);
        add(eastPanel, BorderLayout.EAST);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            textArea.append("Input text: " + text + "\n");
        }
    }

    public static void main(String[] args) {
        new SwingComponentExample();
    }
}
