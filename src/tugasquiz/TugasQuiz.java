/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasquiz;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class TugasQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nama,alamat,jk,j,s;
        int gp = 0,bs,gb;
        
        System.out.println("-------------------PERHITUNGAN Gaji Pegawai-------------------------");
        System.out.print("Masukkan Nama Anda    = ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda  = ");
        alamat = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin= ");
        jk = input.nextLine();
        System.out.print("Masukkan Jabatan      = ");
        j = input.nextLine();
        System.out.print("Masukkan Status       = ");
        s = input.nextLine();
        
        //ketentuan
        if((jk.equals("L"))&&(j.equals("M"))){
            gp = 5000000;
        }else if((jk.equals("L"))&&(j.equals("T"))){
            gp = 3000000;
        }else if((jk.equals("P"))&&(j.equals("M"))){
            gp = 6000000;
        }else if((jk.equals("P"))&&(j.equals("T"))){
            gp = 4000000;
        }
        if(s.equals("BPJS")){
            bs = 80000;
        }else{
            bs = 100000;
        }

        //output
        gb = gp-bs;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Nama            = "+nama);
        System.out.println("Alamat          = "+alamat);
        System.out.println("Gaji Bersih     = "+gb);
    }
    
}
