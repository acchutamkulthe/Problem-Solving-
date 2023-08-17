import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ProblemStatement8 {
    public static List<Integer> sol(List<Integer> input){
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            int count =0;
            for (int j = i+1; j < input.size() ; j++) {
                if(input.get(j)>input.get(i))
                    count++;
            }
            output.add(count);
        }
        return output;
    }
    public void optimizedSol(List<Integer> input){

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(sol(Arrays.asList(4, 6, 3, 9, 7, 10)));
    }
}
/*Given an integer array having distinct elements, find the surpasser count for each element in it. In other words, for each array element, find the total number of elements to its right, which are greater than it.
For example:
Input:  { 4, 6, 3, 9, 7, 10 }

Output: { 4, 3, 3, 1, 1, 0 }*/