public class TestaEscopoVariaveis {
    public static void main(String[] args) {
        int idade = 18;
        int acompanhantes = 2;
        
        //SE ISOLARMOS O BOOLEAN ENTRE CHAVES, ELE SÓ FUNCIONA DENTRO DAQUELA FUNCÃO
        //EX: int acompanhantes = 2;{ INICIALIZA
        //boolean acompanhado; AQUI ESTA INICIALIZADO
        //} AQUI ELE ENCERRA
        
        boolean acompanhado; //Declaração de que ESTE BOOLEAN "ACOMPANHADO" É INICIALIZADO
    
        if (acompanhantes >= 2){
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        
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
