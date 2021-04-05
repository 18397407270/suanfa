package test;

public class Print_Arr {

    public static void main(String[] args) {


        int a[][] = {{1, 2, 3, 4},
                     {5, 7, 8, 7},
                     {5, 2, 6, 9},
                     {5, 2, 6, 9}};


        int leftRow = 0;

        int leftCol = 0;

        int rightRow = a.length - 1;

        int rightCol = a[0].length - 1;

        while (leftRow<=rightRow&&leftCol<rightCol) {

            int c = leftCol;

            int r = leftRow;

            while (c <= rightCol) {

                System.out.print(a[r][c++] + " ");

            }

            c = rightCol;

            r++;

            while (r <= rightRow) {

                System.out.print(a[r++][c] + " ");
            }

            r = rightRow;

            c--;

            while (c >= leftCol) {

                System.out.print(a[r][c--] + " ");

            }

            c = leftCol;

            r--;

            while (r > leftRow) {
                System.out.print(a[r--][c] + " ");
            }

            leftRow++;

            leftCol++;

            rightRow--;

            rightCol--;



        }
    }
}
