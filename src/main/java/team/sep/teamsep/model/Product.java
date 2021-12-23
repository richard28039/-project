package team.sep.teamsep.model;

public class Product {

    private long id;

    private String name;

    private int stock;

    private int price;

    private int quantity;

    private String picture;

    private String pay;

    private String deliver;

    public Product() {
    }

    public Product(long id, String name,int stock, int price,int quantity, String picture,String pay,String deliver) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price =  price;
        this.quantity = quantity;
        this.picture = picture;
        this.pay =pay;
        this.deliver=deliver;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstock(){
        return stock;
    }

    public void setInstock(int stock){
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }
}
