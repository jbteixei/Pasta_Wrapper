public class ConversaoParaWrappers {

    public static void main(String args[]) {
        System.out.println("**** Conversão de int para Wrappers ****");
        int valor1 = 15;
        System.out.println(valor1);
        System.out.println(" ");
        Integer valor2 = 15;
        System.out.println(valor2);

        System.out.println("**** Utilizando o Casting ****");
        int valor3 = 100;
        short valor4 = (short) valor3;
        System.out.println(valor3);
        System.out.println(" ");
        System.out.println(valor4);

    }
}
