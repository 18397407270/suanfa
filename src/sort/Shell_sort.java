package sort;

public class Shell_sort {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5,4,654,768,54,4,2423,12,5};

        int b[] = new int[1001];

        for (int i = 0; i < 1000; i++) {

            b[i] = (int)(Math.random()*(1000-1)+1);

        }

        Shellsort(b);

    }

    public static void Shellsort(int [] a){

        //增量
        for (int i =(a.length)/2 ; i >0 ; i=i/2) {

            for (int j = i; j < a.length; j++) {

                if(a[j]<a[j-i]){

                    int temp = a[j];

                    int k ;

                    for (k = j-i; k >=0&&a[k]>temp ; k = k-i) {
                        a[k+i] = a[k];
                    }

                    a[k+i] = temp;
                }


            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"-");
        }
    }


}
