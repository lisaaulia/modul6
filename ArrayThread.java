/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author LisaAulia
 * NOMOR 1
 */
public class ArrayThread extends Thread{
    int arr1[] = {6,9,1,2,3,5};
    int arr2[] = {7,11,6,4,3,1};
    int arr3[] = {5,4,3,2,1,12};
    int hasil[] = new int[6];
    int index;
    int total;
    public ArrayThread(int index){
        this.index=index;
        
    }

    public void run(){
        hasil[index]=arr1[index]+arr2[index]+arr3[index];
        System.out.println("Hasil array tiap indeks ke "+index+" adalah "+arr1[index]+" + "+arr2[index]+" + "+arr3[index]+" = "+hasil[index]);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){
        
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new ArrayThread(0);
        t1.start();
        Thread t2 = new ArrayThread(1);
        t2.start();
        Thread t3 = new ArrayThread(2);
        t3.start();
        Thread t4 = new ArrayThread(3);
        t4.start();
        Thread t5 = new ArrayThread(4);
        t5.start();
        Thread t6 = new ArrayThread(5);
        t6.start();
        
    }
}
