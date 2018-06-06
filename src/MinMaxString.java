import java.util.Scanner;       // imported library Scanner

public class MinMaxString {     // name of the class
    public static void main (String[] args){        // main class
        int n = 10;     // create integer variable and assign value = 10 to it
        Scanner sc = new Scanner(System.in);        // create new Scanner object and open input stream
        String max = "", min = "", str = "";        // create new String variables for min, max and temp values
        for (int i = 0; i < n; i++){        // start a cycle for variable i from 0 to 10, and increment i by each step
            System.out.print("> ");     // print the string "> "
            if (sc.hasNextLine()){      // if a string was typed
                str = sc.nextLine();        // read recently typed string into variable str
                if(i == 0){     // if it was the first iteration
                    min = str;      // rewrite min value with current string
                }
                if(str.length() > max.length()){        // if the length of current string is bigger than the length of max string
                    max = str;      // rewrite max value with current string
                } else if(str.length() < min.length()){     // else if the length of current string is smaller than the length of
                                                            // min string
                    min = str;      // rewrite min value with current string
                }
            }
        }
        System.out.println("max string = " + max + " length = " + max.length());        // print the max string and its length
        System.out.println("min string = " + min + " length = " + min.length());        // print the min string and its length
    }
}
