import java.util.*;
import java.lang.*;
import java.io.*;
class romanToNumeric
{
    public static boolean check(String numAsString){
        switch(numAsString) {
            case "I"  :
            case "IV" :
            case "V"  :
            case "IX" :
            case "X"  :
            case "XL" :
            case "L"  :
            case "XC" :
            case "C"  :
            case "CD" :
            case "D"  :
            case "CM" :
            case "M"  :
                return true;
            default   :
                return false;
        }
    }
    public static int getkey(String numAsString){
        switch(numAsString) {

            case "I" :
                return 1;

            case "IV" :
                return 4;

            case "V" :
                return 5;

            case "IX" :
                return 9;

            case "X" :
                return 10;

            case "XL" :
                return 40;

            case "L" :
                return 50;

            case "XC" :
                return 90;

            case "C" :
                return 100;

            case "CD" :
                return 400;

            case "D" :
                return 500;

            case "CM" :
                return 900;

            case "M" :
                return 1000;

            default :
                return 0;

        }
    }
    public static void main (String[] args)
    {
        //code
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String roman = in.next();
            int num = 0 ;
            if(roman.length()==0)
                System.out.println("0");
            else
            {
                int l = roman.length();
                for(int i = 0; i<l;i++){
                    if(i!=l-1){
                        if(check(roman.substring(i,i+2))){
                            num = num +getkey(roman.substring(i,i+2));
                            i++;
                        }
                        else{
                            num = num +getkey(roman.substring(i,i+1));
                        }
                    }
                    else if(i==l-1){
                        num = num +getkey(roman.substring(i,i+1));
                    }
                }
            }
            System.out.println(num);
        }

    }
}