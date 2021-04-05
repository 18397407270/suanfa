package lanqiao;

import java.util.Arrays;

public class 模式匹配 {

    static int seek = 31;

    public static void main(String[] args) {

        /*
        * 利用hash值进行模式匹配
        * 将待匹配的字符串用hash算法转为hash值
        * 然后在源字符串中按照待匹配的字符串的长度进行截取等长的字符串,计算其hash与待匹配的hash值是否相同,相同则匹配成功
        * 大数据量会有hash冲突,即两个不同的字符串一样的hash值
        * */

        String s1 = "ababababababababababababababababababababababbabaabbababababababababa";

        String s2 = "bab";


        //Pattern_matching(s1,s2);

        Pattern_matching2(s1,s2);

    }

    /**
     * O(n*m)
     * @param s1
     * @param s2
     */

    private static void Pattern_matching(String s1, String s2) {

        long h1 = hash(s2);

        int n = s2.length();

        for (int i = 0; i < s1.length(); i++) {

            if((i+n)<=s1.length()&&hash(s1.substring(i,i+n))==h1){

                for (int j = i; j < i+n; j++) {

                    System.out.print(s1.charAt(j));
                }

                System.out.println();


            }

        }


    }

    /**
     * 滚动hash
     * O(m+n)
     * @param s1
     * @param s2
     */
    private static void Pattern_matching2(String s1, String s2) {

        long h1 = hash(s2);

        long[] hash = hash(s1, s2.length());

        System.out.println(Arrays.toString(hash));


        int n = hash.length;

        for (int i = 0; i < n; i++) {

            if(hash[i]==h1){

                for (int j = i; j < i+s2.length(); j++) {

                    System.out.print(s1.charAt(j));

                }

                System.out.println();


            }

        }


    }



    /**
     * 求字符串的hash值
     * @param s
     * @return
     */
    public static long hash(String s){

        long hash = 0;

        for (int i = 0; i < s.length(); i++) {

            hash = seek*hash+s.charAt(i);
        }

        return hash;
    }

    /**
     * 滚动hash
     * @param s
     * @param n
     * @return
     */
    public static long[] hash(String s,int n){

        long [] res = new long[s.length()-n+1];

        res[0] = hash(s.substring(0,n));

        for (int i = n; i < s.length(); i++) {

            char newchar = s.charAt(i);

            char oldchar = s.charAt(i-n);

            long v = (res[i-n]*seek+newchar - (long) (Math.pow(seek,n)*oldchar))%Long.MAX_VALUE;

            if(v<0){
                v+=Long.MAX_VALUE;
            }

            res[i-n+1] = v;

        }

        return res;
    }
}
