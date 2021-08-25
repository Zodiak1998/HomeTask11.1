package ru.student.VladGedz;

import java.util.Arrays;

public class Utility {

    public String convert(int[] intArray) {

        String result = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .reduce( (s1, s2) -> s1.concat(" ").concat(s2) )
                .get();

        return result;
    }

}
