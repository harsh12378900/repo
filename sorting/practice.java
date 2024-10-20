package sorting;

public class practice {
    public static void main(String[] args) {
        int arr[]={8,6,5,7,9,6,4,7,8,9,4};
        int i,j;
        for(i=1;i<arr.length;i++){
            int current=arr[i];
            j=i-1;
        
     while(j>=0&&current<arr[j]){
        arr[j+1]=arr[j];
        j--;

     }
     arr[j+1]=current;

    }
    for(i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
