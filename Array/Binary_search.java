import java.util.*;
public class Binary_search {  //O(logn)-> time(worst case) and  space complexity->O(1)
    public static int Binary(int a[],int tar){
        int beg=0;
        int end=a.length-1;
        //Check Array is sorted in ascending or descending order
        boolean ascending=(a[0]<a[a.length-1]);
        while(beg<=end){
            int mid=(beg+end)/2;
            if(a[mid]==tar){
                return mid ;
            }
            if(ascending){
                // target less than mid then not consider right array after mid to end
                if(tar<a[mid]){
                    end=mid-1;
                }
                else {
                    beg=mid+1;
                }
            } //decsending order
            else{
                 
                if(tar<a[mid]){
                     beg=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
                
            }
            return -1;


        }
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int a1[]={1,2,6,7,8};
             System.out.println("Array: "+Arrays.toString(a1));
            System.out.println("Enter the search number:");
            int target1=input.nextInt();
            int index1=Binary(a1, target1);
            if(index1==-1){
            System.out.println("Element not present.");
            }
            else
            {
                // position in User understandable form start from 1
            System.out.println("Element Prsent in array at index:"+(index1+1));
            }
            int a2[]={2,-1,-3,-4,-7};
            System.out.println("Array: "+Arrays.toString(a2));
            System.out.println("Enter the search number:");
            int target2=input.nextInt();
            int index2=Binary(a2, target2);
            if(index2==-1){
            System.out.println("Element not present.");
            }
            else
            {
            System.out.println("Element Prsent in array at index:"+(index2+1));
            }



        }

        
    }

    
