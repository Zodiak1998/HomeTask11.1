package ru.student.VladGedz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    static Utility utility = new Utility() ;
    static int [] testArr = { 1, 2, 3 };
    static String result = utility.convert(testArr);

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
    public void testIsNotEmpty(){
        Assertions.assertTrue(result.length()>0);
        Assertions.assertTrue(testArr.length > 0);
    }

    @Test
    public void testSpaceSeparated(){
        Assertions.assertTrue(result.contains(" "));
    }

    @Test
    public void testNoSpaceInEnd(){
        String regex = "\\S$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(result);
        Assertions.assertTrue(matcher.find());
    }

}
