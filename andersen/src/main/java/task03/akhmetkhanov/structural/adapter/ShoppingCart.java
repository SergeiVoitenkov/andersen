package task03.akhmetkhanov.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    public List<Product> getCart() {
        return cart;
    }

    public void add(Product product) {
        cart.add(product);
    }

}
