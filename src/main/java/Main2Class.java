import javax.swing.*;

public class Main2Class {

    public static void main(String[] args) {
        String title;
        String text;
        title = JOptionPane.showInputDialog(null,"Имя для окна:", "Название", JOptionPane.WARNING_MESSAGE);

        text = JOptionPane.showInputDialog(null, "Текст сообщения:", "Содержание", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }

}
