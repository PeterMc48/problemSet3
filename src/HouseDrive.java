import javax.swing.*;
import java.awt.*;

public class HouseDrive {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);
        String text = " ";
        House house = new House();
        House[] houses = new House[];
        House.populateHouses();
        House.readHouses(hou);
     /*   int amontForSale = Integer.parseInt(JOptionPane.showInputDialog("How many houses would you like to sell: "));

        House[] house = new House[amontForSale];
        Person person;
        House houses;
        House noValue = new House();

        for(int i =0;i<house.length;i++)
        {
            String address = JOptionPane.showInputDialog("Whats the address: ");
            String type = JOptionPane.showInputDialog("What type of house is it: ");
            double price = Double.parseDouble(JOptionPane.showInputDialog("What is the price: "));
            if(price < 0)
            {
                price = noValue.getPrice();
            }
            String name = JOptionPane.showInputDialog("Owners name; ");
            person = new Person(name);
            houses = new House(address,type,price,person);
            house[i] = houses;
        }*/
       /* for(House h: house)
        {
            text += h.toString();
        }*/
        textArea.append(text);

        JOptionPane.showMessageDialog(null,text);
    }
}
