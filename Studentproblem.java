/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Lalit
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int M;
        int N;
        int counter = 0;
        int j;
         int x;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
      //  ArrayList<Integer> temp = new ArrayList<Integer>();
        
        System.out.println("Enter value of M");
        M = input.nextInt();
        
        
        for(counter = 1 ;counter <=M ;counter++){
        arrayList.add(counter);
        }
        System.out.println("The contents of arraylist is "+ arrayList + "size of list is "+arrayList.size());
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(counter = 0;counter < arrayList.size();counter++){
            temp.add(arrayList.get(counter));
        }
        arrayList.clear();
        System.out.println("The temp is "+ temp);
  
        System.out.println("Enter value of N");
        N = input.nextInt();
               
        
            while(M>1){
                //for(counter = 1; counter < M ; counter++){
                //if(counter == N){
                temp.remove(N-1);
            //    System.out.println("arraytemp is "+temp);
                arrayList.clear();
                for(j=0 ; j<M ;j++){
        //            System.out.println(j);
                    x=(N+j - 1)%(M-1);
              //      System.out.println(x+"c"+temp.get(x));
                    arrayList.add(temp.get(x));
                }
                temp.clear();
                for(j=1;j<M;j++){
                temp.add(arrayList.get(j));
                }
                arrayList.clear();
             //  System.out.println("New array list is"+temp.get(0));
                M=M-1;
                //}
                                  
        }
            System.out.println("The winner is "+temp.get(0));
    }
}
