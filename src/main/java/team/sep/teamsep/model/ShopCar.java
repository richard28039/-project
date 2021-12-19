package team.sep.teamsep.model;

public class ShopCar {

    private long id;

    private String name;

    private int stock;

    private int price;

    private int quantity;

    private String picture;

    public ShopCar() {
    }

    public ShopCar(long id, String name,int stock, int price,int quantity, String picture) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price =  price;
        this.quantity = quantity;
        this.picture = picture;
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
}
