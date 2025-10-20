public class MainTurma {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Raimundo");
        Turma turma = new Turma("M1234");

        turma.setProfessor(prof1);
        turma.resumo();

        System.out.println("\nTrocando de professor...\n");

        Professor prof2 = new Professor("João");
        turma.setProfessor(prof2);
        turma.resumo();
    }
}
