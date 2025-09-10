package atividades;

import modelo.HelloFromThread;
import java.util.Scanner;

public class HelloMaster {
    
    public void letsGetsSomeHellos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de threads: ");
        int numThreads = scanner.nextInt();
        
        Thread[] threads = new Thread[numThreads];
        
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new HelloFromThread(i + 1));
            threads[i].start();
        }
        
        System.out.println(numThreads + " thread(s) criadas!");
    }
}