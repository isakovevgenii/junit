package main.logic.listString;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {
    private  Main main;

    @Test
    public void addStringToList1() throws Exception {
        main = new Main();
        main.addStringToList("A", "B", "C");
        List<String> expected = Arrays.asList("A", "B", "C");
        List<String> actual = main.words;
        assertEquals(expected, actual);
    }

    @Test
    public void addStringToList2() throws Exception {
        main = new Main();
        main.addStringToList("A", "b", "C");
        List<String> expected = Arrays.asList("A", "B", "C");
        List<String> actual = main.words;
        assertEquals(expected, actual);
    }
}