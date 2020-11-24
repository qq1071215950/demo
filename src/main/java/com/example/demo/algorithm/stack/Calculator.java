package com.example.demo.algorithm.stack;

/**
 * @author jiange
 * @date 2020/10/27 15:15
 */
public class Calculator {
    public static void main(String[] args) {
        String expression = "30+2*6-2";
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operStack = new ArrayStack2(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";// 用于拼接多位数

        while (true){
            ch = expression.substring(index, index+1).charAt(0);
            // 判断字符
            if (operStack.isOper(ch)){
                if (!operStack.isEnpty()){
                    if (operStack.prority(ch) <= operStack.prority(operStack.peek())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(ch);
                    }else {
                        operStack.push(ch);
                    }
                }else {
                    operStack.push(ch);
                }
            }else {
                // 多位时有问题
                keepNum += ch;
                if (index == expression.length()-1){
                    numStack.push(Integer.parseInt(keepNum));
                }else {
                    if (operStack.isOper(expression.substring(index+1, index+2).charAt(0))){
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            index++;
            if (index>=expression.length()){
                break;
            }
        }
        while (true){
            // 如果符号栈为空，则得到最后的结果
            if (operStack.isEnpty()){
                break;
            }else {
                num1 = numStack.pop();
                num2 = numStack.pop();
                oper = operStack.pop();
                res = numStack.cal(num1, num2, oper);
                numStack.push(res);
            }
        }
        System.out.println("结果"+numStack.pop());
    }
}
class ArrayStack2{
    // 栈的大小
    private int maxSize;
    private int[] stack;
    // 栈顶
    private int top = -1;

    public ArrayStack2(int maxSize){
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

    public int peek(){
        return stack[top];
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

    // 返回运行符号的优先级
    public int prority(int oper){
        if (oper == '*' || oper == '/'){
            return 1;
        }else if (oper == '+' || oper == '-'){
            return 0;
        }else {
            return -1;
        }
    }

    // 判断是不是一个运行符号
    public boolean isOper(char val){
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * 计算
     * @param num1
     * @param num2
     * @param oper
     * @return
     */
    public int cal(int num1, int num2, int oper){
        int res = 0;
        switch (oper){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }

}
