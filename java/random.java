import java.util.*;
class random{
    public static void main (String args[]){
        int a[] = new int[20];
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(50);
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}