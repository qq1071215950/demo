package com.example.demo.algorithm.sparse;

/**
 * 稀疏数组
 * @author jiange
 * @date 2020/10/20 14:01
 */
public class SparseArray {
    public static void main(String[] args) {
        // 搭建一个原始的二维数组 11 x 11
        // 0:表示没有棋，1 表示黑棋 2 蓝棋
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[3][4] = 2;
        System.out.println("原始的二维数组");
        for (int[] row : chessArr1){
            for (int data : row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 将二维数组转成稀疏
        // 1 先遍历二维数组，得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                if (chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }
        // 2 创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        // 3 遍历二维数组，非0数据放到sparseArr中
        int count = 0;
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                if (chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("稀疏数组");
        for (int i =0; i < sparseArr.length; i++){
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }


    }
}
