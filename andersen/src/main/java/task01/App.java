package task01;

import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        MyArrayList<User> myArrayList = new MyArrayList<>();

        myArrayList.add(0, "Karol");
        myArrayList.add(1, "Vanessa");
        myArrayList.add(2, "Amanda");

        myArrayList.add(1, "Mariana");

        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());


        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (o1.getAge() - o2.getAge());
//                if ((o1.getAge() - o2.getAge()) == 0) {
//                    return o1.getName().compareTo(o2.getName());
//                } else {
//                    return o1.getAge() - o2.getAge();
//                }
            }
        };
    }
}
