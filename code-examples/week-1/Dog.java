public class Dog {
  public int weightInPounds;

  /** Constructor */
  public Dog(int w) {
    weightInPounds = w;
  }

  public void makeNoise() {
    if (weightInPounds < 10) {
      System.out.print("yipyipyip");
    } else if (weightInPounds < 30) {
      System.out.print("Bak Bak!");
    } else {
      System.out.print("Wooof");
    }

  }

}
