
public class Practice {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[2] = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i++;
            System.out.print(arr[i] + "  ");

        }

    }
}

/*
  int arr[] = {1, 2, 3, 4, 5};
        arr[2] = 10;

        for (int i = 0; i < arr.length; i++) {
         
            System.out.print(arr[i] + " ");

        }
 */
