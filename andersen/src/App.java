
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Headers;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


public class App {

    public static void main(String[] args) {

        MyLinked<String> list = new MyLinked<>();
        list.add("46664");
        list.add("7995");
        System.out.println(list);

        MyArrayList<User> myArrayList = new MyArrayList<>();
        myArrayList.add(new User("C", 1));
        myArrayList.add(new User("D", 2));
        myArrayList.add(new User("A", 3));
        myArrayList.add(new User("R", 4));

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

        myArrayList.sort(comparator);
        System.out.println(myArrayList);
        User user = new User("ffgfdh", 2);
        User user1 = new User("qqqq", 22);
        myArrayList.add(user);
        System.out.println(myArrayList);
        myArrayList.remove(user);
        System.out.println(myArrayList);
        myArrayList.set(1,user1);
        System.out.println(myArrayList);
        myArrayList.remove(2);
        System.out.println(myArrayList);
    }
}
