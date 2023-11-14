package seminars.s05.task01;

import java.util.List;

public class MaxNumberFinder {
    public int findMaxNumber(List<Integer> list){
       if (list == null || list.isEmpty()){
           throw new IllegalArgumentException("Empty list transferred");
       }

       int maxValue = list.get(0);

        for (int number :
                list) {
            if (number > maxValue) maxValue = number;
        }

        return maxValue;

    }


}
