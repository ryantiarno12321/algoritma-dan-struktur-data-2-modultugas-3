package modul3tugas;

import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("****SEQUENTIAL SEARCH*****"+"/n");
        String data[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Ryantiarno","Tesla"};
        String key;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang ingin dicari:");
        key = scan.nextLine();
        
        System.out.print("isi data adalah");
        for (int i = 0; i < data.length; i++) {
            
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        
        for (int i = 0; i <= data.length; i++){
           if (key.equalsIgnoreCase(data[i])){
               System.out.print("data"+ key+"berada pada index ke -"+ i);
               break; 
               
              
          }
        
        
    }
    System.out.println("\n");
    System.out.println();
    System.out.println("***terima kasih***");    
        
    }
    
}
