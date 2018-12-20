package psu.edu.ist242;

//Order Info
public class Order {
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public Order (int _quantity){
        this.quantity = _quantity;
    }

}
