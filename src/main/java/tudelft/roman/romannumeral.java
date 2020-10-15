package tudelft.roman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romannumeral {

    public int convert(String romanNumeral) {
        Map<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        char[] letters = romanNumeral.toCharArray();

        int result = 0;

        for(int i = letters.length - 1; i >= 0; i--) {
            result += values.get(letters[i]);
            if(i > 0) {
                if(values.get(letters[i]) > values.get(letters[i-1])) {
                    result -= 2*values.get(letters[i-1]);
                }
            }
        }
        return result;
    }


}
