package test;

import java.util.Arrays;

public class 最长重复子串 {

    public static void main(String[] args) {

        String s1 = "123232323";

        Suff[] suff = getSuff(s1);


        int[] height = getHeight(s1, suff);

        System.out.println(Arrays.toString(height));

        int max = height[0];

        int maxIndex = 0;

        for (int i = 0; i < height.length; i++) {

            if(height[i]>max){

                max = height[i];

                maxIndex = i;
            }
        }

        System.out.println(max);

        System.out.println(s1.substring(suff[maxIndex].index,suff[maxIndex].index+max));


    }

    public static Suff [] getSuff(String s1){

        int n = s1.length();

        Suff [] suffs = new Suff[n];

        int  [] rk = new int[n];

        for (int k = 1; k < n; k = 2*k) {

            for (int i = 0; i <n ; i++) {

                suffs [i] = new Suff(s1.substring(i,Math.min(i+k,n)),i);
            }

            if(k==1){

                Arrays.sort(suffs);
            }else {

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


            rk[suffs[0].index] = 0;

            for (int i = 1; i < n; i++) {

                rk[suffs[i].index] = rk[suffs[i-1].index];

                if(suffs[i].compareTo(suffs[i-1])!=0){

                    rk[suffs[i].index]++;

                }
            }

        }

        return suffs;
    }

    public static int [] getHeight(String src, Suff[] sa){

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

    static class Suff implements Comparable<Suff> {

        String s;

        int index;

        public Suff(String s, int index) {

            this.s = s;

            this.index = index;

        }


        @Override
        public int compareTo(Suff o) {
            return this.s.compareTo(o.s);
        }

        @Override
        public String toString() {
            return "Suff{" +
                    "s='" + s + '\'' +
                    ", index=" + index +
                    '}';
        }
    }
}
