package ru.student.VladGedz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class StringTest {

    static Utility utility ;
    static String result = "";
    int [] testArr = { 1, 2, 3 };

    @BeforeAll
    public static void setUtility(){
        utility = new Utility();
    }

    @BeforeEach
    public void testBefore(){
        result = utility.convert(testArr);
    }

    @Test
    public void testIsString(){
        Assertions.assertEquals(result.getClass(), String.class);
    }

    @Test
    public void testArrayClassIsInt(){
        Assertions.assertEquals(testArr.getClass(), int[].class);
    }

}
