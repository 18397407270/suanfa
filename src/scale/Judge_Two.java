package scale;

import java.util.Scanner;

/*判断一个数是否是2的整数次方*/
public class Judge_Two {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        String judge = Jugge_two(number);

        System.out.println(judge);
    }

    private static String Jugge_two(int number) {

        if(number ==0){
            return "No";
        }

        Integer count = 0;

        while (number!=0){

            number = number&(number-1);

            count++;
        }

        if(count==1){
            return "Yes";
        }

        return "No";
    }
}
