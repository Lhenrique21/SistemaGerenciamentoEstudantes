//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas");
        Estudante estudante01 = new Estudante("Luiz", 01, ads, 18);
        Estudante estudante02 = new Estudante("Larah", 02, ads, 16);
        Estudante estudante03 = new Estudante("Giovanna", 03, ads, 21);
        Estudante estudante04 = new Estudante("Ezequias", 04, ads, 28);
        Estudante estudante05 = new Estudante("Heitor", 05, ads, 35);

        GerenciadorEstudantes gerenciador = new GerenciadorEstudantes();

        gerenciador.cadastrar(estudante01);
        gerenciador.cadastrar(estudante02);
        gerenciador.cadastrar(estudante03);
        gerenciador.cadastrar(estudante04);
        gerenciador.listarEstudantes();

        System.out.println("================");
        gerenciador.buscarEstudantes(estudante01);

        System.out.println("================");
        gerenciador.buscarEstudantes(estudante05);
        gerenciador.cadastrar(estudante05);
        gerenciador.listarEstudantes();

        System.out.println("================");
        gerenciador.excluirEstudantes(estudante01);


    }
}