package com.example.demo.algorithm.queue;

/**
 * 环形队列
 * @author jiange
 * @date 2020/10/20 16:52
 */
public class CricleArrayQueueDemo {
    public static void main(String[] args) {

    }
}
class CricleArray{
    private int maxSize;
    private int front; // 头 0
    private int rear;  // 尾 0
    private int[] arr;

    public CricleArray(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    public boolean isEnpty(){
        return front == rear;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满了");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue(){
        if (isEnpty()){
            throw new RuntimeException("队列为空，不能取数据");
        }
        int value = arr[front];
        front =  (front+1)%maxSize;
        return value;
    }


    public void showQueue(){
        if (isEnpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = front; i< front+ size() ; i++){
            System.out.printf("arr[%d]=%d\n", i%maxSize, arr[i%maxSize]);
        }
    }

    // 求出队列的有效数据
    public int size(){
        return (rear+maxSize-front) % maxSize;
    }

    // 显示队列的头
    public int headQueue(){
        if (isEnpty()){
            System.out.println("空");
            throw new RuntimeException("空列为空");
        }
        return arr[front];
    }

}
