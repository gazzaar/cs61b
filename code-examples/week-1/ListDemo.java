import java.util.*;

public class ListDemo {
  public static void main(String[] args) {
    List<String> lst = new ArrayList<>();
    lst.add("Fathy");
    lst.set(0,"zaki");
    lst.add("Fathy");
    lst.add("Manga");
    lst.add("Mazen");
//    System.out.println(lst);
//    Set<Integer> st = new TreeSet<>(); // Sorted
    Set<Integer> st = new HashSet<>(); // No order
    st.add(1);
    st.add(7);
    // st.add(1); // it's unique
    st.add(2);
    st.add(3);
    st.add(-5);
    st.remove(3);
    System.out.println(st);
    System.out.println(lst.size());
    System.out.println(st.size());
    Map<String , String> map = new HashMap<>();
//    Map<String , String> map = new TreeMap<>();
    map.put("b", "Manga");
    map.put("a", "Fathy");
    map.put("c", "Mazen");
    System.out.println(map.get("Hello"));
    System.out.println(map.size());
    System.out.println(map);
    for (String key : map.keySet()){
      System.out.println(key + ":" + map.get(key));
    }
  }

}
