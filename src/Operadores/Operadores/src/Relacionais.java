public class Relacionais {

    public static void main(String[] args) {
        String nomeUm = "Wallekson";
        String nomeDois = new String("Wallekson");
        //String nomeDois = "Wallekson";

        System.out.println(nomeUm.equals(nomeDois));
        //System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero1 é menor que numero2? " + simNao);
    }
}
