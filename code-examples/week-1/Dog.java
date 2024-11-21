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

  public static Dog maxDog(Dog d1, Dog d2) {
    if (d1.weightInPounds > d2.weightInPounds) {
      System.out.println("Dog 1 s bigger");
      return d1;
    }

    System.out.println("Dog 2 s bigger");
    return d2;
  }

  public static void main(String[] args) {

    Dog d1 = new Dog(20);
    Dog d2 = new Dog(70);
    d1.makeNoise();
    System.out.println(Dog.maxDog(d1, d2));

  }

}
