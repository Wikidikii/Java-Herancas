package herancafuncionario;

public class TestaHeranca {

    public static void main(String[] args) {
        Gerente x = new Gerente(2400.0,"Paulo", 16700.5, 55320);

        Funcionario[] set = new Funcionario[3];
        set[0] = x;
        set[1] = new Funcionario("Antonieta",760.5, 49211); 

        set[2] = new Funcionario("Aurio",1220.5, 43678);

        for (int i = 0; i < set.length; i++) {
            System.out.println(set[i].getNome()
                    + " " + set[i].getSalario());
        }
    }
}
