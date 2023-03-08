public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
       /* byte idade = 123;
          short ano = 2021;
          int cep = 21070333; // se começar com zero pode ser que tenha que mudar o tipo de variavel
          long cpf = 98765432109L; // tipo long o conteudo deve terminar com 'L'. Se começar com zero pode ser que tenha que mudar o tipo de variavel
          float pi = 3.14F; // // tipo float o conteudo deve terminar com 'F'
          double salario = 1275.33;*/
    
           

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;

    /*short numeroCurto = 1;
      int numeroNormal = numeroCurto;
      short numeroCurto2 = numeroNormal;
    
      Essa forma esta incorreta por isso é adicionado um cast(adaptação)*/

   

}
}
