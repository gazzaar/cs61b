package deque;
public class ArrayDeque<Item> {
  private Item[] items;
  private int size;

  public ArrayDeque(){
    items = (Item[]) new Object[8];
    size = 0;
  }

  public void addFirst(Item item){
    size++;
  }

  public void addLast(Item item){
  }

  public boolean isEmpty(){
    return false;
  }

  public int size(){
    return size;
  }

  public void printDeque(){
  }

  public Item removeFirst(){
    return null;
  }

  public Item removeLast(){
    return null;
  }

  public Item get(int index) {
    return null;
  }
}
