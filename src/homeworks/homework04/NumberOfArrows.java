package homeworks.homework04;

import java.util.Arrays;

public class NumberOfArrows {
    public static void main(String[] args) {
        String inputString = "gfrtasd kipea";

        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);

        System.out.println(tempArray);
    }
}
