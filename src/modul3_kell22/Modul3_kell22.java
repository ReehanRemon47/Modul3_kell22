/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_kell22;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Modul3_kell22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    int pilih,tambah,kurang,simpan;
    int saldo = 1000000;
    while (true) {
     System.out.println("-------#==========================#-----");
     System.out.println("-----------# Selamat Datang #-----------");
     System.out.println("-----------#      MENU      #-----------");
     System.out.println("-----------#  1. CEK SALDO  #-----------");
     System.out.println("-----------#  2. DEPOSIT    #-----------");
     System.out.println("-----------#  3. AMBIL UANG #-----------");
     System.out.println("-----------#  4. KELUAR     #-----------");
     System.out.println("-----------##################-----------");
     System.out.print("Masukkan pilihan menu : ");
     pilih = Integer.parseInt(input.next());
      
     switch(pilih){
     case 1 :
       System.out.println("Saldo anda : Rp. " + saldo);
     break;
      
     case 2 :
      System.out.print("Masukkan jumlah uang yang akan dideposit = Rp. ");
      tambah = input.nextInt();
      saldo += tambah;
      System.out.println("Saldo anda menjadi Rp." + saldo);
         break;
      
     case 3 :
       System.out.print("Masukkan jumlah uang yang ingin diambil = Rp. ");
       kurang = input.nextInt(); 
       System.out.println("Saldo anda Rp.");
       System.out.println(saldo-kurang);
       simpan = saldo - kurang;

 

          if (simpan < 50000) {
            System.out.println("Maaf, Saldo anda Rp." + saldo + " batas minimal Saldo Rp.50000");
          } else {
            saldo = simpan;
            System.out.println("Saldo anda Rp." + simpan);
          }
          break;
      
     case 4 :
      System.exit(0);
     break;
      
     default:
      System.out.println("Silahkan masukkan pilihan menu");
      break;
     }
   }
   }
}
    

