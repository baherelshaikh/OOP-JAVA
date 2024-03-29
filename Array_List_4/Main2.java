package Array_List_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main (String[] args){
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(30,40,10,20));
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(10,20,20,50,60,1,2,3,4,5));
        ArrayList <Integer> list3 = new ArrayList<>(list.subList(0, 3));// this is a way which we can store elements of list from index to index in another list
        
        // this method is used to check if a specific element is exited 
            list.contains(10);

        // this method is used to retain the elements are shared
            list2.retainAll(list); // after this step list2 will contain (10,20,20)

        // is empty ??
            list.isEmpty();

        // remove all elements
            list3.clear();

        // change capacity 
            list3.ensureCapacity(120);

        // remove all capacities are not used
            list3.trimToSize();

        // loop to all elements 
            list.forEach(e1 -> System.out.println(e1+"-"));

        // sort the elements 
            Collections.sort(list); // sort from A to Z
            Collections.sort(list2,Collections.reverseOrder()); // sort from Z to A



    }
    
}
