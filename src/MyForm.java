import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame{
    private JPanel panel1;
    private JPanel northButtons;
    private JButton archive;
    private JButton save;
    private JButton validation;
    private JButton settings;
    private JPanel leftNorthPanel;
    private JPanel rightNorthPanel;
    private JScrollPane scroll;
    private JTabbedPane config;
    private JTree tree1;

    public MyForm() {
        setContentPane(panel1);
        setTitle("Apache VHost Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 400));
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }
}
