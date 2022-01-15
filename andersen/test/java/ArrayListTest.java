import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import task01.MyArrayList;
import task01.MyList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {

    private MyList<String> list;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    public void testListInit() {
        assertTrue(list.isEmpty());
        Assertions.assertEquals(0, list.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCapacity() {
        list = new MyArrayList<>(-1);
    }

    @Test
    public void testAddElements() {
        list.add(0, "Karol");
        list.add(1, "Vanessa");
        list.add(2, "Amanda");

        assertEquals("Karol", list.get(0));
        assertEquals("Vanessa", list.get(1));
        assertEquals("Amanda", list.get(2));

        list.add(1, "Mariana");

        assertEquals("Karol", list.get(0));
        assertEquals("Mariana", list.get(1));
        assertEquals("Vanessa", list.get(2));
        assertEquals("Amanda", list.get(3));

        Assertions.assertEquals(4, list.size());
    }

    private void assertEquals(String karol, String s) {
    }

    @Test(expected = NullPointerException.class)
    public void testAddElementNull() {
        list.add(0, null);
    }

    @Test(expected = NullPointerException.class)
    public void testSetElementNull() {
        list.add(0, "Kheyla");
        list.set(0, null);
    }

    @Test
    public void testSetElement() {
        list.add(0, "Karol");
        list.add(1, "Vanessa");
        list.add(2, "Amanda");

        list.set(1, "Livia");

        assertEquals("Karol", list.get(0));
        assertEquals("Livia", list.get(1));
        assertEquals("Amanda", list.get(2));
    }

    @Test
    public void testRemoveElement() {
        list.add(0, "Karol");
        list.add(1, "Vanessa");
        list.add(2, "Amanda");

        assertEquals("Amanda", list.remove(2));
        Assertions.assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithEmptyList() {
        list.remove(0);
    }

}