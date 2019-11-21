/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class BubbleSort {
    
    void sort(int[] ar){
        for(int i = 0;i<ar.length;i++)
            for(int j = 0;j<ar.length-i-1;j++)
                if(ar[j]>ar[j+1])
                    swap(ar,j,j+1);
    }
    
    void swap(int ar[],int a, int b){
        int temp;
        temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
