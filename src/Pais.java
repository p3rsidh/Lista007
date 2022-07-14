import java.util.*;

public class Pais {
    private Scanner scan;
    private String nome;
    private String codigoISO;
    private double populacao;
    private double dimensao;

    ArrayList<Pais> paisesVizinhos = new ArrayList<Pais>();


    public Pais(String nome, String codigoISO, double populacao, double dimensao) {
        this.scan = new Scanner(System.in);
        this.nome = nome;
        this.codigoISO = codigoISO;
        this.populacao = populacao;
        this.dimensao = dimensao;

    }

    public String incluirPaisVizinho() {
        System.out.println("Qual o nome do pais vizinho?");
        String novoNome = scan.next();
        System.out.println("Digite o codigo ISO  - ex - BRA");
        String novoCodigo = scan.next();
        System.out.println("Digite o numero da população do pais");
        Double novaPopulacao = scan.nextDouble();
        System.out.println("Digite a dimensao do pais");
        Double novaDimensao = scan.nextDouble();

        this.paisesVizinhos.add(new Pais(novoNome, "", 0, 0));

        return novoNome;
    }

    int tamanhoLista(){
        return paisesVizinhos.size();
    }

    Double buscarDensidade(){
        return getPopulacao();
    }
    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Pais> getPaisesVizinhos() {
        return paisesVizinhos;
    }

    public void setPaisesVizinhos(ArrayList<Pais> paisesVizinhos) {
        this.paisesVizinhos = paisesVizinhos;
    }
}
