package tree;

import java.util.Scanner;

public class  CreateTree2 {

    private String date;

    private CreateTree2 lchild;

    private CreateTree2 rchild;

     static Scanner in = new Scanner(System.in);

    public CreateTree2() {
    }

    public CreateTree2(String date, CreateTree2 lchild, CreateTree2 rchild) {
        this.date = date;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    @Override
    public String toString() {
        return "CreateTree2{" +
                "date='" + date + '\'' +
                ", lchild=" + lchild +
                ", rchild=" + rchild +
                '}';
    }


    public static void PreOlder(CreateTree2 t){

        if(t!=null){

            System.out.print(t.date+" ");

            PreOlder(t.lchild);

            PreOlder(t.rchild);
        }

    }

    public static void InOlder(CreateTree2 t){

        if(t!=null){

            InOlder(t.lchild);

            System.out.print(t.date+" ");

            InOlder(t.rchild);
        }

    }

    public static void AfOlder(CreateTree2 t){

        if(t!=null){

            AfOlder(t.lchild);

            AfOlder(t.rchild);

            System.out.print(t.date+" ");
        }

    }




    public static CreateTree2 CreateTree(){


        CreateTree2 t = new CreateTree2();

        String ch = in.next();


        if("#".equals(ch)){
            return null ;
        }else {

            t.date = ch;

            t.lchild = CreateTree();

            t.rchild = CreateTree();
        }

        return t;

    }


    public static void main(String[] args) {

        System.out.println("请按先序输入节点");

        CreateTree2 tree2 = CreateTree();

        System.out.println("先序遍历");

        PreOlder(tree2);

        System.out.println("中序遍历");

        InOlder(tree2);

        System.out.println("后序遍历");

        AfOlder(tree2);

    }
}
