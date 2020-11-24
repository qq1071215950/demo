package com.example.demo.algorithm.doubleLinkList;

import com.example.demo.algorithm.simglelink.SimgleLinkList;

/**
 * @author jiange
 * @date 2020/10/22 15:14
 */
public class DoubleLinkListDemo {
    public static void main(String[] args) {


    }
    class DoubleLinkList{
        // 头节点
        private HeroNode2 head = new HeroNode2(0, "", "");
        public HeroNode2 getHead2(){
            return head;
        }

        // 遍历
        public void list(){
            if (head.next == null){
                System.out.println("空");
                return;
            }
            HeroNode2 temp = head.next;
            while (true){
                if (temp == null){
                    break;
                }
                System.out.println(temp.toString());
                temp = temp.next;
            }
        }

        // 添加
        public void add(HeroNode2 heroNode){
            HeroNode2 temp = head;
            while (true){
                if (temp.next == null){
                    break;
                }
                temp = temp.next;
            }
            temp.next = heroNode;
            heroNode.pre = temp;
        }

    }


    class HeroNode2{
        public int no;
        public String name;
        public String nickName;
        public HeroNode2 next;
        public HeroNode2 pre;
        public HeroNode2(int no, String name, String nickName){
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'';
        }
    }
}

