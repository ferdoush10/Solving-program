package Datastructure;
public class Linear {
    public static int linear_Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    } 
    public static void main(String[] args) {    
        int arr[]={10,12,13,4,56,100};
        int key=57;            
        System.out.println("Number is found and index is : "+linear_Search(arr,key));
    }
}
