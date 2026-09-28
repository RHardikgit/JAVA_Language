// compare 2 numbers

import java.util.*;

public class com_num{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        if(a == b){
            System.out.println(" A and B are Equal");
        }
        else if(a>b){
            System.out.println(" A is greater than B");
        }
        else if (a<b){
            System.out.println(" B is greater than A");
        }
        Sc.close();
    }
}