
public class Foreach {
    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
