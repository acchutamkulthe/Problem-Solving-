import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;

public class ProblemStatement2 {
    public static List<Integer> rearrange(List<Integer> input){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if(map.get(input.get(i))==null){
                int n = input.get(i);
                map.put(input.get(i),1);
            }
            else {
                map.put(input.get(i), map.get(input.get(i))+1);
            }
        }
        for (int i = 0; i < input.size(); i++) {
            if(map.get(input.get(i))!=0){
                while(map.get(input.get(i))>0){
                    int num = map.get(input.get(i));
                    output.add(input.get(i));
                    map.put(input.get(i),map.get(input.get(i))-1 );
                }
            }
        }
        return output;

    }

    public static void main(String[] args) {
        System.out.println(rearrange(Arrays.asList(1, 2, 3, 1, 2, 1 )));
        System.out.println(rearrange(Arrays.asList(5, 4, 5, 5, 3, 1, 2, 2, 4 )));
    }

}
/*Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
For example:
Input:  { 1, 2, 3, 1, 2, 1 }
Output: { 1, 1, 1, 2, 2, 3 }


Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }*/