public class QueueLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front;
    Node rear;

    void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        rear.next=newNode;
        rear=rear.next;
    }
    int dequeue(){
        if(front==null){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int temp=front.data;
        front=front.next;
        return temp;
    }

    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
