import java.util.Arrays;
public static void main(String[] args) {
   int[] arr = {4, 6, 2, 8, 10};
   selection(arr);
   System.out.println(Arrays.toString(arr));
}   

static int selection (int[] arr){

   for (int i = 0; i < arr.length; i++){
      //find the max element in the remaining array and swap it with the first element
       int last = arr.length - i - 1;
       int maxIndex = getmax(arr, 0, last);
       swap(arr, maxIndex, last);

   }
   return 0;
}


static int swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
    return arr[first];

}

static int getmax (int[] arr, int start, int end){
    int max = arr[start];
    for (int i = start; i < end; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    return max;


}
