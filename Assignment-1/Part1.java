import java.util.*;

public class Part1 {

public static void main (String[]args){


}


//how to account for double letters
//another approach is using a map to track occurence of each letter in s2 and making sure it occurs that many times in s1

public static boolean isStringPermutation(String s1, String s2){
    boolean val = true;
    if (s1.length() != s2.length()){
        val = false;
    }

    for (int i = 0; i < s2.length(); i++){
        CharSequence c = s2.subSequence(i, i+1);
        if (s1.contains(c)){
            val = true;
            if (val == false){
                return false;
            }
        }
    }
return val;
}

//do we have to use the given method headers
public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum){
    List<List<Integer>> solution = new ArrayList<List<Integer>>();
    /*
    have a val and set current i value to main character value 
    then have another loop a
    if (main char does not equal inside val and they equal target sum then ) add to list
    */

    for (int i = 0 ; i < inputArray.size(); i++){
        int mainVal = inputArray.get(i);
        for (int j = 0 ; j < inputArray.size(); j++){
            if (mainVal + inputArray.get(j) == targetSum && mainVal != inputArray.get(j)){
                ArrayList pair = new ArrayList<>();
                pair.add(mainVal);
                pair.add(inputArray.get(j));
                solution.add(pair);
            }
        }
    }
    return solution;
} 









}
