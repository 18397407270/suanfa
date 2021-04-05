package sort;

public class BinarySearch_Re {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7};

        int t = 5;

        int low = 0;

        int height = a.length-1;

        binarysearch(a,t,low,height);


    }

    private static void binarysearch(int[] a, int key, int low, int height) {

        if(low>height){
            System.out.println("No");
            return;
        }

        int mid = (low+height)/2;

        if(a[mid]<key){
            low = mid+1;
        }else if(a[mid]>key){
            height = mid-1;
        }else if(a[mid]==key){
            System.out.println(key);
            return;
        }

        binarysearch(a,key,low,height);

    }



}
