package basicMath;

public class PrintDivisor {
    public static void main(String[] args) {
        PrintDivisor printDivisor=new PrintDivisor();
        printDivisor.printDivisor(12);
    }
    void printDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }
    }
}
