package basicMath;

public class ArmstrongNumber {
    int n,digit,count;

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();
       boolean is_arm = armstrongNumber.isArmstrong(1634);
       if(is_arm==true)
           System.out.println("Armstrong Number");
       else
           System.out.println("Not a Armstrong Number");
    }
    int digit_count(int n){
        while(n>0){
            digit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    boolean isArmstrong(int n){
        double sum_cube=0;
        int dub=n;
        int total_count=digit_count(n);
        while(n>0){
            digit=n%10;
             sum_cube = sum_cube+Math.pow(digit,total_count);
            n=n/10;
        }
        if(sum_cube==dub)
            return true;
        else
            return false;
    }
}
