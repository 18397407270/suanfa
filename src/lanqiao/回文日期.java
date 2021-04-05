package lanqiao;

import java.util.Scanner;

public class 回文日期 {

    static int dd [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static int JugD(int y,int m){



        if (Judge(y)){

            dd[2] = 29;
        }else {
            dd[2] = 28;
        }

        return dd[m];
    }

    public static boolean JugM(int m){

        if(m<=12&&m>0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int n = in.nextInt();

            int i = n/10000;

            for (; i <= 8221; i++) {


                StringBuilder sb = new StringBuilder(i+"");

                StringBuilder sb2 = new StringBuilder(i+"");

                int m = Integer.parseInt(sb.reverse().substring(0,2));

                int d = Integer.parseInt(sb.substring(2,4));

                if(JugM(m)&&JugD(i,m)>=d&&d>0){


                    String s = sb2.append(sb).toString();

                    Integer re = Integer.parseInt(s);

                    if(re==n){

                        continue;

                    }


                    System.out.println(re);

                    break;

                }

            }

            for (; i <= 8221; i++) {

                StringBuilder sb = new StringBuilder(i+"");

                StringBuilder sb2 = new StringBuilder(i+"");

                if(sb.charAt(0)==sb.charAt(2)&&sb.charAt(1)==sb.charAt(3)){

                    int m = Integer.parseInt(sb.reverse().substring(0,2));

                    int d = Integer.parseInt(sb.substring(2,4));

                    if(JugM(m)&&JugD(i,m)>=d&&d>0){

                        String s = sb2.append(sb).toString();

                        Integer re = Integer.parseInt(s);

                        System.out.println(re);

                        break;

                    }
                }




            }
        }


    public static boolean Judge(int n){

        return (n%4==0&&n%100!=0)||n%400==0;
    }
}
