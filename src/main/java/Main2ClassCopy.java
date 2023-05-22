import javax.swing.*;

public class Main2ClassCopy {

    public static void main(String[] args) {
        String title;
        String text;
        title = JOptionPane.showInputDialog("Enter text");

        text = JOptionPane.showInputDialog("Enter text");
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }

}
