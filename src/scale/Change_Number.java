package scale;

import java.util.Scanner;

/*给出一个数字,将其奇偶位交换*/
public class Change_Number {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        Integer sum = Change_number(number);

        System.out.println(sum);
    }

    private static Integer Change_number(int number) {

        Integer ji = number&0xaaaaaaaa;

        Integer ou = number&0x55555555;

        return (ou<<1)^(ji>>1);

    }
}
