package atividade;

import modelo.ThreadCalc;

public class ThreadMaster {

    public void letsDoSomeCalc() {
        double[] vet = new double[11];
        int cpu_threads = 3;

        Thread[] th = new Thread[cpu_threads];

        for (int i = 0; i < cpu_threads; i++) {
            th[i] = new Thread(new ThreadCalc(i, vet, cpu_threads));
            th[i].start();
        }
        
        for (int i = 0; i < vet.length; i++) {
             System.out.print((int) vet[i] + " ");
        }
    }
}
