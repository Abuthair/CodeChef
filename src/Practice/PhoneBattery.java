package Practice;

import java.util.Scanner;

/**
 * @author abuthair on 07/03/23.
 * 10:35 pm
 * @project CodeChef
 */
public class PhoneBattery {
    //hello

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase != 0){
            int X = sc.nextInt();
            if(X < 80){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }

            testCase--;
        }
    }
}
