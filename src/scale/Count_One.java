package scale;/*给出一个数字(大于等于0),求出其二进制形式下1的个数*/
import java.util.Scanner;
public class Count_One {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        Integer sum = Count_one(number);

        System.out.println(sum);
    }

    private static Integer Count_one(int number) {

        if(number ==0){
            return 0;
        }

        Integer count = 0;

        while (number!=0){

            number = number&(number-1);

            count++;
        }

        return count;
    }
}
