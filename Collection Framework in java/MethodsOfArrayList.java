import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodsOfArrayList {
    public static void main(String[] args){
        List<String> fruits = new ArrayList();
        List<String> vegetables = new LinkedList();

        //add();  adding fruit to fruits
        fruits.add("Mango");
        fruits.add("Orange");
        //using add() method on a linked list
        vegetables.add("potato");
        vegetables.add("Ginger");
        System.out.println(fruits);
        System.out.println(vegetables);
        // using addAll();  to merge elements of other collection to another
        fruits.addAll(vegetables);
        System.out.println(fruits);
        //In List too zero based indexing is done here

        //Using get(index); to get any indexed element data
        System.out.println(fruits.get(1));// 1 is Orange
        //using set(index , parameter ) ; is used to update data in present list
        fruits.set(1,"apple");
        System.out.println(fruits);
        // using remove(index); to remove an element from current list
        fruits.remove(1);
        System.out.println(fruits); // apple gone
        //using clear(); used to remove all elements
        vegetables.clear();
        System.out.println(vegetables);
        //if you want remove certain elements from a list you have to used removeaLL(collection of removable items);
        List<String> toRemove  = new ArrayList();
        toRemove.add("Orange");
        toRemove.add("potato");
        fruits.removeAll(toRemove);
        System.out.println(fruits);// only mango and ginger will left in the fruit list
        System.out.println(fruits.size());// for size of the list
        System.out.println(fruits.contains("tomato"));//to check  available or not
        System.out.println(fruits.isEmpty()); // empty or not

        String s1[] = new String[fruits.size()];
        fruits.toArray(s1); // return an array of list to s1


    }
}
