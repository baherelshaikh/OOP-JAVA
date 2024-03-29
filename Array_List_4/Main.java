package Array_List_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Main extends ArrayList {
    /**
     * @param args
     */
    public static void main (String [] args)
    {

        ArrayList <Integer> list = new ArrayList<>(100);           // we can make initalization by this way
        //ArrayList <Integer> list = new ArrayList<Integer>();  //  or by this way
        //List <Integer> list = new ArrayList();        //  or by using interface "list"
        //It will be better if we give the expected number of objects (elements) we will store for make performance more fast
        ArrayList <Integer> list1 = new ArrayList<>();
        // ArrayList is polymorphic : if we don't write the type we can store a diffrent data types of element
        ArrayList list2 = new ArrayList<>((Arrays.asList(10,"A",5.3,'C')));
       
       
       // Addition(At last) to the ArrayList
                list.add(10);
                list.add(20);
                list.add(30);

       // Print 
                System.out.println(list);    // First way
        
                int s = list.size(); // this step to make performance more fast
                for(int i=0 ; i<s; i++) // second way
                    System.out.println(list.get(i));

                for(int num : list) // third way
                System.out.println(num);

       // Addition (At a specific endex)
                list.add(3, 40);

             System.out.println(list);

       // Addition (A list && At last) 
                list1.addAll(list);  //First method
                    //or write this at first in the costructor ---> ArrayList <Integer> list1 = new ArrayList(list1);

                list1.addAll(Arrays.asList(44,55,66)); // Second method 
                    // the method asList which is from the class Arrays we use it to send more one element at the same time 
                    // or write this at first in the costructor --> ArrayList <Integer> list1 = new ArrayList(Arrays.asList(10,20,30));

       // Addition (A list && At specific index)
                list1.addAll(2, list);

       // Copy list to another
                list1=(ArrayList)list.clone(); // the method clone returns a copy of the elements this is called "shallow copy", so the "list" will stay as it is 
                //or
                list1 = list;  // this make the addresses of these references are equal in the memoryand this is called " reference copy", so  any modifying on one of them will 
                               // applied on the second

                               list1.add(2);
                               System.out.println(list1);
                               System.out.println(list);

        //  modifying (at specific endex)
                list1.set(0, 99);

        // Removing 
            // (at specific endex)
                list1.remove(2); 
            // (specific object (value))
                list.remove((Integer)10); //or
                //list.remove(Integer.valueOf(10));  
            // (remove a collection(ex: lists))
                list1.removeAll(list); //here it will remove the elements in "list" from "list1"
                list.removeAll(Arrays.asList(55,66));  //or
                list1.removeAll(Collections.singleton(44));  
            //  (remove range)
                 // this method was created as a protectedin the class ArrayList so we have to make this class inheritance from the class ArrayList 
                 Main arr = new Main();
                 arr.removeRange(0,2); // this method removes values between two specifics indexes(0,1)
            //  (remove if)
                list1.removeIf(num->num%2==0); //(num==first element -> condition)"loop" && if we didn't write the type when we creating the ArrayList we make casting before the second "num" 
    }
}
