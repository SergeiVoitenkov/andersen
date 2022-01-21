package task04.classes.voitenkov.local_inner_class;

public class Math {

    public void getResult(final int divisible, final int divider) {
        class Division {
            public int getPrivately() {
                return divisible / divider;
            }

            public int getResidue() {
                return divisible % divider;
            }
        }

        Division division = new Division();

        System.out.println("Делимое: " + divisible);
        System.out.println("Делитель: " + divider);
        System.out.println("Частное: " + division.getPrivately());
        System.out.println("Остаток: " + division.getResidue());
    }
}
