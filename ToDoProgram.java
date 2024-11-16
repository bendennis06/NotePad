import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoProgram {
    public ToDoProgram() {

        // Create the Main Frame
        JFrame frame = new JFrame("To Do Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // Title Panel
        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("To Do List");
        titlePanel.add(title);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(titlePanel, BorderLayout.NORTH);

        // Create the panel to hold tasks (scrollable content)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Scrollable feature
        JScrollPane scrollPanel = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        JButton addTaskButton = new JButton("Add Task");
        buttonPanel.add(addTaskButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Button Action Listener
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a new text field
                JTextField textField = new JTextField();
                textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); // Stretch horizontally
                textField.setAlignmentX(Component.LEFT_ALIGNMENT);             // Align to the left
                panel.add(textField); // Add the text field to the panel

                // Update UI
                panel.revalidate();
                panel.repaint();
            }
        });

        // Show the frame
        frame.setVisible(true);
    }

}
