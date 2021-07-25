import java.util.Arrays;
public class car {
    public static void main(String[] args) {
        int num2[][][] = {
                {{0, 1, 2}, {4, 5}},
                {{6}, {7, 8}, {9}},
                {{10, 11}}
        };
        for (int i = 0; i < num2.length; i++) {
            System.out.print("三维数组输出值：");
            for (int j = 0; j < num2[i].length; j++) {
                for (int k = 0; k < num2[i][j].length; k++) {
                    System.out.print(" " + num2[i][j][k]);
                }
            }
        }
    }
    }

