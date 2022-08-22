package model;

public class Product {
    private int id;
    private String name;
    private int productprice;
    private String describe;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, int productprice, String describe, String producer) {
        this.id = id;
        this.name = name;
        this.productprice = productprice;
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

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
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
