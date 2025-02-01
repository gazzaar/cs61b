package deque;
public class ArrayDeque<Item> {
  private Item[] items;
  private int size;
  private int nextAddFirst;
  private int nextAddLast;

  public ArrayDeque(){
    items = (Item[]) new Object[8];
    size = 0;
    nextAddFirst = items.length / 2;
    nextAddLast = (items.length / 2) + 1;
}



  public void resize(int capacity) {
    Item[] newArr = (Item[]) new Object[capacity];
    int firstPartLength = items.length - nextAddFirst;
    if (firstPartLength > 0) {
      System.arraycopy(items, nextAddFirst, newArr, 0, firstPartLength);
    }

    int secondPartLength = nextAddLast;
    if (secondPartLength > 0) {
      System.arraycopy(items, 0, newArr, firstPartLength, secondPartLength);
    }

    items = newArr;
    nextAddFirst = 0;
    nextAddLast = size;
  }

  public void addFirst(Item item){
    if(size == items.length) {
     resize(size * 2);
    }
    items[nextAddFirst] = item;
    nextAddFirst = (nextAddFirst - 1 + items.length) %  items.length;
    size++;
  }



  public void addLast(Item item){
    if(size == items.length) {
      resize(size * 2);
    }
    items[nextAddLast] = item;
    nextAddLast = (nextAddLast + 1) % items.length;
    size++;
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
      if (isEmpty()) {
        return null;
    }
    int index = (nextAddFirst + 1) % items.length;
    Item first = items[index];
    items[index] = null;
    nextAddFirst = index;
    size--;
    return first;
  }

  public Item removeLast(){
      if (isEmpty()) {
        return null;
    }
    int index = (nextAddLast - 1 + items.length) % items.length;
    Item last = items[index];
    items[index] = null;
    nextAddLast = index;
    size--;
    return last;

  }

  public Item get(int index) {
    if (index < 0 || index >= size) {
      return null;
    }
    return items[(nextAddFirst + 1 + index) % items.length];
  }
}
