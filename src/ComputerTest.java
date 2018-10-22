import javax.swing.*;

public class ComputerTest{
    public static void main(String[] args) {
        Computer computer = new Computer("1","dell","DDR2",3);
        Laptop laptop = new Laptop("2","Acer","SSD",500,true);

        JOptionPane.showMessageDialog(null,computer.toString());
        JOptionPane.showMessageDialog(null,laptop.toString());
    }
}
