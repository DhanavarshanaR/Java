class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class StackLinkedList {

    Node top=null;

    void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(top==null){
            System.out.println("Stack Underflow");
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }

    int peek(){
        return top.data;
    }
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackLinkedList stack=new StackLinkedList();

        stack.push(50);
        stack.push(93);
        stack.push(84);
        stack.push(41);

        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}
