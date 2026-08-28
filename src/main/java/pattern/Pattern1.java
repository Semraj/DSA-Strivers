package pattern;
//
/*
 *****
 *****
 *****
 *****
 *****
  */
public class Pattern1 {
    int row, col, n;
    public static void main(String[] args) {
        Pattern1 pattern1=new Pattern1();
        pattern1.print(5);
    }
        void print(int n){
            for (row = 0; row < n; row++) {
                for (col = 0; col < n; col++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }

