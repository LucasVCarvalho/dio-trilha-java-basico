public class AboutMe {
    public static void main(String[] args) throws Exception {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        // executar no cmd na pasta bin do projeto, exemplo:"java AboutMe Lucas Carvalho
        // 24 1.71"
        // ou configurar a launch.json para adicionar o args para testar na ide

    }
}
