package FP01;

import java.util.List;

public class FP01Structured {

    public static void main(String ap[])
    {
        printEvenNumber(List.of(12,3,4,5,6,8));
    }


    static void printAllNumber(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

    static void printEvenNumber(List<Integer> list)
    {
        for(int number: list)
        {
            if(number %2 == 0)
            {
                System.out.println(number);
            }
        }
    }
}
