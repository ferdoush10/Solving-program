package pattern;
//import java.util.Scanner;
//public class Star {
//    public static void main(String[] args) {
//       int i, j, rows;
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter a row number : ");      
//       rows=sc.nextInt();
//    /* Input number of rows to print */
//    /* Iterate through rows */
//    for(i=1; i<=rows; i++)
//    { 
//        /* Print leading spaces */
//        for(j=i; j<rows; j++)
//        {
//            System.out.print(" ");
//        }
//        /* Print star */
//        for(int k=1; k<=(2*i-1); k++)
//        {
//            System.out.print("*");
//        }
//        System.out.print("\n");
//    }
//    }        
//}


class Star{

    public static void main(String[] args) {
        int n,rows=4;
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }        
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }

}

