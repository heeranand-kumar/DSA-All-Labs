// Singly Stack 

class Stack1 {
    Node top;
    int size;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


    
    public Stack1() {
        top = null;
        size = 0;
    }

   
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return top.data;
    }

  
    public boolean isEmpty() {
        return top == null;
    }

 
    public int size() {
        return size;
    }

    
    public void printStack() {
        Node temp = top;
        System.out.println("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1();

      
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStack();
        System.out.println("Size: " + stack.size()); 
        System.out.println("Top: " + stack.peek()); 

       
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 
        stack.printStack(); 
        System.out.println("Size: " + stack.size()); 
        System.out.println("Top: " + stack.peek()); 

       
        System.out.println("Is Empty? " + stack.isEmpty()); 

        
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is Empty? " + stack.isEmpty()); 
    }
}




