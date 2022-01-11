import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import task01.MyList;
import task02.MyLinkedList;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinkedListTest {

    private MyList<Integer> list = new MyLinkedList<>();

    @Test
    @Order(1)
    void testAddIntoEmptyList() {
        list.add(93);

        assertEquals(1, list.size());
        assertEquals(93, list.get(0).intValue());
    }

    @Test
    @Order(2)
    void testGetFirstElementFromSingleElementList() {
        list.add(11);

        int element = list.get(0);

        assertEquals(11, element);
    }

    @Test
    @Order(3)
    void testAddElements() {
        list = new MyLinkedList<>();
        list.add(28);
        list.add(123);
        list.add(84);

        assertEquals(3, list.size());
        assertEquals(28, list.get(0).intValue());
        assertEquals(123, list.get(1).intValue());
        assertEquals(84, list.get(2).intValue());
    }


    @Test
    @Order(4)
    void testGetElements() {
        list = new MyLinkedList<>();
        list.add(11);
        list.add(57);
        list.add(45);

        int firstElement = list.get(0);
        int secondElement = list.get(1);
        int thirdElement = list.get(2);

        assertEquals(11, firstElement);
        assertEquals(57, secondElement);
        assertEquals(45, thirdElement);
    }

    @Test
    @Order(5)
    void testGetFirstElementFromEmptyList() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    @Order(6)
    void testGetElementByNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    @Order(7)
    void testGetElementByIndexEqualsToListSize() {
        list = new MyLinkedList<>();
        list.add(33);
        list.add(46);
        list.add(11);
        list.add(57);
        list.add(45);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
    }

    @Test
    @Order(8)
    void testAddElementByZeroIndexIntoEmptyList() {
        list.add(0, 45);

        assertEquals(1, list.size());
        assertEquals(45, list.get(0).intValue());
    }

    @Test
    @Order(9)
    void testAddElementByIndexToTheEndOfList() {
        list = new MyLinkedList<>();
        list.add(98);
        list.add(64);
        list.add(23);
        list.add(1);
        list.add(3);
        list.add(4);

        int newElementIndex = list.size();
        list.add(newElementIndex, 44);

        assertEquals(44, list.get(newElementIndex).intValue());
        assertEquals(7, list.size());
    }

    @Test
    @Order(10)
    void testAddElementToTheHeadOfNonEmptyList() {
        list = new MyLinkedList<>();
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(0);
        list.add(2);

        list.add(0, 53);

        assertEquals(53, list.get(0).intValue());
        assertEquals(4, list.get(1).intValue());
        assertEquals(7, list.size());
    }

    @Test
    @Order(11)
    void testAddElementByIndex() {
        list = new MyLinkedList<>();
        list.add(28);
        list.add(5);
        list.add(6);
        list.add(8);

        int newElementIdx = 2;
        list.add(newElementIdx, 66);

        assertEquals(66, list.get(newElementIdx).intValue());
        assertEquals(28, list.get(0).intValue());
        assertEquals(5, list.get(1).intValue());
        assertEquals(6, list.get(3).intValue());
        assertEquals(8, list.get(4).intValue());
        assertEquals(5, list.size());
    }

    @Test
    @Order(12)
    void testAddElementByNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 66));

    }

    @Test
    @Order(13)
    void testAddElementByIndexLargerThanListSize() {
        list = new MyLinkedList<>();
        list.add(4);
        list.add(6);
        list.add(11);
        list.add(9);

        int newElementIdx = 5;
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(newElementIdx, 88));
    }

    @Test
    @Order(14)
    void testAddElementByIndexEqualToSize() {
        list = new MyLinkedList<>(); // size = 5
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(5, 111);

        assertEquals(6, list.size());
        assertEquals(111, list.get(5).intValue());
    }

    @Test
    @Order(15)
    void testSetFirstElementOnEmptyTree() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(0, 34));
    }

    @Test
    @Order(16)
    void testSetElementByIndexEqualToSize() {
        list = new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, 222));
    }

    @Test
    @Order(17)
    void testSetElementByIndex() {
        list = new MyLinkedList<>();
        list.add(34);
        list.add(78);
        list.add(9);
        list.add(8);

        int index = 2; //element = 78
        list.set(index, 99);

        assertEquals(99, list.get(index).intValue());
        assertEquals(34, list.get(0).intValue());
        assertEquals(78, list.get(1).intValue());
        assertEquals(8, list.get(3).intValue());
        assertEquals(4, list.size());

    }

    @Test
    @Order(18)
    void testRemoveElementFromEmptyList() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(234));
    }

    @Test
    @Order(19)
    void testRemoveFirstElement() {
        list = new MyLinkedList<>();
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);

        list.remove(0);

        assertEquals(6, list.get(0).intValue());
        assertEquals(3, list.size());
    }

    @Test
    @Order(20)
    void testRemoveLastElement() {
        list = new MyLinkedList<>();
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);

        list.remove(list.size() - 1);

        assertEquals(8, list.get(list.size() - 1).intValue());
        assertEquals(3, list.size());
    }

    @Test
    @Order(21)
    void testRemoveElement() {
        list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int elementIndex = 2;
        list.remove(elementIndex); // element = 3

        assertEquals(4, list.get(elementIndex).intValue());
        assertEquals(4, list.size());
    }

    @Test
    @Order(22)
    void testSizeOnEmptyList() {
        int size = list.size();

        assertEquals(0, size);
    }

    @Test
    @Order(23)
    void testSize() {
        list = new MyLinkedList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(7);

        int size = list.size();

        assertEquals(5, size);
    }

    @Test
    @Order(24)
    void testSort() {
        list = new MyLinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1);

        Comparator<Integer> comparatorLinked = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 - o2);
            }
        };
        list.sort(comparatorLinked);

        assertEquals(1, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(3, list.get(3));
        assertEquals(4, list.get(4));
        assertEquals(5, list.get(5));
    }
}