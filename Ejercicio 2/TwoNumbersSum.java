package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoNumbersSum {
    public List<Integer> add(List<Integer> n1, List<Integer> n2) {
        List<Integer> result = new ArrayList<>();
        int i = n1.size() - 1;
        int j = n2.size() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;	
            if (i >= 0) sum += n1.get(i--);
            if (j >= 0) sum += n2.get(j--);
            
            result.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(result);
        return result;
    }
}