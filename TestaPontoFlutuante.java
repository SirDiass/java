public class TestaPontoFlutuante {
    public static void main(String[] args){
        double salario;
        salario = 12000.80; //double SERVE PARA NUMEROS "QUEBRADOS"
        System.out.println("Joao recebe R$" + salario); //USE '+' PARA JUNTAR STRING COM A VARIAVEL SALARIO
        
        int divisaoInteiro = 5 / 2; //Independente do resultado ser um valor "Quebrado", ele da o resultado inteiro
        System.out.println("A divisao usando inteiro é " + divisaoInteiro);
        
        double divisaoDouble = 5 / 2; //Neste caso ele opera a divisão como numero inteiro pra ai sim virar Double
        System.out.println("A divisao usando double é " + divisaoDouble);
        
        double divisaoDouble2 = 5.0 / 2; // Este é o modo correto, o programador deve indicar pelo menos um valor como Double na operação
        System.out.println("A divisao usando double agora é " + divisaoDouble2);
    }
    
}
