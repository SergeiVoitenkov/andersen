package task03.akhmetkhanov.structural.adapter;

public class ShoppingCartAdapter extends ShoppingCart {

    @Override
    public void add(Product product) {
        double weightInKilos = product.getWeight();
        double weightInPounds = weightInKilos * 2.205;
        super.add(new Product(product.getName(), weightInPounds));
    }
}
