package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {

    @Test
    public void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = RemoveDuplicates.removeDuplicates(list);
        assertEquals(new ArrayList<Integer>(), result);
    }

    @Test
    public void testSingleItem() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1));
        ArrayList<Integer> result = RemoveDuplicates.removeDuplicates(list);
        assertEquals(List.of(1), result);
    }

    @Test
    public void testNoDuplicates() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> result = RemoveDuplicates.removeDuplicates(list);
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    public void testStringDuplicates() {
        ArrayList<String> list = new ArrayList<>(List.of("A", "A", "B"));
        ArrayList<String> result = RemoveDuplicates.removeDuplicates(list);
        assertEquals(List.of("A", "B"), result);
    }

    @Test
    public void testMultipleDuplicates() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 1, 3, 3, 5, 5));
        ArrayList<Integer> result = RemoveDuplicates.removeDuplicates(list);
        assertEquals(List.of(1, 3, 5), result);
    }

}