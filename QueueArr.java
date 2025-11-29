public class QueueArr {
    static int size=5;
    int arr[];
    int front=-1;
    int rear=-1;
    QueueArr(){
        arr=new int[size];
    }

    void enqueue(int data){
        if(rear==size-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front==-1 && rear==-1){
            front++;
            arr[++rear]=data;
            return;
        }
        arr[++rear]=data;
    }

    int dequeue() {
        if(front==-1 || rear==-1 || front>rear){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return arr[front++];
    }

    public static void main(String[] args) {
        QueueArr q=new QueueArr();

        q.enqueue(12);
        q.enqueue(34);
        q.enqueue(50);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}
