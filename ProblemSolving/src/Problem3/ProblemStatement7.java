package Problem3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProblemStatement7 {
    public static  void optIsFacinating(int num ){
        Map<Integer,Integer> map= new HashMap<>();
        if(checkNum(num,map) && checkNum(num*2,map) && checkNum(num*3,map))
            System.out.println("Facinating");
        else
            System.out.println("Not facinating");
    }
     public static boolean checkNum(int num , Map<Integer,Integer> map){
            while (num!=0){
                if(map.get(num%10)!=null)
                    return false;
                else
                 map.put(num%10,1);
                num/=10;
            }
             return true;
     }
    public static void main(String[] args) {

            optIsFacinating(192);
    }
}

/*Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
Example 1:

        Input:
        N = 192
        Output: Fascinating
        Explanation: After multiplication with 2
        and 3, and concatenating with original
        number, number will become 192576384
        which contains all digits from 1 to 9.
        Example 2:

        Input:
        N = 853
        Output: Not Fascinating
        Explanation: It's not a fascinating
        number.*/