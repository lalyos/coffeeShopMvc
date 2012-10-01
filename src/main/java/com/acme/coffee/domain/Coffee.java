package com.acme.coffee.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Coffee {

    @NotNull
    private String name;
    @NotNull
    @Min(100)
    private Integer price;
    @NotNull
    @Pattern(regexp="http:.*", message="please enter an url starting with http")
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
