package scale;

public class K_and_One {

    public static void main(String[] args) {

        /*假设此时k为3*/

        Integer a[] = {3,3,3,6,6,6,7,7,7,8,8,8,9,9,9,4,4,4,0,0,0,5};

        Integer o =  Find_One(a);

        System.out.println(o);
    }

    private static Integer Find_One(Integer[] a) {

        Integer x = -1;

        Integer count = 0;

        for (int i=0;i<a.length;i++){

            x = a[i];

            for (int j=0;j<a.length;j++){

                if(a[j]==x){
                    count++;
                }
            }

            if(count==1){
                return a[i];
            }else {
                count=0;
            }

        }

        return -1;
    }
}
