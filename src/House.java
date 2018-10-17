import javax.swing.*;

public class House {
    private String address;
    private String type;
    private double price;
    private Person Person;

    public double getPrice() {
        return price;
    }

    public Person getPerson() {
        return Person;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setPerson(Person person) {
        Person = person;
    }

    public void setPrice(double price) {
        if(price < 0)
        {
            this.setPrice(0.0);
        }
        else
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    public House()
    {
        this.setAddress("No Address Specified");
        this.setType("No Type Specified");
        this.setPrice(0.0f);
    }
    public House(String address,String type,double price,Person name)
    {
        this.setAddress(address);
        this.setType(type);
        this.setPrice(price);
        this.setPerson(name);

    }
    /*public static  void populateHouses()
    {
        int amontForSale = Integer.parseInt(JOptionPane.showInputDialog("How many houses would you like to sell: "));

        House[] house = new House[amontForSale];
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
            Person person = new Person(name);
            houses = new House(address,type,price,person);
            house[i] = houses;
        }


    }
    public static void readHouses(House[] house)
    {
        String text = "";
        for(House h: house)
        {
            text += h.toString();
        }

    }*/

    //@Override
    public String toString() {
        return "Address: " + address + "\nType: "+ type + "\nPrice: "+ price + "\n"+Person+"\n";
    }
}
