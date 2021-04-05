package lanqiao;

import java.util.HashSet;
import java.util.Set;

public class 不同子串 {

    public static void main(String[] args) {

        String s = "aaab";

        Set<String> set = new HashSet();

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                set.add(s.substring(i,j+1));

            }
        }

        for (String s1:set
             ) {

            System.out.print(s1+" ");
        }

        System.out.println(set.size());
    }
}
