import java.util.ArrayList;

public class GerenciadorEstudantes {
    private Curso curso;
    private Estudante estudante;
    public ArrayList<Estudante> verEstudantes = new ArrayList<>();

    public void cadastrar(Estudante estudante1){
        verEstudantes.add(estudante1);
    }
    public void listarEstudantes(){
        System.out.println(verEstudantes);
    }
    public void buscarEstudantes(Estudante estudante1){
        if(verEstudantes.contains(estudante1)){
            System.out.println("Estudante está no nosso banco de dados!");
            System.out.println(estudante1);
        }else {
            System.out.println("Estudante não está no nosso banco de dados!");
        }
    }
    public void  excluirEstudantes(Estudante estudante1){
        if(verEstudantes.contains(estudante1)){
            verEstudantes.remove(estudante1);
        }else {
            System.out.println("Estudante não está no nosso banco de dados!");
        }
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
