package pro.sky.model;

import java.util.Objects;


public class Item {

    private final Integer  productIdentifier;


    public Item(Integer productIdentifier) {
        this.productIdentifier = productIdentifier;

    }

    public int getProductIdentifier() {
        return productIdentifier;
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