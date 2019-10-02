class Queue {
    // FIFO Queue
    static int MAX_SIZE = 1000;
    int top;
    int bottom;
    int A[] = new int[MAX_SIZE];

    boolean isEmpty() {
        if(top < 0) {
            return true;
        }
        return false;
    }
    Queue() {
        this.top = -1;
        this.bottom = 0;
    }
    boolean push(int n) {
        if(this.top < (this.MAX_SIZE - 1) ) {
            this.A[++this.top] = n;
            return true;
        }
        return false;
    }
    int pop() {
        if( (this.top < 0) || (this.bottom >= this.top) ){
            // underflow condition
            System.out.println("Can't remove item");
            return -99999;
        }
        System.out.println("Going to remove item : " + this.A[this.bottom] );
        return this.A[this.bottom++];
    }
    int peek() {
        if( (this.top < 0) || (this.bottom == this.top) ){
            // no element present
            return -99999;
        }
        return this.A[this.bottom];
    }
    void display() {
        System.out.println();
        for(int i=this.bottom ; i <= this.top; i++) {
            System.out.print(" --> " + this.A[i]);
        }
        System.out.println();
    }
}

class SimpleQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(10);
        queue.push(30);
        queue.push(20);
        queue.push(40);
        queue.push(68);
        queue.display();
        queue.pop();
        System.out.println("Top : " + queue.peek());
        queue.pop();
        queue.pop();
        queue.display();
        queue.push(85);
        queue.push(90);
        queue.display();
        System.out.println("Top : " + queue.peek());
    }
}