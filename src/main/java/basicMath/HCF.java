package basicMath;

public class HCF {
    public static void main(String[] args) {
        HCF hcf=new HCF();
        int num=hcf.hcf(1212,2424);
        System.out.println(num);
    }
    int hcf(int a, int b){
        while(a>0 && b>0){
            if(a>b)
                a=a%b;
            else
             b=b%a;
        }
        if(a==0)
            return b;
        else
            return a;
    }
}
