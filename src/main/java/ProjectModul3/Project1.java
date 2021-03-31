package ProjectModul3;
import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        int A ;
        int Data [] = {2,4,6,8,10,12,14,16,18,20};
        int ketemu = 0;
        Scanner key = new Scanner(System.in);
        System.out.println("Data = ");
         for (int i = 0; i < Data.length; i++) {
            System.out.print(Data[i]+" ");
        }
        System.out.println();
        System.out.println("Masukkan Angka Yang mau anda cari : ");
        A = key.nextInt();
        for (int i = 0; i < Data.length; i++) {
            if(Data[i] == A){
                ketemu = 1;
                System.out.println(" Data ke "+A+" Berada di indeks ke "+i);
            } 
        }
        if(ketemu == 1){
            System.out.println("Data Telah Ditemukan");
        }else{
            System.out.println("Data Tidak Ditemukan");
        }
        System.out.println("\n");
        System.out.println("Moh.Faizal Ilham Falakh");
        
    }
    
}
