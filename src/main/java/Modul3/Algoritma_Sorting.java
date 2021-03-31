
package Modul3;
public class Algoritma_Sorting {
    public static void main(String[] args) {
        int Data [] = {10,12,8,9,15};
        int key = 8;
        int ketemu = 0;
        for (int i = 0; i<Data.length; i++) {
            System.out.print(Data[i]+" ");
            
        }
        System.out.println();
        for (int i = 0; i < Data.length; i++) {
            if(Data[i] == key){
                ketemu = 1;
                System.out.println("Data "+key+" Berada di index ke "+i);
            }
          
     
        }
    }
                
}
