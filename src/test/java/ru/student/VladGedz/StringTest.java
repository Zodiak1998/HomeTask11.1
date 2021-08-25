package ru.student.VladGedz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class StringTest {

    static Utility utility = new Utility() ;
    static int [] testArr = { 1, 2, 3 };
    static String result = utility.convert(testArr);

    @BeforeAll
    public static void setUtility(){
        Assertions.assertTrue(result.length() > 0);
    }

    @Test
    public void testIsString(){
        Assertions.assertEquals(result.getClass(), String.class);
    }

    @Test
    public void testArrayClassIsInt(){
        Assertions.assertEquals(testArr.getClass(), int[].class);
    }

    @Test
    public void testStringNotNull(){
        Assertions.assertNotNull(result);
    }

    @Test
    public void testSpaceSeparated(){
        Assertions.assertTrue(result.contains(" "));
    }

}
