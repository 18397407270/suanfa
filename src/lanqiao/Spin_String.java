package lanqiao;

public class Spin_String {

    public static void main(String[] args) {

        /*
        * 判断s2是不是能由s1旋转得来的子串
        *
        *
        * */


        String s1 ="acdfgs";//原串

        String s2 ="dfgsa";//旋转之后的串

        Boolean re = Judge(s1,s2);

        System.out.println(re);
    }

    private static Boolean Judge(String s1, String s2) {

        StringBuilder builder = new StringBuilder();

        builder.append(s1).append(s1);

        return builder.toString().contains(s2);


    }
}
