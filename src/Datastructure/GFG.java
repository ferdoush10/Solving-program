package Datastructure;
//
//public class BinarySearch {
//   public static void main(String args[]){
//      int a[] = {10, 20, 25, 57, 63, 96};
//     // int size = array.length;
//      int left = 0;
//      int right = a.length-1;
//      int x = 96;
//      int mid = 0;
//      mid = left +(right-left)/2;
//
//      while(left<=right){
//         if(a[mid] == x){
//            System.out.println(x+"  is found and index is : "+mid);
//            break;
//         }
//         else if(a[mid]<x)
//         left = mid+1;
//         else right = mid - 1;
//      }
//      mid =(left+right)/2;
//   }
//}

// Java program to demonstrate working of Arrays. 
// binarySearch() in a sorted array. 
import java.util.Arrays; 

public class GFG { 
	public static void main(String[] args) 
	{ 
		int a[]={10,1,2,3,4,5,6,7,8};
                 Arrays.sort(a);
                
                 int key=2;
                int res=Arrays.binarySearch(a, key);
                
                if(res>=0){
                    System.out.println(key+" is found and index is "+res);
                }
                else 
                {
                    System.out.println("Not found ");
                }
                
                
                
	} 
} 

