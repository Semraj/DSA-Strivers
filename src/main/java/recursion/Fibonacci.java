package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci =new Fibonacci();
        int sum=fibonacci.fabo(3);
        System.out.println(sum);
    }
   int  fabo(int n){
       if(n<=1)
           return n;
       int last=fabo(n-1);
       int slast=fabo(n-2);
       int f= last + slast;
       return f;
   }
}
