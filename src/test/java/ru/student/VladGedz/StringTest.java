package ru.student.VladGedz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringTest {

    Utility result = new Utility();
    int[] test = new int[] { 1, 2, 3 };

    @Test
    public void testIsString(){
        Assertions.assertEquals(result.convert(test).getClass(), String.class);
    }

}
