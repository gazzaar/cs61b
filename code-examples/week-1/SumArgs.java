public class SumArgs {
  public static void main(String[] args) {
    int acc = 0;
    for (int i = 0; i < args.length; i++) {
      int argInt = Integer.parseInt(args[i]);
      acc += argInt;
    }
    System.out.println(acc);

  }
};
