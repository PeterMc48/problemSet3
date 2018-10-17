import javax.swing.*;
import java.awt.*;

public class HouseDrive {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);
        String text = " ";


        int amontForSale = Integer.parseInt(JOptionPane.showInputDialog("How many houses would you like to sell: "));

        House[] house = new House[amontForSale];
        Person person;
        House houses;
        House noValue = new House();
        System.out.print(noValue.toString());

        for(int i =0;i<house.length;i++)
        {
            String address = JOptionPane.showInputDialog("Whats the address: ");
            String type = JOptionPane.showInputDialog("What type of house is it: ");
            double price = Double.parseDouble(JOptionPane.showInputDialog("What is the price: "));
            String name = JOptionPane.showInputDialog("Owners name; ");
            person = new Person(name);
            houses = new House(address,type,price,person);
            house[i] = houses;
        }
        for(House h: house)
        {
            text += h.toString();
        }
        textArea.append(text);

        JOptionPane.showMessageDialog(null,text);
    }
}
