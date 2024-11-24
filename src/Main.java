import MyBinarySearchTree.BinarySearchTree;
import MyDoublyLinkedList.DoublyLinkedList;
import MySinglyLinkedList.MyLinkedList;
import MyStack.MyStack;

public class Main {
    public static void main(String[] args) {

    }


    public static void testSinglyLinkedList(){
        MyLinkedList list = new MyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        list.insertAtStart(0);
        list.insertAt(1,99);

        list.deleteAt(2);

        list.show();
    }

    public static void testDoubleLinkedList(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtStart(10);
        list.insertAt(1,99);

        list.show();
    }

    public static void testBinarySearchTree(){
        BinarySearchTree tree = new BinarySearchTree();
       tree.insert(60);
       tree.insert(45);
       tree.insert(50);
       tree.insert(80);
       tree.insert(47);
       tree.insert(90);
       tree.insert(85);
       tree.insert(87);
       tree.insert(95);

        //tree.inorder(tree.getRoot());
        //tree.preorder(tree.getRoot());
        //tree.showLeavesWithoutChildrens();
        //tree.inorder(tree.getRoot());
        tree.countLeaves();
    }

    public void testMyStack(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        myStack.pop();

        myStack.show();
    }
}