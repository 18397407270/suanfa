package lanqiao;

import java.util.Scanner;

public class hiho匹配 {

    /*
    *
    * 如果一个字符串恰好包含2个'h'、1个'i'和1个'o'，我们就称这个字符串是hiho字符串。

    * 例如"oihateher"、"hugeinputhugeoutput"都是hiho字符串。

    现在给定一个只包含小写字母的字符串S，小Hi想知道S的所有子串中，最短的hiho字符串是哪个
    * */

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        while (in.hasNext()){

            String s = in.next();

            int min = Integer.MAX_VALUE;

            int j = -1;

            char[] m = s.toCharArray();

            for (int i = 0; i < m.length; i++) {

                char c = m[i];

                if(check(c)){

                    if(j==-1){

                        j = i+1;

                    }

                    while (j<m.length){

                        char c2 = m[j];

                        if(check(c2)&&containsAll(m,i,j)){

                            if(check(m,i,j)&&(j-i+1)<min){

                                min = j-i+1;
                            }

                            break;

                        }

                        j++;
                    }
                }
            }

            if(min==Integer.MAX_VALUE){
                System.out.println(-1);
            }else {

                System.out.println(min);
            }


        }





    }

    private static boolean check(char c) {

        return c=='h'|| c=='i'|| c=='o';
    }

    private static boolean check(char [] w,int i,int j) {

        int count1= 0;

        int count2 = 0;

        int count3 = 0;

        for (int k = i; k <=j; k++) {

            if(w[k]=='h'){
                count1++;
            }

            if(w[k]=='i'){
                count2++;
            }

            if(w[k]=='o'){
                count3++;
            }
        }

        return count1==2&&count2==1&&count3==1;
    }

    private static boolean containsAll(char [] w,int i,int j) {

        int count1= 0;

        int count2 = 0;

        int count3 = 0;

        for (int k = i; k <=j; k++) {

            if(w[k]=='h'){
                count1++;
            }

            if(w[k]=='i'){
                count2++;
            }

            if(w[k]=='o'){
                count3++;
            }
        }

        return count1>=2&&count2>=1&&count3>=1;
    }
}
