package model;

public class Product {
    private int id;
    private String name;
    private int productPrice;
    private String describe;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, int productPrice, String describe, String producer) {
        this.id = id;
        this.name = name;
        this.productPrice = productPrice;
        this.describe = describe;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}
