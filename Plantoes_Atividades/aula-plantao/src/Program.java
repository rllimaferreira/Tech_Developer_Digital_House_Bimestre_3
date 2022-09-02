import entities.Medico;
import entities.Paciente;

public class Program {

    // Gerenciar as classes
    // Instanciar (criar) os objetos aqui
    public static void main(String[] args) {

        // A gente cria abaixo para instanciar um novo objeto
        // Chamando (instanciando) o primeiro médico
        Medico m1 = new Medico(12345, "Maria da Silva", "Pediatra");
        // Chamando (instanciando) o segundo médico
        Medico m2 = new Medico(123456, "João da Silva", "Cardiologista");
        Paciente p1 = new Paciente(05565347, "Luis da Silva", 883876783, "25/12/1993");
        Paciente p2 = new Paciente(05565347, "Maria Célia", 893876783, "25/12/1999");

//        Medico medicoPediatra = ();
//        Medico medicoCardiologista = ();

        // Chamadas
        System.out.println("\nAcesso como médico");
        m1.acessarApp();
        m1.criarGuiaExame();
        System.out.println(m1);
        m2.criarGuiaExame();
        System.out.println(m2);

        System.out.println("\nAcesso como Paciente");
        p1.acessarApp();
        p1.dadosPaciente();
        System.out.println(p1);
        p2.dadosPaciente();
        System.out.println(p2);
    }
}
