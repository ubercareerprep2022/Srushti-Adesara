import javax.sound.sampled.DataLine;

public class Part4 {
    
public class Node{
    int data;
    Node nextNode;


    public  Node(int data){
        data = data;
        nextNode = null;
    }
   
}



public class LinkedList{

    Node rootNode;

    public void push(Node n){
        rootNode.nextNode = n;
    }

    public int pop(){
        if (rootNode.nextNode == null){
            return rootNode.data;
        }
        return rootNode.data;
    }

    public void insert(int index, Node n){
        rootNode.next = n;
    }

    public int size(){
        int size = 0;
        while (rootNode.nextNode != null){
            size++;
        }
        return size;
    }

    public void printList(){
        while (rootNode.nextNode != null){
            System.out.println(rootNode);
    }


}



}
