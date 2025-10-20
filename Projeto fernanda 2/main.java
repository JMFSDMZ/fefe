
import java.util.Scanner;

class MainClass {

    public static void main(String[] args) {
        // Objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as 8 notas anuais
        double[] notasAnuais = new double[8];

        System.out.println("--- Sistema de Cálculo de Médias Escolares ---");
        System.out.println("Por favor, insira as 8 notas anuais:");

        // Laço para receber as 8 notas
        for (int i = 0; i < 8; i++) {
            // O índice 'i' + 1 corresponde ao número da nota (1 a 8)
            System.out.printf("Nota %d: ", i + 1);
            // Garante que a entrada é um número e armazena
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, insira um número para a nota.");
                scanner.next(); // Descarta a entrada inválida
                System.out.printf("Nota %d: ", i + 1);
            }
            notasAnuais[i] = scanner.nextDouble();
        }

        calcularEExibirMedias(notasAnuais);

        scanner.close();
    }

    /**
     * Método principal que calcula as médias bimestrais, semestrais e final e
     * exibe os resultados.
     *
     * @param notas O array contendo as 8 notas anuais.
     */
    public static void calcularEExibirMedias(double[] notas) {
        if (notas.length != 8) {
            System.out.println("Erro: São necessárias exatamente 8 notas.");
            return;
        }

        // Cálculo das Médias Bimestrais
        // Notas são distribuídas assim:
        // 1º Bimestre: notas[0] e notas[1]
        // 2º Bimestre: notas[2] e notas[3]
        // 3º Bimestre: notas[4] e notas[5]
        // 4º Bimestre: notas[6] e notas[7]
        // 1º Bimestre: Média das notas 1 e 2 (índices 0 e 1)
        double media1Bim = (notas[0] + notas[1]) / 2.0;

        double media2Bim = (notas[2] + notas[3]) / 2.0;

        double media3Bim = (notas[4] + notas[5]) / 2.0;

        double media4Bim = (notas[6] + notas[7]) / 2.0;

        double media1Sem = (media1Bim + media2Bim) / 2.0;

        double media2Sem = (media3Bim + media4Bim) / 2.0;

        double mediaFinal = (media1Sem + media2Sem) / 2.0;

        System.out.println("\n=============================================");
        System.out.println("           RELATÓRIO DE MÉDIAS ANUAIS         ");
        System.out.println("=============================================");

        System.out.println("\n--- 1º SEMESTRE ---");
        System.out.printf("1º Bimestre: %.1f\n", media1Bim);
        System.out.printf("2º Bimestre: %.1f\n", media2Bim);
        System.out.println("---------------------");
        System.out.printf("Média 1º Semestre: %.1f\n", media1Sem);
        System.out.println("---------------------");

        System.out.println("\n--- 2º SEMESTRE ---");
        System.out.printf("3º Bimestre: %.1f\n", media3Bim);
        System.out.printf("4º Bimestre: %.1f\n", media4Bim);
        System.out.println("---------------------");
        System.out.printf("Média 2º Semestre: %.1f\n", media2Sem);
        System.out.println("---------------------");

        System.out.println("\n=============================================");
        System.out.printf("         MÉDIA FINAL ANUAL: %.1f\n", mediaFinal);
        System.out.println("=============================================");
    }
}
