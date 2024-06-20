//  SEGGREGATION

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr = new int[size];
        int ind;
        for(ind =0;ind<size;ind++){
            arr[ind]=sc.nextInt();
        }
        int front ,rear,temp;
        for(front=0,rear=size-1;front<rear;front++,rear--){
            while(arr[front]==0)
            front++;
            while(arr[rear]==1)
            rear--;
            temp=arr[front];
            arr[front]=arr[rear];
            arr[rear]=temp;
        }
        for(ind=0;ind<size;ind++){
            System.out.printf(arr[ind]+" ");
        }
    }
}

//  OUTPUT
// 5
// 1
// 1
// 0
// 0
// 1
// 0 0 1 1 1 
