/*
Project: Lab 9
Purpose Details: Make Pizza Ordering Application
Course: IST 242
Author: David Chen
Date Developed: 3/17/2018
Last Date Changed: 3/24/2018
Rev:
*/

package psu.edu.ist242;
import java.util.ArrayList;
import java.util.Scanner;

//Uses other classes and prompts user for inputs
//Use switch statements to access other classes or maybe quit??
//Use boolean statements to check for validations
//Have counter for orderID??
public class Lab9Chen {
    public static void main(String[] args) {
        int numIn = 1;
        /***************************************Making the Menu***************************************/
        ArrayList<Menu> items = new ArrayList<Menu>();
        Menu cheese = new Menu("Cheese Pizza x" + numIn, 1.25 * numIn);
        items.add(cheese);
        Menu sausage = new Menu("Sausage Pizza x" + numIn, 1.50 * numIn);
        items.add(sausage);
        Menu pineapple = new Menu("Pineapple Pizza x" + numIn, 1.35 * numIn);
        items.add(pineapple);
        /*********************************************************************************************/
        Customer cust = new Customer("", "", "");
        ArrayList<Menu> _order = new ArrayList<Menu>();
        Transaction transaction = new Transaction("");
        long orderid = 0;
        int num1,num2 ;
        do {
            Order order = new Order(0);
            Scanner input = new Scanner(System.in); // Input stream for standard input
            System.out.println("Please select an option");
            System.out.println("1. Add/Edit all customer information");
            System.out.println("2. Edit specific customer information");
            System.out.println("3. Place/Edit order");
            System.out.println("4. Payment method");
            System.out.println("5. Finish order");
            num1 = input.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("Please enter \"first name, last name, and street name\" separated by a space.");
                    input.nextLine();
                    String lineIn = input.nextLine();
                    String[] seq = lineIn.split(" ");
                    if (seq.length == 3) {
                        cust.setCustFirstName(seq[0]);
                        cust.setCustLastName(seq[1]);
                        cust.setStreetName(seq[2]);
                        System.out.printf("Your customer information: \nFirst Name: %s\nLast Name: %s\nStreet Name: %s\n", cust.getCustFirstName(), cust.getCustLastName(), cust.getStreetName());
                    }
                    break;
                case 2:
                    System.out.printf("Your current customer information: \nFirst Name: %s\nLast Name: %s\nStreet Name: %s\n", cust.getCustFirstName(), cust.getCustLastName(), cust.getStreetName());
                    System.out.println("Please select an option");
                    System.out.println("1. Edit first name");
                    System.out.println("2. Edit last name");
                    System.out.println("3. Edit street name");
                    System.out.println("Any other number to exit");
                    num2 = input.nextInt();
                    switch (num2) {
                        case 1:
                            System.out.println("Please enter a new first name:");
                            input.nextLine();
                            lineIn = input.nextLine();
                            cust.setCustFirstName(lineIn);
                            break;
                        case 2:
                            System.out.println("Please enter a new last name:");
                            input.nextLine();
                            lineIn = input.nextLine();
                            cust.setCustLastName(lineIn);
                            break;
                        case 3:
                            System.out.println("Please enter a new street name:");
                            input.nextLine();
                            lineIn = input.nextLine();
                            cust.setStreetName(lineIn);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Items on the menu\nPlease select which order you want.\n");
                    for (int i = 0; i < items.size(); i++) {
                        int counter = i + 1;
                        System.out.printf("%d. %s   |   Price: %.2f \n", counter, items.get(i).getName(), items.get(i).getPrice());
                    }
                    System.out.println("Any other number to exit");
                    num2 = input.nextInt();
                    switch (num2) {
                        case 1:
                            System.out.println("Please enter how many you want to order.\nTo remove order, enter \"0\".");
                            numIn = input.nextInt();
                            order.setQuantity(numIn);
                            Menu ordercheese = new Menu("Cheese Pizza x" + numIn, 1.25 * numIn);
                            if (order.getQuantity() > 0){
                                _order.add(ordercheese);
                            } else if (order.getQuantity() == 0) {
                                for (int i = 0; i < _order.size(); i++) {
                                    if (_order.get(i).getName().startsWith("Cheese Pizza x")){
                                        _order.remove(i);
                                    }
                                }
                            } else {
                                break;
                            }
                            break;

                        case 2:
                            System.out.println("Please enter how many you want to order.\nTo remove order, enter \"0\".");
                            numIn = input.nextInt();
                            order.setQuantity(numIn);
                            Menu ordersausage = new Menu("Sausage Pizza x" + numIn, 1.50 * numIn);
                            if (order.getQuantity() > 0){
                                _order.add(ordersausage);
                            } else if (order.getQuantity() == 0) {
                                for (int i = 0; i < _order.size(); i++) {
                                    if (_order.get(i).getName().startsWith("Sausage Pizza x")){
                                        _order.remove(i);
                                    }
                                }
                            } else {
                                break;
                            }
                            break;

                        case 3:
                            System.out.println("Please enter how many you want to order.\nTo remove order, enter \"0\".");
                            numIn = input.nextInt();
                            order.setQuantity(numIn);
                            Menu orderpineapple = new Menu("Pineapple Pizza x" + numIn, 1.35 * numIn);
                            if (order.getQuantity() > 0) {
                                _order.add(orderpineapple);
                            } else if (order.getQuantity() == 0) {
                                for (int i = 0; i < _order.size(); i++) {
                                    if (_order.get(i).getName().startsWith("Pineapple Pizza x")){
                                        _order.remove(i);
                                    }
                                }
                            } else {
                                break;
                            }
                            break;

                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Please enter method of payment: \"credit, debit, or cash\"");
                    input.nextLine();
                    lineIn = input.nextLine();
                    transaction.setTransaction(lineIn);
                    break;
                case 5:
                    System.out.println("Exiting systems...");
                    break;
                default:
                    System.out.println("ERROR! Inputted value not accepted... try again.");
                    break;
            }
        } while (num1 != 5);
        orderid++;
        System.out.printf("Order #: %d.\n", orderid);
        System.out.printf("Your final customer information: \nFirst Name: %s\nLast Name: %s\nStreet Name: %s\n", cust.getCustFirstName(), cust.getCustLastName(), cust.getStreetName());
        System.out.println("Your final orders");
        for (int i = 0; i < _order.size(); i++) {
            System.out.printf("%s\nPrice: %.2f \n", _order.get(i).getName(), _order.get(i).getPrice());
        }
        System.out.printf("Transaction method: %s\n", transaction.getTransaction());
        System.out.println("Goodbye please come again!");
    }
}
