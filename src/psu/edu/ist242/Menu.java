package psu.edu.ist242;

//Use arraylist to contain menu
public class Menu {
    private String name;
    private double price;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public Menu (String _name, double _price){
        this.name = _name;
        this.price = _price;
    }
}
