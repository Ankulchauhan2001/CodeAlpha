import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCountApp {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Word Count Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Create a JLabel for instruction
        JLabel label = new JLabel("Enter a paragraph:");
        panel.add(label);

        // Create a JTextArea for user input
        JTextArea textArea = new JTextArea(5, 30);
        panel.add(textArea);

        // Create a JButton to count words
        JButton countButton = new JButton("Count Words");
        panel.add(countButton);

        // Create a JLabel to display the word count
        JLabel resultLabel = new JLabel("Word count: ");
        panel.add(resultLabel);

        // Add an action listener to the countButton
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String paragraph = textArea.getText();
                int wordCount = countWords(paragraph);
                resultLabel.setText("Word count: " + wordCount);
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Function to count words in a paragraph
    public static int countWords(String paragraph) {
        // Split the paragraph into words using whitespace as a delimiter
        String[] words = paragraph.split("\\s+");
        return words.length;
    }
}
