package recursion;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        long f=factorial.fact(5);
        System.out.println(f);
    }
    int fact(int n){
        if(n<1)
            return 1;
        System.out.println(n);
        int factorial = n * fact(n-1);
//        System.out.println(factorial);
        return factorial;
    }
}
