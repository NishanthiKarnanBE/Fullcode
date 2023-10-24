package javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listexample {
    public static void main(String[] args) {
        //List:
        //Index based methods to insert, update, delete and search the elements.
        //Allow duplicate elements
        //also store null elements in the list
        //Implementation classes of List interface are ArrayList, LinkedList, Stack and Vector.
        //Commonly used- ArrayList and LinkedList

        //Creating a ArrayList
        //Adding elements in the list
        //Iterating the List element using for-each loop
        //convert Array to List
        //get element in List(returns the element at the given index)
        //set element in List(changes or replace the element)
        //sort list(String)
        //sort list(integer)
        //remove an element from the list
        //clear method
        //ArrayList size

        //Creating a ArrayList
        List<String> creatingNewList = new ArrayList<>();
        
        //Adding elements in the list
        creatingNewList.add("Nishanthi");
        creatingNewList.add("Gayathri");
        creatingNewList.add("Surya");
        creatingNewList.add("archana");

        //Iterating the List element using for-each loop
        System.out.println("Print all the names in the list");
        for (String iteratelist:creatingNewList) {
            System.out.println(iteratelist);
        }

        //convert Array to List
        //Creating array
        String creatingArray[] = {"school","college","Work"};
        System.out.println("Print all the values in array" + Arrays.toString(creatingArray));
        //Creating list
        List<String> listvalues = new ArrayList<>();
        for (String iterateArrayvalueToList:creatingArray) {
            listvalues.add(iterateArrayvalueToList);
        }
        System.out.println("Print all the values in List" + listvalues);

        //get element in List(returns the element at the given index)
        List<Integer> creatingIntegerList = new ArrayList<>();
        creatingIntegerList.add(2021);
        creatingIntegerList.add(2022);
        creatingIntegerList.add(2023);
        creatingIntegerList.add(2024);
        int getElementInList = creatingIntegerList.get(1);
        System.out.println(getElementInList);

        //set element in List(changes or replace the element)
        List<String> creatingListForSet =new ArrayList<>();
        creatingListForSet.add("Sunday");
        creatingListForSet.add("Monday");
        creatingListForSet.add("Tuesday");
        creatingListForSet.add("Wednesday");
        creatingListForSet.add("Thrusday");
        creatingListForSet.add("Friday");
        creatingListForSet.add("Saturday");
        System.out.println("Before using set element");
        for (String iteratingweeks:creatingListForSet) {
            System.out.println(iteratingweeks);
        }
        System.out.println("After using set element");
        creatingListForSet.set(0,"Sunday is holiday");
        for (String iteratingweeksafterset:creatingListForSet){
            System.out.println(iteratingweeksafterset);
        }

        //sort list(String)
        List<String> creatingListForSorting = new ArrayList<>();
        creatingListForSorting.add("Morning");
        creatingListForSorting.add("Afternoon");
        creatingListForSorting.add("Evening");
        creatingListForSorting.add("Night");
        System.out.println("Before sorting the list");
        for (String iteratingbeforesort: creatingListForSorting) {
            System.out.println(iteratingbeforesort);
        }
        Collections.sort(creatingListForSorting);
        System.out.println("After sorting the list");
        for (String iteratingaftersort: creatingListForSorting) {
            System.out.println(iteratingaftersort);
        }

        //sort list(integer)
        List<Integer> creatingListForIntegerSort = new ArrayList<>();
        creatingListForIntegerSort.add(993);
        creatingListForIntegerSort.add(3);
        creatingListForIntegerSort.add(67);
        creatingListForIntegerSort.add(1984);
        System.out.println("Before sorting the numbers");
        for (int iteratingIntbeforesort:creatingListForIntegerSort) {
            System.out.println(iteratingIntbeforesort);
        }
        Collections.sort(creatingListForIntegerSort);
        System.out.println("After sorting the numbers");
        for (int iteratingIntaftersort:creatingListForIntegerSort) {
            System.out.println(iteratingIntaftersort);
        }

        //remove an element from the list
        List<Integer> removelist = new ArrayList<>();
        removelist.add(1);
        removelist.add(2);
        removelist.add(3);
        removelist.add(4);
        removelist.remove(0);
        System.out.println("After removing the element " + removelist);

        //clear method
        List<Integer> clearlist = new ArrayList<>();
        clearlist.add(1);
        clearlist.add(2);
        clearlist.add(3);
        clearlist.add(4);
        System.out.println("Before using clear method " + clearlist);
        clearlist.clear();
        System.out.println("After using clear method " + clearlist);

        //ArrayList size
        List<Integer> sizelist = new ArrayList<>();
        sizelist.add(1);
        sizelist.add(2);
        sizelist.add(3);
        sizelist.add(4);
        System.out.println("Size of the list " + sizelist.size());

    }
}
