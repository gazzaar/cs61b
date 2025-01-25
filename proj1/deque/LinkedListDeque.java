package deque;
public  class LinkedListDeque<T>{
    public class IntNode{
       public T item;
       public IntNode next;

       public IntNode(T i, IntNode rest){
            item = i;
            next = rest;
       }
    }
    private IntNode  sentinel;
    private int size;
    public LinkedListDeque(){
        sentinel = new IntNode(null,null);
        size = 0;
    }

    public void addFirst(T item){
        // TODO: implement add first

    }

    public void addLast(T item){
        // TODO: implement add last
    }

    public boolean isEmpty(){
        // TODO: implement is empty
        return true;
    }

    public int size(){
        // TODO: implement size
        return 0;
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