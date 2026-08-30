package basicMath;

public class CountDigit {
    public static void main(String[] args) {
        CountDigit countDigit=new CountDigit();
        int digit_count=countDigit.countDigit(1000000000);
        System.out.println(digit_count);
    }
    int countDigit(int n){
        int rem,rev=0;
        int count=0;
        while(n>0){
            rem= n%10;
            count++;
            rev=rev*10+rem;
            n=n/10;
        }
        return count;
    }
}
