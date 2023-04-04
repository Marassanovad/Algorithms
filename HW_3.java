


public class HW_3 {

  public class LinkedList{
    private Node head;
    private Node tail;

    class Node {
        private int value;
        private Node nextNode;
        private Node previousNode;

    }
  




  public void reverse(){
    Node node = head;
    Node temp = head;
    head = tail;
    tail = head;

    while(node.nextNode != null){
      temp = node.nextNode;
      node.nextNode = node.previousNode;
      node.previousNode = temp;
      node = node.previousNode;
      }
    }
  }   
}

   



