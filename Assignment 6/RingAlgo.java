import java.util.*;
class CircularList{
    
    public class Node{
        int data ;
        Node next;
        public Node(int val){
            this.data = val;
        }
        
    }
    
    Node head = null;
    Node tail = null;
    
    public void add(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    public void display(){
        Node curr = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
        System.out.println("Circular List formed as below");
        do{
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }while(curr != head);
        System.out.println(head.data);
        }
    }
    
    public void delete(int value){
        Node curr = head;
        Node prev = null;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        
        while(curr.data != value){
            if(curr.next == head){
                System.out.println(value + " is not present in Circular List");
                return;
            }
            prev = curr;
            curr = curr.next;
            
        }
        
        if(curr == head && curr.next == head){
            head = null;
            tail = null;
            return;
        }
        
        if(curr == head){
            head = curr.next;
            tail.next = head;
        }
        else if(curr ==tail){
            tail = prev;
            tail.next = head;
        }
        else {
            prev.next = curr.next;
        }
    }
    
    public void display(int value){
        Queue<Integer> qu = new LinkedList<>();
        Node temp = head;
        Node curr = head;
        while(curr.data != value){
            curr= curr.next;
        }
        System.out.println(curr.data + "sends Message ");
        qu.add(curr.data);
        System.out.println(qu);
        curr = curr.next;
        
        while(curr.data != value){
            if(curr.data > value){
                qu.remove();
                System.out.println(curr.data +" Sends Message");
                qu.add(curr.data);
                System.out.println(qu);
                value = curr.data;
                curr = curr.next;
            }
            else{
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
        while(temp.data != value){
            System.out.println(temp.data +" sends the message that coordinator is "+ value);
            temp = temp.next;
        }
    }
}

class RingAlgo{
    
    public static void main(String []args){
        Scanner cs = new Scanner(System.in);
        CircularList nodes = new CircularList();
        int option = 0;
        int down = 0;
        int start =0;
        do{
            System.out.println("Enter the ID of the process");
            start = cs.nextInt();
            nodes.add(start);
            System.out.println("Do you want to add the new process ID, If Yes -> 1 or No -> 0");
            option = cs.nextInt();
            
            
        }
        while(option ==1);
        nodes.display();
        System.out.println("Enter the process ID that fails ");
        down = cs.nextInt();
        nodes.delete(down);
        nodes.display();
        System.out.println("Enter the process ID that initiates that election ");
        int ini = cs.nextInt();
        nodes.display(ini);
        
        
        
    }
}
