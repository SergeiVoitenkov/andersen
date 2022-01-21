package task04.classes.voitenkov.anonymous_class;

public class AnonymousClass {
    private final int x = 5;

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            final AnonymousClass anonymousClass = new AnonymousClass();

            @Override
            public int getResult(int a, int b) {
                return a + b + anonymousClass.x;
            }
        };

        System.out.println(anonymous.getResult(3, 9));

        Anonymous anonymous2 = new Anonymous() {
            @Override
            public int getResult(int a, int b) {
                return a * b;
            }
        };

        System.out.println(anonymous2.getResult(3, 9));
    }
}

interface Anonymous {
    int getResult(int a, int b);
}
