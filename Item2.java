import java.io.IOException;
import java.util.arrays;
import java.util.Scanner;
public class Item2
{
    static int minimum(int arr[],int n,int k){
        int result=Intger,MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<=n-k;i++)
        {
            result=Math.min(result,arr[i+k-1]-arr[i]);
        }
        return result;
    }
    static int getting(int res,int arr[],int n,int k){
        int result=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            result=Math.min(result,arr[i+k-1]-arr[i]);
            if(res==result)
            return i;
        }
        return o;
    }
    public static  void main(string[]args)throws IOException{
        int arr[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        string items[]={
            "Fitbit Plus:7980",
            "IPods:22349",
            "MI bands:999",
            "cult Pass:2799",
            "Macbook Pro:229900",
            "Digital Camera:11101",
            "Alexa:9999",
            "Sandwich Toaster:2165",
            "Microwave Oven:9800",
            "Scale:4999"};
            int n=arr.length;
            System.out.println("enter the number of employees");
            Scanner sc=new scanner(System.in);
            int k=sc.nextInt();
            int result=minimum(arr,n,k);
            System.out.println("number of the employees:"+k);
            int start=getting(result,arr,n,k);
            System.out.println("Here the input_items that are selected for the distribution are:");
            for(int i=start;i<start+k;i++)
            System.out.println(items[i]);
            System.out.println("And the difference between the chosen goodie with highest price and lowest price is: "+result);
        
            
        }
        }
    
