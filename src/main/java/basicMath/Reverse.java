package basicMath;

public class Reverse {
    int n,rev=0,rem;

    public static void main(String[] args) {
        Reverse rev=new Reverse();
        int no=rev.reverse(10002);
        System.out.println(no);
    }
    public int reverse(int x) {
        while(x!=0) {
                rem = x % 10;
                if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
                    return 0;
                rev = rev * 10 + rem;
                x = x / 10;
            }
        return rev;
    }
}
