import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _100Doors {
    public static void countOpenDoors(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i <= 100; i++) {
            if(isprime(i)){}
            else if (countFactors(i)%2!=0)
                list.add(i);
        }
        System.out.println(list);
    }
    public static int countFactors(int num){
       int count = 1;
        for (int i = 2; i <= num; i++) {
            if(num%i==0)
                count++;
        }
        return count;
    }
    public static Boolean isprime(int num){
       int n=2;
        while(n*n<=num){
            if(num%n!=0){
            n++;}
            else
                return false;
        }
        return true;
    }
    
    public static void optDoors(){
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(false);
        }
        int steppers=1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j+=steppers) {
                list.add(j,!list.get(j));
            }
            steppers++;
        }
        System.out.println(list.stream().filter(element->element==true).collect(Collectors.toList()));
    }
    public static void main(String[] args) {
        //System.out.println(isprime(5));
        countOpenDoors();
    }
}
