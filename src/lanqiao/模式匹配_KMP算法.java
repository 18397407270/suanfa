package lanqiao;

public class 模式匹配_KMP算法 {

    public static void main(String[] args) {


        String s1 = "ababaabababa";

        String s2 = "ababa";

        int re = match(s1,s2);

        System.out.println(s1.charAt(re)+"--"+s1.charAt(re+s2.length()-1));

        match2(s1,s2);


    }

    private static int match(String s1, String s2) {

        if(s1.length()==0||s2.length()==0||s2.length()>s1.length()){
            return -1;
        }

        int next [] = Next(s2);

        int j = 0;

        int i = 0;

        while (i<s1.length()){

            if(j==-1||s1.charAt(i)==s2.charAt(j)){

                i++;
                j++;

            }else {

                j = next[j];
            }

            if(j==s2.length()){

                return (i-j);


            }
        }

        return -1;
    }


    /**
     * 多字符匹配
     * @param s1
     * @param s2
     */
    private static void match2(String s1, String s2) {

        if(s1.length()==0||s2.length()==0||s2.length()>s1.length()){

            System.out.println("无匹配字符串");
        }

        int next [] = Next(s2);

        int j = 0;

        int i = 0;

        while (i<s1.length()){

            if(j==-1||s1.charAt(i)==s2.charAt(j)){

                i++;
                j++;

            }else {

                j = next[j];
            }

            if(j==s2.length()){

                System.out.println(i-j);

                i--;

                j = next[j-1];
            }
        }

    }

    private static int[] Next(String s2) {

        int n = s2.length();

        int next [] = new int[n];

        char[] s = s2.toCharArray();

        next[0] = -1;

        if(s2.length()==1){

            return next;

        }

        next[1] = 0;

        int j = 1;

        int k = next[j];

        while (j<n-1){

            if(k<0||s[j]==s[k]){

                next[++j] = ++k;
            }
            else {

                k = next[k];

            }
        }

        return next;


    }
}
