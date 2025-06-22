package java_pratice.DataStructure.Queue.Problems;

import java_pratice.DataStructure.Queue.Queue;

import java.util.HashMap;
import java.util.Map;
//First Non-Repeating Character in a Stream
//For a stream of characters, return the first non-repeating character at every point.
public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        String inputString = "aaabbc";
        Queue<Character> queue = new Queue<>();
        String result = "";
        Map <Character,Integer> frequency = new HashMap();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            frequency.put(ch, frequency.get(ch) == null ?  1 : frequency.get(ch)  +1);
            queue.enqueue(ch);

            while( !queue.isEmpty() && frequency.get(ch) >1){
                queue.dequeue();
            }

            if (queue.isEmpty()){
                result = result + "#";
            }else {
                result = result + queue.peek();
            }
        }

        System.out.println(" data "+ result);
    }
}
