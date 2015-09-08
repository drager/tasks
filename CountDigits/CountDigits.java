package CountDigits;

import java.util.HashMap;
import java.util.Map;

public class CountDigits {
    public Map<String, Integer> countDigits(String inputNumber) {
        Map<String, Integer> countMap = new HashMap<>();
        int zeros = 0;
        int odd = 0;
        int even = 0;
        int sum = 0;

        String[] split = inputNumber.split("");

        for (String aSplit : split) {
            int myInteger = Integer.parseInt(aSplit);

            if (checkForZeros(myInteger)) {
                zeros += 1;
            } else if (checkForEven(myInteger)) {
                even += 1;
            } else if (checkForOdd(myInteger)) {
                odd += 1;
            }

            sum += myInteger;
        }


        countMap.put("zeros", zeros);
        countMap.put("odd", odd);
        countMap.put("even", even);
        countMap.put("sum", sum);

        return countMap;
    }

    public Boolean checkForZeros(Integer inputNumber) {
        return inputNumber == 0;
    }

    public Boolean checkForOdd(Integer inputNumber) {
        return inputNumber % 2 == 1;
    }

    public Boolean checkForEven(Integer inputNumber) {
        return inputNumber % 2 == 0;
    }
}
