package Main;

public class LL {
    private class Node {
        Node next;
        int data;
    }
        Node root;
        Node end;
        int size;

     public void addFirst(int data) {

         Node node = new Node();
         node.next = null;
         node.data = data;
         // add node to linked list
         if (this.size >= 1) {
             node.next = this.root;

         }

         // update summary object
         if (size == 0) {
             this.root = node;
             this.end = node;
             this.size++;
         } else {
             this.root = node;
             this.size++;
         }
     }
     public void addLast(int data) {
         Node node = new Node();
         node.next = null;
         node.data = data;
         if (this.size >= 1) {
             this.end.next = node;
         }
         if (size == 0) {
             this.root=node;
             this.end=node;
             this.size++;
         }
         else{
             this.end=node;
             this.size++;
         }
     }

     public Node getNodeAt(int index) throws  Exception {

         if(index>=this.size){
             throw new Exception("Index out of bound");
         }
         if(index==0){
             return this.root;
         }
         else if(index==this.size-1){
             return this.end;
         }
         else{
             Node node=this.root;

             for (int i = 0; i <index; i++) {
                node=node.next;
             }
             return node;
         }

     }
     public int getValueAt(int index) throws  Exception {

         if(index>=this.size){
             throw new Exception("Index out of bound");
         }
         if(index==0){
             return this.root.data;
         }
         else if(index==this.size-1){
             return this.end.data;
         }
         else{
             Node node=this.root;

             for (int i = 0; i <index; i++) {
                node=node.next;
             }
             return node.data;
         }

     }

     public void addAt(int index, int data) throws Exception{


         if(index==0){
             addFirst(data);
         }
         else if(index==this.size){
             addLast(data);
         }
         else{
             Node node =new Node();
             node.next=null;
             node.data=data;

              Node prevNode= getNodeAt(index-1);
              Node nextNode= getNodeAt(index);

              prevNode.next=node;
              node.next=nextNode;
              this.size++;
         }


     }

      public  void ReverseLL() throws Exception{
         if(this.size==0){
             throw new Exception("Linked List is Empty");
         }
         int left=0;
         int rigth=this.size-1;

         while(left<=rigth){
             Node LN= getNodeAt(left);
             Node RN=getNodeAt(rigth);
             int temp=LN.data;
             LN.data=RN.data;
             RN.data=temp;
             left++;
             rigth--;
         }
      }
     public void display(){
         Node node=this.root;
         for (int i = 0; i <this.size ; i++) {
             System.out.print(node.data+" - ");
             node=node.next;
         }
         System.out.println();
     }
 }
