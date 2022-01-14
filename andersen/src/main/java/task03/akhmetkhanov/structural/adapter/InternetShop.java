package task03.akhmetkhanov.structural.adapter;

public class InternetShop {
    private ShoppingCart cart;

    public InternetShop(ShoppingCart cart) {
        this.cart = cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void showCart() {
        System.out.println("Your shopping cart:");
        for (Product p : cart.getCart()) {
            System.out.println(p.getName() + ": " + p.getWeight() + " lb.");
        }
    }
}
