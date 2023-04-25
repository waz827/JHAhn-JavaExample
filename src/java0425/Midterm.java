package java0425;

import java.util.Arrays;

public class Midterm {
    public static void numCheck(int num[]){
        int Array[]=new int[20];
        for(int i=0; i<num.length; i++){
//            for(int j=0; j<10; j++){
//                if(num[i] == j){
//                    Array[j]++;
//                }
//            }
            Array[num[i]]++;
        }

        boolean bool= true;
        for(int k=0; k<Array.length; k++){
            if(Array[k]>1){
                bool= false;
                break;
            }
        }
        System.out.println(Arrays.toString(num)+":"+bool);
    }
    public static void main(String[] args) {
        int i1[]={0,1,2,3,4,5,6,7,8,9};
        int i2[]={1,2,5,0,1,2,3,4,5,6,7,8,9};
        int i3[]={0,1,2,9,9,5,6,7,8,9};
        int i4[]={0,1,2,3,8,9};
        int i5[]={5,7,8,9};

        numCheck(i1);
        numCheck(i2);
        numCheck(i3);
        numCheck(i4);
        numCheck(i5);

    }
}
