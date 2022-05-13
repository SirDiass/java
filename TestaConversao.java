public class TestaConversao {
    public static void main(String[] args){
        double salario = 12000.50;
        float valorFlutuante = 3.14f; // Onde 'f' FAZ A CONVERSAO PARA VALOR FLUTUANTE
        int valor = (int) salario; // Ele "transforma" o salario em um valor inteiro, ignorando oque tem após o ponto
        
        System.out.println("O Salario convertido é R$ "+ valor);
    }
    
}
