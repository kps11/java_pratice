package java_pratice;
//problem statement https://leetcode.com/problems/lru-cache/description/
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Node head  = new Node(0,0) , tail = new Node(0,0);
    Map <Integer,Node> map = new HashMap<>();
    int capacity;
    public  LRUCache(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key ){
        if(map.containsKey(key)){
            Node data = map.get(key);
            //move to the top of the list as it is most recently used
            //remove the node
            remove(data);
            //insert the node
            insert(data);
            return data.value;
        }
        return  -1;
    }

    public void  put (int key, int value){
        //if key present we need to move to top as recently used
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        //if cache is full
        if( capacity == map.size()){
            remove(tail.prev);
        }
        insert(new Node(key,value));

    }

    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node){
        map.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;

    }

    class Node {
        Node prev,next;
        int key , value;
        Node( int key, int value){
            this.key = key;
            this.value=value;
        }
    }
}
