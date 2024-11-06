//import atv2.Empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1= new Empregado("Alan","Ferreira",1000.20);
        Empregado empregado2= new Empregado("Maria", "Borges", 700.00);

        System.out.println("Salario mensal do " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalario_mensal());

        System.out.println("Salario atual do " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalario_mensal());


        


    }
}
