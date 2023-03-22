// import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for(int i =0; i< s.length();i++){
            if(vowels.contains(s.charAt(i)+"")){
            count++;
            }
        }
        System.out.println(count);
    }
}
