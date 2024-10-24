public class TiposDeVariaveis {

    public static void main(String[] args) {
        
        int idade = 39;
        double altura = 1.57;
        char genero = 'F';
        boolean estudante = true;

        System.out.println("Tenho "+idade+" anos.");
        System.out.println(altura+"m de altura");
        if(genero == 'F')System.out.println("Do gênero Feminino");
        else System.out.println("Do gênero Masculino");
        System.out.print("Profissão Atual: ");
        if(estudante == true)System.out.println("Estudante de tecnologia Java...");
        else System.out.println("Apenas trabalho no momento...");
    }
}
