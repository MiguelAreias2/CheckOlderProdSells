package Entities;

import java.util.Date;

public class Product {
    private String name;
    private String category;
    private String weight;
    private Float price;
    private Date creationDate;

    public Product(String name, String category, String weight, Float price, Date creationDate) {
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
