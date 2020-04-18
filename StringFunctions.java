public class StringFunctions {
    public static void main(String[] args){
        String cars = "    Mustang ,Ferrari , Maruti , Hyundai     ";//considering given string as cars
        //1. we will use charAt() method to find out character at index  passed as an argument to charAt
        System.out.println("CharAt index 4 is : "+ cars.charAt(4));
        //2.this is indexOf() method used to determine char present at that index
        System.out.println("indexOf char t is : " + cars.indexOf('t'));
        //3.boolean isEmpty() will return whether the string is empty or not
        System.out.println("is the string empty : "+cars.isEmpty());
        //4.length() this will output no of characters in the string
        System.out.println(" NO of char in string are : "+cars.length());
        //5.contains() this will return boolean and tell if the substring(charsequence) is in main string or not
        System.out.println("the substring is present in main string : "+cars.contains("Maruti"));
        //6.substring  will return substring from index start to index (end-1) it is an overloaded function
        //and can return from index start also
        System.out.println(cars.substring(4));
        System.out.println(cars.substring(5,9));
        //7.equals(string a , string b ) is an boolean & will compare two string
        String name = "will";
        String name2 = "will";
        String name3 = "smith";
        System.out.println("name is equals to name2 "+name.equals(name2));
        System.out.println("name is equals to name3 "+name.equals(name3));
        //8.concat(String) will append string to the main  string
        cars = cars.concat(",Polo,Ford");
        System.out.println(cars);
        //9.split(String) this will make an array of string elements split around string
        String[] Cars = cars.split(",");
        for (String item :
             Cars) {
            System.out.print (item + " ");
        }
        //10.toUpperCase() and toLowerCase will makes entire string upper or lower case
        System.out.println(cars.toUpperCase());
        System.out.println(cars.toLowerCase());
        //11.trim() this will remove spaces before and after string
        System.out.println(cars.trim());// after hyundai spaces did'nt removed because our new cars have ford
        // as last entry not Hyundai
        //12.replace(char old , char new );
        System.out.println(cars.replace('a','o'));// fun
    }
}
