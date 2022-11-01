package collections;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;

    ArrayList<Review> reviews = new ArrayList<>() ;

    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCategory +
                '}';
    }
}