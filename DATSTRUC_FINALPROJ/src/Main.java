import javax.swing.*;

public class Main extends JFrame {

    Main() {
        setUndecorated(true);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        new Panel(this);
    }

    public static void main(String[] args) {
        System.out.println("Hello nigga");
        JOptionPane.showInputDialog("No Bitches?");
        new Main();
    }
}
