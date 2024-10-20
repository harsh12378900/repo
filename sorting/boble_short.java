package sorting;
import java.util.Scanner;
public class boble_short {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);//this is a first method of buble short
    
//         int y,i,j,temp;
//         y=s.nextInt();
//         int[] a=new int[y];
//         for(i=0;i<y;i++){
//             System.out.println("enter the index of "+i);
//             a[i]=s.nextInt();
//         }
//         for(i=0;i<=y-2;i++){
//             for(j=0;j<y-i-1;j++){
//                 if(a[j]>a[j+1]){
// temp=a[j];
// a[j]=a[j+1];
// a[j+1]=temp;
//                 }
//             }
            
//         }
//         for(i=0;i<y;i++){
//             System.out.println(a[i]);
     






// this is a second method
// this method is a slection method
int a[]={4,3,2,1,11};
int i,j,temp;
for(i=0;i<a.length;i++){
    for(j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
            //swap
temp=a[i];
a[i]=a[j];
a[j]=temp;

        }
    }
}
for(i=0;i<a.length;i++){
    System.out.println(a[i]);
}
}
}

