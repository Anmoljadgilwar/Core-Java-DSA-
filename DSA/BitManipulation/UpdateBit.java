
import java.util.Scanner;

public class UpdateBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        // oper=1 : set oper=0:clear
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            //set
            int newNum = bitMask | n;
            System.out.println(newNum);
        } else {
            //clear  
            int notBitMask = ~(bitMask);
            int newNum = notBitMask & n;
            System.out.println(newNum);
        }

    }
}
