package javacoding;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setexample {
    public static void main(String[] args) {
        //Set:
        //Set is an interface
        //set interface extends the collection interface
        //duplicates are not allowed

        //Creating a Set

        //Creating a Set
        Set<String> CreatingSet = new HashSet<>();

        //add method
        CreatingSet.add("Nishanthi");
        CreatingSet.add("Gayathri");
        CreatingSet.add("Surya");
        CreatingSet.add("Archana");
        System.out.println(CreatingSet);

        //addAll method(from one set to another set)
        Set<String> CreatingStringSet = new HashSet<>();
        CreatingStringSet.addAll(CreatingSet);
        System.out.println(CreatingStringSet);

        //Convert array into list and add all the elements in the set
        Integer[] intArray = {1,2,3,4,5};
        Set<Integer> CreatingIntSet = new HashSet<>();
        CreatingIntSet.addAll(Arrays.asList(intArray)); //array into list
        System.out.println(CreatingIntSet);

        //clear method(removes all the element from the set
        Set<String> CreatingSetForClear = new HashSet<>();
        CreatingSetForClear.addAll(CreatingSet);
        CreatingSetForClear.clear();
        System.out.println(CreatingSetForClear);

        //remove method(Remove specified element from the set)
        System.out.println("remove Nishanthi from the set " + CreatingSet.remove("Nishanthi"));
        System.out.println("Printing Creatingset set " + CreatingSet);

        //contains method
        System.out.println("Is number 1 is present in this set? " + CreatingIntSet.contains(1));
        System.out.println("Is number 6 is present in this set? " + CreatingIntSet.contains(6));

        //containsAll method
        Set<String> CreatingFrstSet = new HashSet<>();
        CreatingFrstSet.add("Sunday");
        CreatingFrstSet.add("Monday");
        CreatingFrstSet.add("Tuesday");
        CreatingFrstSet.add("Wednesday");
        CreatingFrstSet.add("Thursday");
        CreatingFrstSet.add("Friday");
        CreatingFrstSet.add("Saturday");
        Set<String> CreatingSecondSet = new HashSet<>();
        CreatingSecondSet.add("Sunday");
        CreatingSecondSet.add("Monday");
        CreatingSecondSet.add("Tuesday");
        System.out.println("Is all the string values present in first String? " +CreatingFrstSet.containsAll(CreatingSecondSet));

        //hashcode method(Used to derive the hash code value for the current instance of the set)
        System.out.println("Hashcode of the set " + CreatingSet.hashCode());

        //isEmpty method(used to identify the emptiness of the set)
        System.out.println("Is CreatingSet set is empty? " + CreatingSet.isEmpty());
        System.out.println("Is CreatingSetForClear set is empty? " + CreatingSetForClear.isEmpty());

        //Iterating Values wihtout using Iterator method
        System.out.println("Iterate without using Iterator method");
        for (String iteratingValues: CreatingSet) {
            System.out.println(iteratingValues);
        }

        //Iterating Values using Iterator method
        Iterator iterateValues = CreatingSet.iterator();
        System.out.println("Iterate using Iterator method");
        while(iterateValues.hasNext()){
            System.out.println(iterateValues.next());
        }
        

    }
}
