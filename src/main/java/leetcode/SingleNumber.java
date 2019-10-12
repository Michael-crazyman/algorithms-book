package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Michael on 19/10/9.
 */
public class SingleNumber {

    public static int singleNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (Integer i : nums) {
            if (map.get(i) == null){
                map.put(i, 1);
            } else {
                Integer count = map.get(i);
                count += 1;
                map.put(i, count);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                result = e.getKey();
                break;
            }
        }

        return result;
    }

    public static int singleNumber2(int[] nums){
        int result = 0;

        for (int i : nums) {
            result = result ^ i;
        }

        return result;
    }
}
