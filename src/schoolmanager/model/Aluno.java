package schoolmanager.model;

public class Aluno {
    
    private int id;
    private String RA;
    private String nome;
    private int idade;
    private String turma;

    public Aluno(int id, String RA, String nome, int idade, String turma) {
        this.id = id;
        this.RA = RA;
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    public Aluno() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", RA=" + RA + ", nome=" + nome + ", idade=" + idade + ", turma=" + turma + '}';
    }
        
}
