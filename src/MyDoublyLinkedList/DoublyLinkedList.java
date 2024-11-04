package MyDoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Добавление в конец списка
    public void insertAtEnd(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
    }

    // Добавление в начало списка
    public void insertAtStart(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }

    // Вставка по индексу
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.setData(data);

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            node.setPrev(temp);

            if (temp.getNext() != null) {
                temp.getNext().setPrev(node);
            } else {
                tail = node;
            }
            temp.setNext(node);
        }
    }

    // Удаление по индексу
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());

            if (temp.getNext() != null) {
                temp.getNext().setPrev(temp);
            } else {
                tail = temp;
            }
        }
    }

    // Вывод элементов списка
    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
