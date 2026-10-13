package recursion;

public class PalindromString {
    ;
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        PalindromString palindromInteger = new PalindromString();
        boolean b=palindromInteger.isPalindrom(0,s);
        System.out.println(b);

    }
    boolean isPalindrom(int i,String s ){
        if(i>=s.length()/2)
            return true;
        if(s.charAt(i)!= s.charAt(s.length()-i- 1)) {
            return false;
        }
        return isPalindrom(i+1,s);
    }
}
