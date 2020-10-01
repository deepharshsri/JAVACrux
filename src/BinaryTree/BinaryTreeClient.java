package BinaryTree;

public class BinaryTreeClient {
    public static void main(String[] args) {
////        50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
//
        BinaryTree tree=new BinaryTree();
        tree.display();
        tree.preOrder();
        tree.postOrder();
        System.out.println(tree.height());
    }
    }
//import java.io.*;
//import java.math.*;
//import java.text.*;
//import java.util.*;
//import java.util.regex.*;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data,Node leftChild,Node rightChild){
//        this.data=data;
//        this.left=leftChild;
//        this.right=rightChild;
//    }
//}
//
//public class BinaryTreeClient {
//    static Scanner scanner=new Scanner(System.in);
//    public static void main(String[] args) {
//        int n=scanner.nextInt();
//        int[][]  arr=new int[n][2];
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]= scanner.nextInt();
//            }
//        }
//        int q= scanner.nextInt();
//        int[] queries=new int[q];
//        for (int i = 0; i <queries.length ; i++) {
//
//
//            queries[i]= scanner.nextInt();
//        }
//
//        swapNodes(arr,queries);
//    }
//
//    /*
//     * Complete the swapNodes function below.
//     */
//    private  static  void display(Node temp) {
//        String str="";
//        if (temp != null) {
//            str = str+temp.data;
////            System.out.println(temp.data);
//
//
//            if (temp.left != null) {
//                str = temp.left.data+" => "+ str;
//
////                System.out.println(temp.left.data + " => ");
//            } else {
//                str="End =>"+ str;
////                System.out.println("End => ");
//            }
//
//            if (temp.right != null) {
//                str = str+" <= "+temp.right.data;
//
////                System.out.println("<= " + temp.rigth.data);
//
//            } else {
//                str=str+"<= End";
////                System.out.println("<= End ");
//
//            }
//            System.out.println(str);
//            if(temp.left!=null) {
//                display(temp.left);
//            }
//            if(temp.right!=null) {
//                display(temp.right);
//            }
//
//        }
//
//
//    }
//    public static int height(Node node){
//        if(node==null){
//            return -1;
//        }
//
//        int lh = height(node.left);
//
//        int rh = height(node.right);
//
//        return Math.max(lh,rh)+1;
//    }
//    static void swapNodes(int[][] indexes, int[] queries) {
//        /*
//         * Write your code here.
//         */
//        int[][] result=new int[2][indexes.length];
//
//            Node root=insert(null,false,indexes,1);
//            display(root);
//           System.out.println();
//           int height=height(root);
//        for (int i = 0; i <queries.length ; i++) {
//            int val=queries[i];
//             int k=2;
//            while (val <= height){
//                swap(root, val, root);
//               val=queries[i]*k;
//               k++;
//
//                     }
//                        display(root);
//                  InOrder(root,result,i);
////            System.out.println(Arrays.toString(result[i]));
//            j=-1;
//        }
//
//    }
//    public static  void InOrder(Node node,int[][] result,int i){
//        if(node==null){
////            result[i][j]=-1;
//            return;
//        }
//        InOrder(node.left,result,i);
////        System.out.print(node.data+" -> ");
//        System.out.println(node.data);
//           j+=1;
//          result[i][j]=node.data;
//        System.out.println(Arrays.toString(result[i]));
//        InOrder(node.right,result,i);
//    }
//   static int j=-1;
//    public static void swap(Node parent,int n,Node root){
//        if(n==1){
//            Node temp=parent.left;
//            parent.left=parent.right;
////            Node right=parent.right;
////            parent.left=right;
//            parent.right=temp;
////            display(root);
//            return;
//        }
//        if(parent.left!=null) {
//            swap(parent.left, n - 1,root);
//        }
//        if(parent.right!=null) {
//            swap(parent.right, n - 1,root);
//        }
//    }
//    public static Node insert(Node parent,boolean LeftOrRight,int[][] indexes,int i){
//                  int nodeData=i;
//
//                  Node node = new Node(i, null, null);
//                if(nodeData!=-1) {
//                int d = indexes[nodeData-1 ][0];
//                if (d != -1) {
//                    node.left = insert(node, true, indexes, d);
//                }
//                d = indexes[nodeData-1 ][1];
//
//                if (d != -1) {
//                    node.right = insert(node, false, indexes, d);
//                }
//            }
//            return node;
//    }
//
//
//}
