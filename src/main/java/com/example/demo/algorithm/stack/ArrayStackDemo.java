package com.example.demo.algorithm.stack;

/**
 * @author jiange
 * @date 2020/10/27 14:38
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.list();

    }
}
class ArrayStack{
    // 栈的大小
    private int maxSize;
    private int[] stack;
    // 栈顶
    private int top = -1;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEnpty(){
        return top == -1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("full");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop(){
        if (isEnpty()){
            throw new RuntimeException("enpty");
        }
        int value = stack[top];
        top--;
        return value;
    }

    public void list(){
        if (isEnpty()){
            System.out.println("enpty");
            return;
        }
        for (int i = top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

}
