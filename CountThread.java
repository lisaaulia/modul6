/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

import java.io.IOException;

/**
 *
 * @author LisaAulia
 * NOMOR 3
 */
public class CountThread extends Thread{
    static boolean kondisi = true;
    int Angka = 0;
    
    @Override
    public void run(){
       for(;;){
           if(kondisi){
             Angka++;
             if(Angka%2==0){
                 System.out.print(Angka + " ");
             }
           }else{
               Angka--;
               if(Angka%2==1){
                   System.out.print(Angka +" ");
               }
           }
           try{
               Thread.sleep(300);
           }catch(InterruptedException ie){
               
           }
       }
    }
    public static void main(String[] args) throws IOException {
        Thread t1 = new CountThread();
        t1.start();
        System.out.println("tekan enter untuk hitung mundur bilangan ganjil");
        System.in.read();
        kondisi = false;
        System.out.println("tekan enter untuk stop");
        System.in.read();
        t1.stop();
    }
}
