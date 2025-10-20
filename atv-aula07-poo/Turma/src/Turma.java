
public class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        System.out.println("Código da Turma: " + codigo);
        if (professor != null)
            System.out.println("Professor: " + professor.getNome());
        else
            System.out.println("Professor não definido.");
    }
}
