package basicMath;

public class Palindrom {
    public static void main(String[] args) {
        Palindrom palindrom=new Palindrom();
        boolean b=palindrom.isPalindrome(-1221);
        System.out.println(b);
    }
    public boolean isPalindrome(int x) {
        int dub=x,rem,rev=0;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==dub)
            return true;
        else
            return false;
    }
}
