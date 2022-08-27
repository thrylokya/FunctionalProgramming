package FP02;

import java.util.List;

public class FP02Structural {

    public static void main(String ap[])
    {
        addNumbers(List.of(12,3,5,6,7,9,10));
    }

    public static void addNumbers(List<Integer> numList)
    {
        int count = 0;
        for(int num : numList)
        {
            count+= num;

        }

        System.out.println(count);
    }
}
