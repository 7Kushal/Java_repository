import java.util.ArrayList;
import java.util.List;

public class list_new {
    public static void main(String[] args){
        //Making an arrayList
        //example of using arrayList without generic
        // problem happen when wrong type data type is passed in the parameters and will lead to code bust
        ArrayList a1 = new ArrayList();
        a1.add("golu");
        a1.add(22);
        System.out.println("a1 is = "+a1);

        // using generic
        ArrayList<Integer> a2 = new ArrayList();
        a2.add(24);
        a2.add(22);
        System.out.println("a2 is = "+a2);
        //we can further use List  as in general lets see
        List l1 =  new ArrayList();// this line says a list of arraylist type objects
        l1.add(24);
        l1.add(22);
        System.out.println("l1 is same as a2  = "+l1);
    }
}
