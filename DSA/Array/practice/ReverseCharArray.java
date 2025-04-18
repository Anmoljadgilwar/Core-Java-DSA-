
public class ReverseCharArray {

    public static void reverse(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverse(input);

        // Output reversed array
        System.out.println("Reversed array: " + String.valueOf(input));
    }
}
// Output: Reversed array: olleh
