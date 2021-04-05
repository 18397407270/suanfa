package lanqiao;

import test.最长重复子串;

import java.util.Arrays;

public class 后缀数组 {

    public static void main(String[] args) {

        String s1 = "ababab";

        String s2 = "aba";

        //match(s1,s2);

        Suff[] suff = getSuff(s1);

        System.out.println(Arrays.toString(suff));

        int[] height = getHeight(s1, suff);

        System.out.println(Arrays.toString(height));

    }

    private static void match(String s1, String s2) {

        Suff suff [] = getSuff(s1);//HouzhuiSuff(s1);

        System.out.println(Arrays.toString(suff));

        int l = 0;

        int r = suff.length-1;

        int mid = (r+l)/2;

        while (l<=r){


            int compare = 0;

            String Osuff = suff[mid].s;

            if(Osuff.length()>s2.length()){

                compare = Osuff.substring(0,s2.length()).compareTo(s2);

            }else {

                compare = Osuff.compareTo(s2);

            }

            if(compare<0){

                l = mid+1;
            }
            else if(compare>0){

                r = mid-1;
            }else {

                System.out.println(suff[mid].index);

                System.out.println(s1.substring(suff[mid].index,s2.length()));

                break;
            }




        }
    }

    private static Suff[] HouzhuiSuff(String s1) {

        Suff [] suffs = new Suff[s1.length()];

        for (int i = 0; i < s1.length(); i++) {

            suffs[i] = new Suff(i,s1.substring(i,s1.length())) ;

        }

        Arrays.sort(suffs);

        return suffs;
    }

    public static Suff [] getSuff(String s1){

        int n = s1.length();

        Suff [] suffs = new Suff[n];//子串数组

        int [] rk = new int[n];//下标到排名的映射数组  例如rk[1] = 0;  表示的是下标为1的字符在子串中排名为0;

        for (int k = 1; k < n; k = k*2) {

            /*
            * 倍增法构建Suffs数组
            * */
            for (int i = 0; i < n; i++) {

                suffs[i] = new Suff(i,s1.substring(i, Math.min((i + k), n)));
            }

            if(k==1){
                Arrays.sort(suffs);//nlog(n)
            }else {

                /*从第二倍开始自定义排序*/

                final int kk = k;

                Arrays.sort(suffs,(o1,o2)->{

                    int i = o1.index;

                    int j = o2.index;

                    if(rk[i]==rk[j]){

                        try{

                            return rk[i+kk/2] - rk[j+kk/2];

                        }catch (ArrayIndexOutOfBoundsException e){

                            return o1.s.length() - o2.s.length();
                        }
                    }else {
                        return rk[i] - rk[j];
                    }
                });
            }

            int r = 0;

            rk[suffs[0].index] = r;

            for (int i = 1; i < n; i++) {

                if(suffs[i].compareTo(suffs[i-1])==0){

                    rk[suffs[i].index] = r;

                }else {

                    rk[suffs[i].index] = ++r;

                }


            }
        }


        return suffs;
    }

    public static int [] getHeight(String src,Suff [] sa){

        int n =  src.length();

        int [] rk = new int[n];

        /*
        * rk数组不重复排名
        * */
        for (int i = 0; i < n; i++) {

            rk[sa[i].index] = i;
        }

        //定义高度数组
        int  [] height= new int[n];

        int k = 0;

        for (int i = 0; i < n; i++) {

            int rankSuffi = rk[i];

            if(rankSuffi==0){

                height[0] = 0;

                continue;

            }

            int rankPre = rankSuffi - 1;

            int j = sa[rankPre].index; //j 是 i串字典序前的的串的下标

            while (k>0) {
                k--;
            }

            for (; (j+k)<n&&(i+k)<n; k++) {

                if(src.charAt(j+k)!=src.charAt(i+k)){

                    break;

                }

            }
            height[rankSuffi] = k;


        }

        return height;
    }
}

class Suff implements Comparable<Suff>{

    String s;

    int index;



    public Suff(int index, String s) {
        this.index = index;
        this.s = s;
    }

    @Override
    public int compareTo(Suff o) {

        return this.s.compareTo(o.s);

    }

    @Override
    public String toString() {
        return "Suff{" +
                "index=" + index +
                ", s=" + s +
                '}';
    }
}
