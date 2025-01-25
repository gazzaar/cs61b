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
        // TODO: implement add last
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
        // TODO: implement print deque

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
        // TODO: implement remove last item
        return null;
    }

    public T get(int index){
        // TODO: implement get item on index
            return null;
    }

}