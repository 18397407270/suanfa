package lanqiao;

public class 去除连续出现K次的0 {

    public static void main(String[] args) {

        String s1 = "10001001";

        int k = 3;

        //解法一
        String s = Remove(s1,k);

        //解法二

        String s2 = Remove2(s1,k);

        System.out.println(s);

        System.out.println(s2);
    }

    private static String Remove2(String s1, int k) {

        StringBuilder sb = new StringBuilder();

        char[] chars = s1.toCharArray();

        int count = 0;

        for (int i = 0; i < chars.length; i++) {

            char s = chars[i];

            if(s=='0'){
                count++;
            }else {

                for (int j = 0; j < count%k; j++) {

                    sb.append(0);
                }

                sb.append(s);

                count=0;
            }
        }

        for (int j = 0; j < count%k; j++) {

            sb.append(0);
        }

        return sb.toString();
    }

    private static String Remove(String s1, int k) {

        String p = "0{"+k+"}";

        String s = s1.replaceAll(p, "");

        return s;
    }
}
