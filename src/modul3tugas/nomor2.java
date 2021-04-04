package modul3tugas;

import java.util.Scanner;

public class nomor2 {
     public static void main(String[] args) {
         
         int A[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
         Scanner scan = new Scanner(System.in);
         System.out.print("masukan data yang dicari : ");
         int cari = scan.nextInt();
         int N = cari;
         int batasbawah = N -1;
         int batasatas = 0;
         boolean keteme = false;
         int tengah = 0;
         
         System.out.print("isi data adalah : ");
         for ( int i =0; i<A.length; i++){
             System.out.print(A[i]+ " ");
             
         }
       System.out.println(" ");
       while ((batasatas < batasbawah) && (ketemu ==0 )){
           tengah = (batasatas + batasbawah) /2;
           if (A[tengah]==cari){
               ketemu = true;
               
           }else{
               if (A[tengah] < cari ){
                   batasatas = tengah++;
               }else{
                   batasatas = tengah --;
                  
               }
           }
           if(ketemu){
               System.out.println("data" +cari+"telah ditemukan pada indeks ke "+(tengah))
           }
       }
        
         
     }
    
}
