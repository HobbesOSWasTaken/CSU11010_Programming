package etest3;

public class LinkedList
{
    private int listCount;
    private Node head;

    public LinkedList() {
        head = new Node();
        listCount = 0;

    }

    // Add a new node with data
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
        listCount++;
    }

    // Get the node at index
    public Node get(int index) {
        // Error handling
        if(index <= listCount) {
            Node returnNode = head;
            for(int node = 0; node < index; node++) {
                returnNode = returnNode.getNextNode();
            }
            return returnNode;
        }
        else {
            return null;
        }
    }

    // Insert a new node with data into a position
    public void insert(int index, int data) {
        if(index <= listCount) {
            Node indexNode = head;
            for(int node = 0; node < index; node++) {
                indexNode = indexNode.getNextNode();
            }
            Node newNode = new Node(data);
            newNode.setNextNode(indexNode.getNextNode());
            indexNode.setNextNode(newNode);
            listCount++;
        }
        else {
            System.out.println("[ERROR IN INSERTION]: INDEX OUT OF BOUNDS");
        }
    }

    // Remove a node at the specified position
    public void remove(int index) {
        if(index <= listCount) {
            Node indexNode = head;
            for(int node = 0; node < index; node++) {
                indexNode = indexNode.getNextNode();
            }
            // indexNode is now equal to the node just before the one to remove so set its next node to the one after that
            indexNode.setNextNode(get(index + 2));
            listCount--;
        }
        else {
            System.out.println("[ERROR IN REMOVAL]: INDEX OUT OF BOUNDS");
        }
    }

    // Return the size of the list
    public int size() {
        return listCount;
    }
}
