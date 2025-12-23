
import java.util.*;

public class BacktrackingSubsets {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> current = new ArrayList<>();
        subsets(arr, 0, current);
    }

    static void subsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // 1️⃣ INCLUDE step
        current.add(arr[index]);
        subsets(arr, index + 1, current);

        // 2️⃣ UNDO step (BACKTRACK)
        current.remove(current.size() - 1);

        // 3️⃣ EXCLUDE step
        subsets(arr, index + 1, current);
    }
}

/*
[1, 2, 3]
[1, 2]
[1, 3]
[1]
[2, 3]
[2]
[3]
[]*/
