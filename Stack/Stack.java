class Stack {
    static int MAX_SIZE = 1000;
    int top;
    int A[] = new int[MAX_SIZE];

    boolean isEmpty() {
        if(top < 0) {
            return true;
        }
        return false;
    }
    Stack() {
        this.top = -1;
    }
    boolean push(int n) {
        if(this.top < (this.MAX_SIZE -1) ) {
            this.A[++this.top] = n;
            return true;
        }
        return false;
    }
    int pop() {
        if(this.top < 0) {
            // underflow condition
            System.out.println("Can't remove item");
            return -99999;
        }
        System.out.println("Going to remove item : " + this.A[this.top] );
        return this.A[this.top--];
    }
    int peek() {
        if(this.top < 0) {
            // no element present
            return -99999;
        }
        return this.A[this.top];
    }
    void display() {
        System.out.println();
        for(int i=0; i <= this.top; i++) {
            System.out.print(" --> " + this.A[i]);
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.push(40);
        stack.push(80);
        stack.display();
        stack.pop();
        System.out.println("Top : " + stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
        stack.push(85);
        stack.push(90);
        stack.display();
        System.out.println("Top : " + stack.peek());
    }
}