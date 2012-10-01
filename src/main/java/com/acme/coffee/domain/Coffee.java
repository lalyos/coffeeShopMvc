package com.acme.coffee.domain;

public class Coffee {

    private String name;
    private Integer price;
    private String imageUrl;

    public Coffee(){
        
    }
    
    public Coffee(String name, Integer price, String imageUrl) {
        super();
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Coffee [name=" + name + ", price=" + price + ", imageUrl=" + imageUrl + "]";
    }    
}
