package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node rigth;

        Node(int data, Node left, Node rigth) {
            this.data = data;
            this.left = left;
            this.rigth = rigth;

        }
    }
       private Node root;
       private int size;
        BinaryTree(){
            Scanner s=new Scanner(System.in);
            this.root=takeInput(s,null,false);
        }
        public Node takeInput(Scanner s,Node parent,boolean isLeftOrRigth){
            if(parent==null){
                System.out.println("Enter the value for parent Node");
            }
            else{
                if(isLeftOrRigth){
                    System.out.println("Enter the value for left Child of " + parent.data);
                }
                else{
                    System.out.println("Enter the value for right Child of " + parent.data);

                }
            }
            int nodeData=s.nextInt();
            Node node=new Node(nodeData,null,null);
            boolean choice =false;
            System.out.println("Is your "+ nodeData+" has left Child ?");
            choice=s.nextBoolean();
            if(choice){
                node.left=takeInput(s,node,true);
            }
             choice =false;
            System.out.println("Is your "+ nodeData+" has right Child ?");
            choice=s.nextBoolean();
            if(choice){
                node.rigth=takeInput(s,node,false);
            }
            return node;
        }

        public  void display(){
            this.display(this.root);
        }

    private void display(Node temp) {
            String str="";
          if (temp != null) {
            str = str+temp.data;
//            System.out.println(temp.data);


            if (temp.left != null) {
                str = temp.left.data+" => "+ str;

//                System.out.println(temp.left.data + " => ");
            } else {
                str="End =>"+ str;
//                System.out.println("End => ");
            }

            if (temp.rigth != null) {
                str = str+" <= "+temp.rigth.data;

//                System.out.println("<= " + temp.rigth.data);

            } else {
                str=str+"<= End";
//                System.out.println("<= End ");

            }
            System.out.println(str);
            if(temp.left!=null) {
                display(temp.left);
            }
            if(temp.rigth!=null) {
                display(temp.rigth);
            }

          }


    }

    public int height(){
           return  this.height(this.root);
    }
    private int height(Node node){
           if(node==null){
               return -1;
           }

              int lh = height(node.left);

              int rh = height(node.rigth);

               return Math.max(lh,rh)+1;
    }
  public void preOrder(){
            this.preorder(root);
      System.out.println("End");
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" -> ");
        preorder(node.left);
        preorder(node.rigth);
    }
 public void postOrder(){
            this.postOrder(root);
 }
 private void postOrder(Node node){
          if(node==null){
              return;
          }
          postOrder(node.left);
          postOrder(node.rigth);
          System.out.print(node.data+" ");

 }
    public void InOrder(){
        this.InOrder(root);
        System.out.println("End");
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.data+" -> ");

        InOrder(node.rigth);
    }
}
