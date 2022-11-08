public class main {
    public static void main(String[] args) {
        isPalindrome(121);

    }

    public static void isPalindrome(int number) {
    int reverse=0;
    int store=number;
    while(number>0){
        int stored= store%10;
        reverse=(reverse*10)+stored;
        store/=10;

    }
    if(number==reverse) {
        System.out.println(number + " is a palindrome number");
    }else{
        System.out.println(number + " is not a palindrome number");
    }
    }
    }






