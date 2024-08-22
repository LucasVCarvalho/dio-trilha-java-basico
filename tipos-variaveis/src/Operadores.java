public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        // x repetição
        // numero++
        // numero = numero + 1
        System.out.println(++numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);
        // aula 5
        int a, b;
        a = 5;
        b = 6;

        // operador ternario
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // aula 6
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        // aula7
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }

    }
}
