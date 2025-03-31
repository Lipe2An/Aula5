public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 2},
                {1, 2, 3},
                {2, 3, 4}
        };
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        int soma = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }
        System.out.println("Soma: " + soma);
    }
}
