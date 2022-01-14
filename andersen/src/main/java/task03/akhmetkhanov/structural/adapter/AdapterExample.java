package task03.akhmetkhanov.structural.adapter;

/**
 * Assume that you are a customer from Russia wishing to order some goods from American internet shop.
 * And you are required to write weight for some products while ordering them to concrete product quantity.
 * But the website only works with imperial system, you can understand only metric system which website can't work with.
 * The adapter class allows you to write quantity in kilograms, converting them to pounds understandable for the website.
 */
public class AdapterExample {
    public static void main(String[] args) {
        /**
         * Without adapter customer orders goods in kilograms but gets them in pounds - about twice less than he wanted.
         */
        ShoppingCart cart = new ShoppingCart();
        InternetShop shop = new InternetShop(cart);

        cart.add(new Product("product1", 1));
        cart.add(new Product("product2", 2));
        cart.add(new Product("product3", 0.5));

        shop.showCart();
        System.out.println("\n============================");

        /**
         * Now with adapter:
         */
        ShoppingCart adapterCart = new ShoppingCartAdapter();
        shop.setCart(adapterCart);
        adapterCart.add(new Product("product1", 1));
        adapterCart.add(new Product("product2", 2));
        adapterCart.add(new Product("product3", 0.5));

        shop.showCart();

    }
}
