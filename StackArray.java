public class StackArray {

    int size;
    int [] stack;
    int top=-1;
    public StackArray() {
        size = 10;
        stack = new int[size];
    }

    void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
    }

    int pop(){
        if(top==-1){
            System.out.println(" Stack Underflow");
        }
        return stack[top--];
    }

    int peek(){
        return stack[top];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        StackArray stack=new StackArray();
        stack.push(5);
        stack.push(9);
        stack.push(8);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        
    }
}
