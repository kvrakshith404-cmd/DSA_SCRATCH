import java.util.*;
public class LInear_search {  //O(n)-Time and O(1)->Space complexity
        public static int Linear(int a[],int tar){
        for(int i=0;i<a.length;i++){
            if(a[i]==tar){
                return i;
            }
        }
        // if not exist
        return -1;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a[]={ 4,1,8,9,2,5};
        System.out.println("Array: "+Arrays.toString(a));
        System.out.println("Enter the search number:");
        int target=input.nextInt();
        int index=Linear(a, target);
        if(index==-1){
            System.out.println("Element not present.");
        }
        else{
            //  position in User understandable form start from 1
            System.out.println("Element Prsent in array at index:"+index+1);
        }

    }

    
}