package main.logic.jr;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class WhereTest {

    private static final String expected = "name=Vasa,age=15,sex=m";
    private static final Map<String, String> params = new LinkedHashMap<>(){{
        put("name", "Vasa");
        put("age", "15");
        put("sex", "m");
        put("school", null);
    }};

    @Test
    public void getQuery() throws Exception {

        String actual = Where.getQuery(params);
        assertTrue(actual != null);
        assertEquals(expected, actual);
    }

    @Test
    public void getQuertyAssertJ() throws Exception {

        String actual = Where.getQuery(params);
        assertThat(actual).isNotNull()
                .isNotEqualTo(expected);
    }
}