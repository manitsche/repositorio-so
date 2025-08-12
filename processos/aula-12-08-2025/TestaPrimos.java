public class TestaPrimos {

    public static boolean verificaPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void executaVerificaPrimo(int limite) {
        for (int n = 0; n <= limite; n++) {
            verificaPrimo(n);
        }
    }

    public static void executaVerificaPrimoP(int limite) {
        for (int n = 0; n <= limite; n++) {
            boolean ehPrimo = verificaPrimo(n);
            System.out.println(n + ": " + ehPrimo);
        }
    }

    public static void main(String[] args) {
        int limite = Integer.parseInt(args[0]);
        char mostrar = args[1].charAt(0);

        long inicio = System.currentTimeMillis();

        if (mostrar == 'p') {
            executaVerificaPrimoP(limite);
        } else {
            executaVerificaPrimo(limite);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (fim - inicio) + " ms");
    }
}