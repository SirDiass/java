public class TestaLaco {
    public static void main(String[] args) {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
            for (int contadorPC = 0; contadorPC <= 10; contadorPC++ ){
                System.out.print(multiplicador *contadorPC); //VAI MOSTRAR A MULTIPLICAÇÃO DE 1 VALOR COM A REPETIÇÃO
                System.out.print(" ");
            }
            System.out.println(); //FORA DO ESCOPO VAI SERVIR PARA QUE A CADA LAÇO ELE PULE UMA LINHA
        }
    }
}
