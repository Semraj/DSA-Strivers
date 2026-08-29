package pattern;

public class Pattern2 {
    int row,col,n;

    public static void main(String[] args) {
        Pattern2 pattern2=new Pattern2();
        pattern2.print2(5);
    }
    void print2(int n){
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
