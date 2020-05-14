package etest3;

public class LLTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Fill the list with 1-5
        for(int i = 1; i <= 6; i++) {
            list.add(i);
        }

        // Print the list
        for(int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i).getData() + ", ");
        }
        System.out.print("\n");

        // Place the data 9 at index 3
        list.insert(3, 9);
        // Print the list with the new data
        System.out.println("Placing the number 9 at index 3 produces:");
        for(int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i).getData() + ", ");
        }
        System.out.print("\n");

        // Remove index 3 (which is 9)
        list.remove(3);

        System.out.println("Remove the number 9 at index 3 produces:");
        for(int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i).getData() + ", ");
        }
    }
}
