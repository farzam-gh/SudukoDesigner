import java.util.*;
import java.io.*;

public class Suduko {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Suduko Creator ... \n[Author: Farzam]\n\n");
        System.out.print("Please enter Suduko Size : ");
        int max=sc.nextInt();
        SudukoDesigner mySuduko=new SudukoDesigner(max);
        int[][] designedSuduko=mySuduko.createSuduko(max-1, max-1);
        System.out.print("\n\n\n\n Here is your new custom designed suduko :\n        \n");
        mySuduko.showSuduko(max);
        System.out.print("\nEnter any key and press enter to exit\n");
        sc.next();
}
    
}