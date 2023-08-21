public class Palindrome {

    public static void palindrome(String str){
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(isPalindrome(str.substring(i,j)) && max< str.substring(i,j).length()) {
                    max = str.substring(i, j).length();
                    }
                }
            }
        System.out.println(max);
        }
    public static boolean isPalindrome(String str){
       int i=0,j=str.length()-1;
        while (i<j){
           if(str.charAt(i)==str.charAt(j)){
               i++;
               j--;
           }
            else {
                return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        //System.out.println(palindrome("abcdcbabcddcba"));
        palindrome("abcdcbabcddcba");

    }
}
