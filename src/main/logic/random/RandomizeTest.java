package main.logic.random;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RandomizeTest {

    @Test
    public void getRandom() throws Exception {
        Random mock = mock(Random.class);
        Randomize randomize = new Randomize(mock);
        int val = 10;
        Integer expexted = 3;
        when(mock.nextInt(val)).thenReturn(expexted);
        Integer random = randomize.getRandom(val);
        assertEquals(expexted, random);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenRandomReturnBigger5ThenThrowException() throws Exception {
        Random mock = mock(Random.class);
        Randomize randomize = new Randomize(mock);
        int val = 10;
        int expexted = 30;
        when(mock.nextInt(val)).thenReturn(expexted);
        randomize.getRandom(val);
    }
}