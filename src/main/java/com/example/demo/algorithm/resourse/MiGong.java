package com.example.demo.algorithm.resourse;

import java.util.Arrays;

/**
 * @author jiange
 * @date 2020/10/28 11:41
 */
public class MiGong {
    public static void main(String[] args) {
        // 1表示墙
        int[][] map = new int[8][7];
        for (int i=0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i< 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        for (int i= 0; i< 8; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        setWay(map, 1,1);
        System.out.println("/////////");
        //走过的地图
        for (int i= 0; i< 8; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    // 2 表示可以走 3表示探测过，走不通
    // 策略 下-》右-》上-》左
    public static boolean setWay(int[][] map, int i, int j){
        if (map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] == 0){
                // 假定可以走通
                map[i][j] = 2;
                if (setWay(map, i+i, j)){
                    return true;
                }else if (setWay(map, i, j+1)){
                    return true;
                }else if (setWay(map, i-1, j)){
                    return true;
                }else if (setWay(map, i, j-1)){
                    return true;
                }else {
                    // 走不通
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
