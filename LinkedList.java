class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    
class LinkedList {
    static Node head;

    public static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        newNode.data = data;
        newNode.next = temp;
        head = newNode;
    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        newNode.data = data;
        newNode.next = null;
        while(temp.next!=null) temp = temp.next;
        temp.next = newNode;
    }

    public static void deleteAtBeginning () {
        head = head.next;
    }

    public static void deleteAtEnd() {
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void traverse(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        insertAtBeginning(20);
        insertAtBeginning(10);
        insertAtEnd(30);
        insertAtEnd(40);
        traverse();
        deleteAtBeginning();
        deleteAtEnd();
        traverse();
    }
}