import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        //OPERADORES DE ATRIBUIÇÃO

        //classe Operadores.java
        String nome = "WALLEKSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        //OPERADORES ARITIMÉTICOS

        // classe Operadores.java
        String nomeCompleto = "Linguagem + Java";

        //qual o resultado das expressões abaixo?
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1+1+1);
        System.out.println(concatenacao);

        //OPERADORES UNÁRIOS

        //Exemplo
        int numero = 5;

        System.out.println(numero);

        System.out.println(- numero);

        System.out.println(numero);

        // se queremos que a variavel se torne negativa e nao retorne ao valor original
        //precisamos atribuir o operador a variavel

        int numero1 = 5;

        numero1 = - numero1;

        System.out.println(numero1);

        numero1 = + numero1; // ele entende o + como adição

        System.out.println(numero1);

        //para retornar a varial para o valor positivo temos que:

        numero1 = numero1 * -1;

        System.out.println(numero1);







    }
}