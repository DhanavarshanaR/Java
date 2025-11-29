public class QueueArr1 {
    static int size=5;
    int arr[];
    int rear=-1;
    QueueArr1(){
        arr=new int[size];
    }

    void enqueue(int data){
        if(rear==size-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(rear==-1){
            arr[++rear]=data;
            return;
        }
        arr[++rear]=data;
    }

    int dequeue() {
        if(rear==-1){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int temp=arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return temp;
    }

    public static void main(String[] args) {
        QueueArr1 q=new QueueArr1();

        q.enqueue(12);
        q.enqueue(34);
        q.enqueue(50);
        q.enqueue(10);
        q.enqueue(80);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        // System.out.println(q.dequeue());

    }
}
