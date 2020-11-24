package com.example.demo.algorithm.simglelink;

import java.util.Stack;

/**
 * @author jiange
 * @date 2020/10/21 10:39
 */
public class SimgleLinkList {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "松江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "测试", "测试");
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.add(heroNode1);
        singleLinkList.add(heroNode2);
        singleLinkList.list();
        //singleLinkList.reverseLiist(singleLinkList.head);
        System.out.println("//////////");
        //singleLinkList.list();
        System.out.println("///////");
        singleLinkList.reversePrint(singleLinkList.head);
    }



    static class SingleLinkList{
        // 头节点
        private HeroNode head = new HeroNode(0,"", "");

        public void add(HeroNode heroNode){
            HeroNode temp = head;
            while (true){
                if (temp.next == null){
                    break;
                }
                temp = temp.next;
            }
            temp.next = heroNode;
        }

        public void list(){
            if (head.next == null){
                System.out.println("空");
                return;
            }
            HeroNode temp = head.next;
            while (true){
                if (temp == null){
                    break;
                }
                System.out.println(temp.toString());
                temp = temp.next;
            }
        }
          // 单链表反转
         public void reverseLiist(HeroNode head){
            // 如果当前链表为空或者只有一个节点无需反转
            if (head.next == null || head.next.next == null){
                return;
            }
            // 定义一个辅助变量
            HeroNode cur = head.next;
            HeroNode next = null;
            HeroNode reverseHead = new HeroNode(0, "", "");
            // 遍历原来的链表
            while (cur != null){
                next = cur.next;// 保存当前节点的下一个节点
                cur.next = reverseHead.next;
                reverseHead.next = cur;
                cur = next;
            }
            head.next = reverseHead.next;
        }

        /**
         * 按照编号来添加
         * @param heroNode
         */
        public void addByOrder(HeroNode heroNode){
            HeroNode temp = heroNode;
            boolean flag = false;
            while (true){
                if (temp.next == null){
                    break;
                }
                if (temp.next.no > heroNode.no){
                    break;
                }
                if (temp.next.no == heroNode.no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (false){
                System.out.println("不能添加");
            }else {
                heroNode.next = temp.next;
                temp.next = heroNode;
            }
        }

        // 修改节点信息  根据no修改节点信息
        public void update(HeroNode newHeroNode){
            if (head.next == null){
                System.out.println("数据为空");
                return;
            }
            HeroNode temp = head.next;
            boolean flag = false;
            while (true){
                if (temp == null){
                    break;
                }
                if (temp.no == newHeroNode.no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (flag){
                temp.name = newHeroNode.name;
                temp.nickName = newHeroNode.nickName;
            }else {
                System.out.println("没有找到编号信息");
            }
        }

        // 逆序打印 可以采用栈的形式
        public void reversePrint(HeroNode head){
            if (head.next == null){
                return;// 空链表
            }
            Stack<HeroNode> stack = new Stack<>();
            HeroNode cur = head.next;
            while (cur != null){
                stack.push(cur);
                cur = cur.next;
            }
            while (stack.size() > 0){
                System.out.println(stack.pop());
            }
        }

    }


    static class HeroNode{
        public int no;
        public String name;
        public String nickName;
        public HeroNode next;
        public HeroNode(int no, String name, String nickName){
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
