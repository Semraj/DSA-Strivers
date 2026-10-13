package recursion;

public class PrintNTimes {
    public static void main(String[] args) {
        PrintNTimes printNTimes = new PrintNTimes();
//        printNTimes.printName(1,5);
        printNTimes.printNTo1(3,3);
    }
    void printName(int i,int n){
        if(i>n)
            return;
        System.out.println("Semraj");
        printName(i+1,n);
    }
    void printNTo1(int i,int n){
        if(i<1)
            return;
//        System.out.println(i);
//        System.out.println("--------");
        printNTo1(i-1,n);
        System.out.println(i);
    }
}
