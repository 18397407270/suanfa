package tree;

public class CreateTree {

    /**
     * @author hzh
     * 完全二叉树递归遍历
     */

    /**
     * 递归先序遍历
     * @param a
     * @param index
     */
    public static void PreOrder(int a[],int index){

        if(index>=a.length){
            return;
        }

        System.out.print(a[index]+" ");

        PreOrder(a,2*index+1);
        PreOrder(a, 2*index+2);
    }

    /**
     *
     * 中序遍历
     * @param a
     * @param index
     */
    public static void InOrder(int a[],int index){

        if(index>=a.length){
            return;
        }
        InOrder(a,2*index+1);

        System.out.print(a[index]+" ");

        InOrder(a, 2*index+2);
    }

    /**
     * 后序遍历
     * @param a
     * @param index
     */
    public static void AfterOrder(int a[],int index){

        if(index>=a.length){
            return;
        }

        AfterOrder(a,2*index+1);

        AfterOrder(a, 2*index+2);

        System.out.print(a[index]+" ");

    }

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};

        //完全二叉树先序遍历
        PreOrder(a,0);
        System.out.println();
        //完全二叉树中序遍历
        InOrder(a,0);
        System.out.println();
        //完全二叉树后续遍历
        AfterOrder(a,0);
    }
}
