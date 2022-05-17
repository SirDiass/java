public class ExercitaIfs {
    public static void main(String[] args) {

        double salario = 1900.0;
        System.out.println(salario);
        //ifs aqui
        if (salario >= 1900.0 && salario <=2800.0){
            System.out.println("O IR e de 7.5% e pode deduzir na declaração o valor de R$ 142");
            System.out.println(salario - 142.0);
        } else if (salario >= 2800.01 && salario <= 3751.0){
                System.out.println("O IR e de 15% e pode deduzir R$ 350");
                System.out.println(salario - 350.0);
        } else if (salario >= 3751.01 && salario <= 4664){
                    System.out.println("O IR e de 22.5% e pode deduzir R$ 636");
                    System.out.println(salario - 636.0);
        }
    }
}
