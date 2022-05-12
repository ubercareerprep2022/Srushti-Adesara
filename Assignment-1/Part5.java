import java.util.LinkedList;
import java.util.Stack;

public class Part5 {
 
    
//iteratively
public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> input){
LinkedList<Integer> newList = new LinkedList<>();

for (int i = input.size(); i > -1; i--){
    newList.add(input.get(i));
}
return newList;
}


//using a stack 
public LinkedList<Integer> reverseLinkedListWithStack(LinkedList<Integer> input){
    LinkedList<Integer> newList = new LinkedList<>();
    Stack temp = new Stack();
    Interator<Integer> iter = temp.iterator();

    for (int i = 0 ; i < input.size(); i++){
       temp.add(input.get(i));
    }
    
    while(iter.hasNext()){
        int val = temp.push(item);
        newList.add(val);
    }

    return newList;
}







}
