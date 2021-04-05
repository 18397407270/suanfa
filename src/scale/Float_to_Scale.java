package scale;

import java.util.Scanner;

/*题目描述:输入一个浮点小数,将其转化为二进制*/
public class Float_to_Scale {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Float f = in.nextFloat();

        String sc = Float_to_scale(f);

        System.out.println(sc);

    }

    private static String Float_to_scale(Float f) {

        StringBuilder builder = new StringBuilder("0.");

        while (f>0){

            Float x = f*2;

            if(x>=1){
                builder.append("1");
                f = x-1;
            }else {

                builder.append("0");
                f = x;
            }

            if(builder.length()>34){
                return "error";
            }

        }

        return builder.toString();
    }
}
