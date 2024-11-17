import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.size() < 1 ) return 0;
        int acc = 0;
        for (int i = 0; i < L.size();i++){
            acc += L.get(i);
        }

        return acc;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evn = new ArrayList<>();
        for (int i = 0; i < L.size(); i++){
            if(L.get(i) % 2 == 0){
                evn.add(L.get(i));
            }
        }
        return evn;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> cmn = new ArrayList<>();
        for (int i = 0; i < L1.size();i++){
            for(int j =0; j < L2.size(); j++){
                if (L1.get(i) == L2.get(j)){
                    cmn.add(L1.get(i));
                }
            }
        }
        return cmn;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int acc = 0;
        for (int i = 0; i < words.size(); i++){
            for (int j = 0; j < words.get(i).length(); j++){
                if (words.get(i).charAt(j) ==  c) {
                    acc++;
                }

            }

        }
        return acc;
    }
}
