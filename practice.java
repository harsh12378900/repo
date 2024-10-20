

public class practice {
    public static void main(String[] args) {
        int i,temp,j,arry[]={3,2,1};
        for(i=0;i<3-1;i++){
            for(j=1;j<3-i-1;j++){
if(arry[i]>arry[j]){
temp=arry[i];
arry[i]=arry[j];
arry[j]=temp;
}

}
        }
for(i=0;i<3;i++){
    System.out.println(arry[i]);
}
        }
           
    
}

