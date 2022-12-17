import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3];
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Elements:");
                arr[i][j]=obj.nextInt();
                System.out.println();
            }
        }
        for (int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                
                System.out.print(arr[i][j]+"\t");
            }
        }
    }
}
