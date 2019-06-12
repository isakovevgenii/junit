package main.logic.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void arrayReverse() throws Exception{
        int[][] start = {{1,0},   //2 1
                         {2,3}};  //3 0

        int[][] actual = Reverse.arrayReverse(start);

        int[][] expected = {{2,1},{3,0}};

        assertEquals(expected, actual);
    }
}