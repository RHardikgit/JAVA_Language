//Check odd or even

import java.util.*;

public class odd_even{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int number = Sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number +" is even number");
        }
        else{
            System.out.println(number +" is odd number");
        }
        Sc.close();

    }
}