
import java.util.ArrayList;

public class ArrList1 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>(2);
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        num.add(80);

        System.out.println(num);

        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
    }
}
