public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Teste de Condicionais 2");
        int idade = 18;
        int acompanhantes = 2;
        boolean acompanhado = acompanhantes >= 2; //Boolean guarda apenas TRUE ou FALSE, sendo assim se o N de acompanhantes for >=2 ele é TRUE
        
        System.out.println("Idade do convidado = " + idade);
        System.out.println("Pessoas que acompanham o convidado = " + acompanhantes);
        //CONDICIONAIS  || (OU/or)- TEM DE PREENCHER AO MENOS 1 CONDICAO.   &&(E/and) - DEVE PREENCHER TODAS AS CONDICOES
        if (idade >= 18 || acompanhado ){
            System.out.println("Voce preenche a condicao necessaria para entrar.");
            System.out.println("Seja bem vindo ao nosso ambiente.");
        } else {            
            System.out.println("Infelizmente voce nao preenche as condicoes necessarias para entrar.");
            System.out.println("Acesso ao ambiente negado.");
            }
    }   
}