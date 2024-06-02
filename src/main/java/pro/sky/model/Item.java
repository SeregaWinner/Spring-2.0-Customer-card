package pro.sky.model;

import java.util.Objects;


public class Item {

    private final int  productIdentifier;
    private final String title;

    public Item(Integer productIdentifier, String title) {
        this.productIdentifier = productIdentifier;
        this.title = title;
    }

    public int getProductIdentifier() {
        return productIdentifier;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item basket = (Item) o;
        return Objects.equals(getProductIdentifier(), basket.getProductIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductIdentifier());
    }
}