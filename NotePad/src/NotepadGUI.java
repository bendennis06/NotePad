import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadGUI extends JFrame {
    //file explorer
    private JFileChooser fileChooser;

    public NotepadGUI(){
        super("Notepad");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //file chooser setup
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(""));

        addGuiComponents();

    }
    private void addGuiComponents(){
        addToolbar();

        //area to type text into
        JTextArea textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
    }

    private void addToolbar(){
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);

        //menu bar
        JMenuBar menuBar = new JMenuBar();
        toolBar.add(menuBar);

        //add menus
        menuBar.add(addFileMenu());

        add(toolBar, BorderLayout.NORTH);
    }

    private JMenu addFileMenu(){
        JMenu fileMenu = new JMenu("File");

        //"new" functionality - resets everything
        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);

        //"open" functionality - open a text file
        JMenuItem openMenuItem = new JMenuItem("Open");
        fileMenu.add(openMenuItem);

        //"save as" functionality - creates a new text file and saves user text
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
        saveAsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    {

        }
        fileMenu.add(saveAsMenuItem);

        //"save" functionality - saves text into current text file
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);

        //"exit" functionality - ends program
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        return fileMenu;
    }
}
