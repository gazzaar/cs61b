public class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0, 0);
    }

    public static void main(String[] arg){
        Point p1 = new Point(5, 9);
        Point p2 = new Point(-3, 3);

        System.out.println(minIndex(new int[] {4,2,3,1,5,8}));;
    }
    public static int minIndex(int[] numbers){
       int m = numbers[0];
       int idx = 0;
       for (int i = 1; i< numbers.length ; i++){
          if (numbers[i]< m){
              m = numbers[i];
              idx = i;
          }
       }
       return idx;
    }


}