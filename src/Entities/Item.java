package Entities;

public class Item {
    private float cost;
    private float shippingFee;
    private float taxAmount;
    private int amount;
    private Product product;

    public Item(float cost, float shippingFee, float taxAmount, int amount, Product product) {
        this.cost = cost;
        this.shippingFee = shippingFee;
        this.taxAmount = taxAmount;
        this.amount = amount;
        this.product = product;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(float shippingFee) {
        this.shippingFee = shippingFee;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
