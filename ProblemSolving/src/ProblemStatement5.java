import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProblemStatement5 {

    public static void findPairs(List<Integer> input ,int k ){
        int max ,i=1 ,div=k , diff;
        Collections.sort(input);
        max= input.get(input.size()-1)+input.get(input.size()-2);


    while(div<=max){
        div=k*i;
        for (int j = 0; j < input.size(); j++) {
           diff = div-input.get(j);

           if(input.stream().skip(j).toList().contains(diff))
               System.out.print("{"+input.get(j)+","+diff+"}");
        }
        i++;
    }

    }
    public static void main(String[] args) {
        findPairs(Arrays.asList(3, 1, 2, 6, 9, 4 ),5);
    }
}
