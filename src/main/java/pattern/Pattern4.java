package pattern;

public class Pattern4 {
    int row,col,n;

    public static void main(String[] args) {
        Pattern4 pattern3=new Pattern4();
        pattern3.print3(5);
    }
    void print3(int n){
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.print("\n");
        }
    }
}
