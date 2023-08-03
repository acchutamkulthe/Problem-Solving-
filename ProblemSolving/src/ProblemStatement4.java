import java.util.Arrays;
import java.util.List;

public class ProblemStatement4 {

    public static void rearrange(int[] nums , int[] pos){
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i]=nums[i];
        }
        for (int i = 0; i < pos.length; i++) {
            output[pos[i]]=nums[i];
        }
        Arrays.stream(output).forEach(System.out::println);
    }

    public static void optimizedRearrange(int nums[], int [] pos){
        int i=0 , temp=0,temp2 , count=0 ;
        while(count< pos.length) {
            if(count==0) {
                i = pos[i];
                temp = nums[i];
                nums[i] = nums[0];
                count++;
            }
            else {
                i=pos[i];
                temp2=nums[i];
                nums[i]=temp;
                temp=temp2;
                count++;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] pos = { 3, 2, 4, 1, 0 };
        optimizedRearrange(nums,pos);
    }
}
/*Given an array of distinct integers, shuffle it according to the given order of elements.
For example:
Input:
nums[] = { 1, 2, 3, 4, 5 }
pos[] = { 3, 2, 4, 1, 0 }

Output:

nums[] = { 5, 4, 2, 1, 3 }

i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
In other words, update nums[pos[i]] = nums[i] for every index i.*/