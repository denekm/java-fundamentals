import java.util.ArrayList;

public class Shop {

    private String name;
    private String description;
    private int priceCategory;

    ArrayList<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceCategory=" + priceCategory +
                ", reviews=" + reviews +
                '}';
    }
}
