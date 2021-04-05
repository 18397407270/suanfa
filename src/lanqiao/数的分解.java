package lanqiao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 数的分解 {

    public static void main(String[] args) {

        int count = 0;


        for (int i = 1; i <=2019; i++) {

            String s = i+"";

            if(s.contains("2")||s.contains("4")){

                continue;

            }

            for (int j = i+1; j <=2019; j++) {

                String s1 = j+"";

                if(s1.contains("2")||s1.contains("4")){

                    continue;

                }

                int k = 2019-i-j;

                String s3 = k+"";

                if(k>j&&!s3.contains("2")&&!s3.contains("4")){

                    System.out.println(i+"+"+j+"+"+k);

                    count++;

                }


            }
        }

        System.out.println(count);
    }
}
