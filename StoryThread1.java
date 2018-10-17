/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author LisaAulia
 * NOMOR 2
 */
public class StoryThread1 extends Thread{
    int kondisi;
    int dokter=1;
    int pasien = 10;
    
    public StoryThread1(int kondisi){
        this.kondisi=kondisi;
    }
    @Override
    public void run(){
        try{
            for(;;){
                if(kondisi==1){
                    System.out.println(pasien+" pasien sedang diperiksa oleh "+dokter+" dokter");
                    Thread.sleep(2000);
                    break;
                }else if(kondisi==2){
                    Thread.sleep(2000);
                    int pas = pasien/2;
                    System.out.println(pas +" pasien pertama ditangani oleh perawat 1");
                    Thread.sleep(2000);
                    System.out.println(pas +" pasien kedua ditangani oleh perawat 2");
                    Thread.sleep(2000);
                    break;
                    
                    
                }else if(kondisi==3){
                    Thread.sleep(10000);
                    System.out.println(pasien+ " pasien kemudian membayar di kasir");
                    Thread.sleep(2000);
                    break;
                }
            }
        }catch(InterruptedException ie){
            
        }
    }
    public static void main(String[] args) {
        System.out.println("@Rumah sakit ada:\n1 Dokter\n2 Perawat\n10 Pasien\nSaat ini....\n");
        Thread dokter = new StoryThread1(1);
        dokter.start();
        Thread perawat = new StoryThread1(2);
        perawat.start();
        Thread kasir = new StoryThread1(3);
        kasir.start();
    }
}
