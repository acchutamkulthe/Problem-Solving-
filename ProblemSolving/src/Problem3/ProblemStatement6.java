package Problem3;

public class ProblemStatement6 {

    public static void divisible(int num){
            int temp,quotient=num,count=0;
            while(quotient!=0){
                temp=quotient%10;
                if(num%temp==0){
                    count++;
                }
                quotient/=10;
            }
        System.out.println(count);
    }
    public static void main(String[] args) {
        divisible(23);
    }
}
/*Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly*/