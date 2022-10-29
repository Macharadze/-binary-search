
import java.util.Arrays;

public class Main {
    static int binarySearch(int[] arr,int key,int fistElement,int lastElement){
        int middleElement= (fistElement+lastElement)/2;
        //check if last is less than first element
        if (lastElement<fistElement)
            return -1;
        //check if key is less than middle element
        if(key<arr[middleElement])
            //if true  the middle element became the last one
            return binarySearch(arr,key,fistElement,middleElement-1);
        //check if key is greater than middle element
        if (key>arr[middleElement])
            //if true the middle element became the first element
            return binarySearch(arr,key,middleElement+1,lastElement);
        //if key is equals to middle element means the key is this middle element
        if (key==arr[middleElement])
            return middleElement;
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]=new int[]{1,22,33,5,3,1,1,5,7,2,6,74,32};
        //we need sorted array for binary search
        Arrays.sort(arr);
        int key=74;
        int result=binarySearch(arr,key,0,arr.length-1);
        if (result==-1)
            System.out.println("Your key element does not exist.");
        else
            System.out.println("Your element's position is: "+result);
    }
}