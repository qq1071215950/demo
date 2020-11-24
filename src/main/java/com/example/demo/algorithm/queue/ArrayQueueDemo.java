package com.example.demo.algorithm.queue;

import java.util.Scanner;

/**
 * @author jiange
 * @date 2020/10/20 14:49
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);
        queue.showQueue();
        System.out.println(queue.headQueue());

    }
}
class ArrayQueue{
    private int maxSize;
    private int front; // 头
    private int rear;  // 尾
    private int[] arr;

    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        return rear == maxSize-1;
    }

    public boolean isEnpty(){
        return front == rear;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满了");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue(){
        if (isEnpty()){
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }

    public void showQueue(){
        if (isEnpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = 0; i<arr.length; i++){
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    // 显示队列的头
    public int headQueue(){
        if (isEnpty()){
            System.out.println("空");
            throw new RuntimeException("空列为空");
        }
        front++;
        return arr[front];
    }

}
