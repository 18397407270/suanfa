package test;

public class rectangle {

    static int help[][][];

    public static void main(String[] args) {

        /*
        * 找出二维数组中边界全为1的最大的正方形
        *
        * */

        int a[][] = {{1,1,1,1},
                     {1,1,0,1},
                     {1,1,0,1},
                     {1,1,0,1}};

        Create_Help(a);

        print(help);

        int re = Solve(a);

        System.out.println(re);

    }

    private static int Solve(int[][] a) {

        int N = a.length;

        int M = a[0].length;

        int n = N;


        while (n>0){

            for (int i = 0; i < N; i++) {

                if(i+n>N){

                    break;

                }

                for (int j = 0; j < M; j++) {

                    if(j+n>N){

                        break;

                    }

                    if(help[i][j][0]>=n&&help[i][j][1]>=n&&help[i][j+n-1][1]>=n&&help[i+n-1][j][0]>=n){

                        return n;
                    }

                }
            }
            n--;
        }



        return 1;
    }

    private static void print(int[][][] help) {

        int N = help.length;

        int M = help[0].length;

        int n = N;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {

                System.out.print(help[i][j][0]+","+help[i][j][1]+"\t");

            }

            System.out.println();


        }
    }


    private static void Create_Help(int[][] a) {

        int N = a.length;

        int M = a[0].length;

        help = new int[N][M][2];

        int row = N-1;

        for (int i = M-1; i >=0; i--) {

            if(a[row][i]==1){

                if(i==M-1){

                    help[row][i][0] = 1;
                }else {

                    help[row][i][0] = help[row][i+1][0]+1;
                }

                help[row][i][1] = 1;
            }
        }

        row--;

        for (int i = row; i >=0 ; i--) {

            for (int j = M-1; j >=0 ; j--) {

                if(a[i][j]==1){

                    if(j==M-1){

                        help[i][j][0] = 1;
                    }else {

                        help[i][j][0] = help[i][j+1][0]+1;
                    }

                    help[i][j][1] = help[i+1][j][1]+1;
                }
            }
        }
    }
}
