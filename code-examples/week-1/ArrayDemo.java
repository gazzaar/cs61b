public class ArrayDemo {
  public static void main(String[] args) {
    String[] someArrays = new String[5];
    int[] someArraysInt = new int[5];
    int[] array = { 1, 2, 3 };
    for (int i : array) {
      System.out.println(i);

    }
    someArrays[0] = "german";
    System.out.println(someArrays[0]);
    System.out.println(someArrays[2]);
    System.out.println(someArraysInt[2]);
  }

}
