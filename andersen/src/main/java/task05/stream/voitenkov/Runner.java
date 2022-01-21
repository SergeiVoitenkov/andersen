package task05.stream.voitenkov;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Bob", 15, "1", "Bobby"));
        humans.add(new Human("Bob2", 17, "2", "Bobby2"));
        humans.add(new Human("Bob3", 25, "3", "Bobby3"));
        humans.add(new Human("Bob4", 31, "4", "Bobby4"));
        humans.add(new Human("Bob5", 18, "5", "Bobby5"));

        Map<String, List<String>> adultPeople = humans.stream()
                .peek(human -> human.setAge(human.getAge() + 1))
                .filter(human -> human.getAge() > 18)
                .collect(Collectors.toMap
                        (
                                Human::getId,
                                human -> List.of(human.getName(), human.getSurname())
                        ));

        Map<String, String> humanNameConcatSurname = adultPeople.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get(0).concat(e.getValue().get(1))));

        System.out.println(humans);
        System.out.println(adultPeople);
        System.out.println(humanNameConcatSurname);
    }
}
