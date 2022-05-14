public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Teste de Condicionais");
        int idade = 17;
        int acompanhantes = 1;
        if (idade >= 18){
            System.out.println("Você é maior de idade.");
            System.out.println("Autorização para entrar no ambiente.");
        } else {
            if (acompanhantes >= 2){
                System.out.println("Você ainda é menor de idade, logo seus acompanhantes serão seus responsáveis.");
            }else{
            System.out.println("Infelizmente voce é menor de idade.");
            System.out.println("Logo não está autorizado a entrar.");
            }
        }
    }
}
