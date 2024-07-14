public class LinkedList {

    Node head = null;

    public void add(Milk milk){
        Node node = new Node();
        node.current = milk;
        if (head == null){
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Milk getNext(){
        if(head == null){
            return null;
        }
        else{
            Node temp = head;
            head = head.next;
            return temp.current;
        }
    }

    public int countItems(){
        Node current = head;
        int countItems = 0;
        while(current != null){
            countItems++;
            current = current.next;
        }
        return countItems;
    }


    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
}