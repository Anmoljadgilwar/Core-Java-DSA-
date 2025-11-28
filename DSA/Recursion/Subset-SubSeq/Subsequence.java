
public class Subsequence {

    public static void main(String[] args) {
        subsequence("", "abc");
    }

    static void subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        char ch = unprocessed.charAt(0);

        // include
        subsequence(processed + ch, unprocessed.substring(1));

        // exclude
        subsequence(processed, unprocessed.substring(1));
    }

}

//output: abc ab ac a bc b c  
/*
                   ("", "abc")
                 /              \
     include a                    exclude a
      ("a","bc")                  ("","bc")
       /     \                      /      \
include b  exclude b        include b   exclude b
("ab","c") ("a","c")        ("b","c")   ("","c")
   /  \       /  \            /  \         /   \
abc ab     ac a            bc b          c    ""

 */
//ch increases not because we increment it,
//but because each recursive call removes the previous character,
//making the next character the new ch.
