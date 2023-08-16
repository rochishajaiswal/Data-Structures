
/*Implement a function that returns a list of all occurrences of a given  substring inside a big string.
Return empty vector if smaller string is not present inside bigger string.

Sample Input

string bigString = "I liked the movie, acting in movie was great!";
string smallString = "movie"


Sample Output
12, 29
*/
import java.util.*;

public class SearchAll {

    public static void main(String[] args) {
        String big = "I liked the movie, acting in movie was great!";
        String small = "movie";
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int index = 0;
        while (index != -1) {
            index = big.indexOf(small, index);
            if (index == -1)
                break;
            else
                ans.add(index);
            index++;
        }
        for (int a : ans)
            System.out.println(a);
    }
}