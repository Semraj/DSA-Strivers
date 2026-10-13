package basicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber=new PrimeNumber();
        primeNumber.isPrime(11);
    }
    void isPrime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==1)
            System.out.println("Is a Prime number");
        else
            System.out.println("Is not a Prime number");
    }
}
