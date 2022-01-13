package task03.akhmetkhanov.creational.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Book book = new Book(
                "One Hundred Years of Solitude",
                "Gabriel Garcia Marquez",
                378,
                1967,
                Genre.NOVEL
        );

        Book copy = (Book) book.copy();

        System.out.println("Original and copy are same objects: " + (book == copy));
        System.out.println("Original and copy are equal: " + book.equals(copy));
    }
}
