import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> letterMap = new HashMap<>();
        for (char letter = 'a'; letter <= 'z'; letter++){
            letterMap.put(letter, letter - 'a' + 1 );

        }

        return letterMap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> sqr = new HashMap<>();

        if (nums.size() < 1){
            return sqr;
        }

        for (int i = 0; i < nums.size(); i++){
            int current = nums.get(i);
            int sqrt = (int) Math.pow(current,2);
            sqr.put(current,sqrt );
        }

        return sqr;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> countMap = new TreeMap<>();
        if (words.size() < 1){
            return countMap;
        }
       for (int i = 0; i < words.size(); i ++){
           String current = words.get(i);
          if(!countMap.containsKey(words.get(i))){
             countMap.put(current,1);

          } else {
              countMap.put(current,countMap.get(current) + 1 );
          }
       }
        return countMap;
    }
}
