package MySinglyLinkedList;

public class MyLinkedList {
    private Node head;

    public void insertAtEnd(int data) {
        Node node= new Node();
        node.setData(data);

        if (head == null) {
            head = node;
        }else{
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void insertAtStart(int data) {
        Node node= new Node();
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node= new Node();
        node.setData(data);
        if (index == 0) {
            insertAtStart(data);
        }else{
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.getNext();
        }else{
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
    }

    public void show(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
