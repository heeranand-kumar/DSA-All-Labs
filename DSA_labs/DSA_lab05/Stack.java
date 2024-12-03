/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.stack;

/**
 *
 * @author sys
 */
public class Stack {
    private int capacity = 5;
    private int[] array;
    private int top;

    public Stack() {
        array = new int[capacity];
        top = -1;
    }
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        array[++top] = data;
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return array[top--];
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return array[top];
    }


    public boolean isEmpty() {
        return top == -1;
    }

  
    public boolean isFull() {
        return top == capacity - 1;
    }

   
    public int size() {
        return top + 1;
    }

    
    public void printStack() {
        System.out.println("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements
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



 