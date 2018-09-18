package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

/**
 * TODO: comment
 *
 * @author stefan.billet@qaware.de
 * @since 18.09.2018
 */
public class Coffee {
    private int coffeeId;
    private String brand;
    private String image;

    public Coffee(int coffeeId, String brand, String image) {
        this.coffeeId = coffeeId;
        this.brand = brand;
        this.image = image;
    }

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
