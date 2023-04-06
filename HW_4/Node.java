package HW_4;

class Node {
    int value;
    Color color;
    Node leftChild;
    Node rightChild;

    public String toString(){
        return "Node{" + 
        "value=" + value +
        ", color=" + color +
        '}';
    }
}

enum Color {
    RED, BLACK
}
