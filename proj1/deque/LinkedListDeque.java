package deque;
public  class LinkedListDeque<T>{
    public class Node {
       public T item;
       public Node next;
       public Node prev;

       public Node(T i, Node n, Node p){
            item = i;
            next = n;
            prev = p;
       }
    }
    private Node sentinel;
    private int size;
    public LinkedListDeque(){
        sentinel = new Node(null,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public LinkedListDeque(T x){
        sentinel = new Node(null,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
       Node newNode = new Node(x,sentinel,sentinel);
        sentinel.next = newNode;
        sentinel.prev = newNode;
        size = 1;
    }

    public void addFirst(T item){
        sentinel.next = new Node(item,sentinel.next,sentinel);
        sentinel.next.next.prev = sentinel.next;
        size++;
    }

    public void addLast(T item){
        sentinel.prev= new Node(item,sentinel,sentinel.prev);
        sentinel.prev.prev.next = sentinel.prev;
        size++;
    }

    public boolean isEmpty(){
        boolean empty = false;
        if(sentinel.next == sentinel){
           empty = true; 
        }
        return empty;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        Node n = sentinel.next;
        for (int i = 0; i < size; i++){
            System.out.print(n.item + " ");
            n = n.next;
        }
        System.out.println();

    }

    public T removeFirst(){
        if(sentinel.next == sentinel){
            return null;
        } else{
            T item = sentinel.next.item;
            sentinel.next = sentinel.next.next;
            if(sentinel.next == sentinel){
                sentinel.prev = sentinel;
            } else{
                sentinel.next.prev = sentinel;
            }
            size--;
            return item;
        }
    }

    public T removeLast(){
         if(sentinel.next == sentinel){
            return null;
        } else {
             T item = sentinel.prev.item;
             sentinel.prev = sentinel.prev.prev;
             if(sentinel.prev == sentinel){
                 sentinel.next = sentinel;
             } else{
                 sentinel.prev.next = sentinel;
             }
             size--;
             return item;
         }
    }

    public T get(int index) {
        if (sentinel.next == sentinel || index < 0 || index >= size) {
            return null;
        }

        Node n = sentinel.next;

        for (int i = 0; i < size; i++) {
            if (i == index) {
                return n.item;
            }
            n = n.next;
        }

        return null;
    }

}