public class SumAvg {

    static int sum=0;

    static class Node
    {
        int data;
        Node next;
    }

    static Node push( Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void sumOfNodes( Node head)
    {
        if (head == null)
            return;
        sumOfNodes(head.next);
        sum = sum + head.data;
    }

    static int sumOfNodesUtil( Node head)
    {
        sum = 0;
        sumOfNodes(head);
        return sum;
    }

    static double avgOfNodes(Node head)
    {

        if (head == null)
            return -1;

        int count = 0; // Initialize count
        int sum = 0;
        double avg = 0.0;

        Node current = head; // Initialize current
        while (current != null)
        {
            count++;
            sum += current.data;
            current = current.next;
        }

        avg = (double)sum / count;

        return avg;
    }

    public static void main(String args[])
    {
        Node head = null;

        head = push(head, 11);
        head = push(head, 7);
        head = push(head, 3);
        head = push(head, 42);
        head = push(head, 0);
        head = push(head, 14);

        System.out.println("Sum of nodes = " + sumOfNodesUtil(head));
        System.out.println("Average of nodes = " + avgOfNodes(head));
    }
}
