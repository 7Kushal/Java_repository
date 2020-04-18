import java.util.Scanner;

public class anagram {
    //two string are said to be anagram of each other if they have same no of each character
    // like cat and act are anagram of each other
    //1st approach

    public static void main(String[] args ){
        System.out.println("Enter string no 1 : " );
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        System.out.println("Enter string no  2 : ");
        String input2 = sc.next();  // scanned both the strings
        boolean isanagram = false;  //created an boolean variable to check if it is an anagram
        boolean[] visited = new boolean[input2.length()]; // boolean string created to not check same character again

        if(input1.length()==input2.length()){    // checkout if both string have ablest  same  length
                for(int i=0;i<input1.length();i++){
                char c = input1.charAt(i);  // getting char from input1 string
                isanagram = false;          // every time making isanagram false for each input1 char
                    for(int j =0;j<input2.length();j++){
                    if((input2.charAt(j)==c)&&(!visited[j])){ // compare ith char of input1 with unvisited only
                        visited[j]=true;
                        isanagram=true;
                        break; //exit inner loop if that char is found
                     }
                    }
                if(!isanagram){ // work if we got anagram as a false
                    break;//exit all loops  or exit outer loop
                }
            }
        }
        else // work if lengths of the strings are different
        {
            isanagram = false ;
        }
        System.out.println("isanagram " + isanagram);//print the result
    }
}
