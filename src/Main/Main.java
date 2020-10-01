package Main;
import java.io.IOException;
import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args) throws  Exception{

 LL list=new LL();

 list.addFirst(10);
 list.addFirst(20);
 list.addLast(15);
 list.addLast(25);
 list.addLast(35);
 list.display();
 list.addAt(2,22);
 list.display();
 list.addAt(0,90);
 list.display();
 list.addAt(6,100);
 list.display();
        System.out.println(list.getValueAt(2));
        list.ReverseLL();
        list.display();
    }
}
