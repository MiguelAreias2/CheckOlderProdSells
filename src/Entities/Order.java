package Entities;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String customerName;
    private String contact;
    private String shippingAdress;
    private int grandTotal;
    private Date placedOrder;

    private ArrayList<Item> items;


    public Order(String customerName, String contact, String shippingAdress, int grandTotal, Date placedOrder, ArrayList<Item> items) {
        this.customerName = customerName;
        this.contact = contact;
        this.shippingAdress = shippingAdress;
        this.grandTotal = grandTotal;
        this.placedOrder = placedOrder;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getShippingAdress() {
        return shippingAdress;
    }

    public void setShippingAdress(String shippingAdress) {
        this.shippingAdress = shippingAdress;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Date getPlacedOrder() {
        return placedOrder;
    }

    public void setPlacedOrder(Date placedOrder) {
        this.placedOrder = placedOrder;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
