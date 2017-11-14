public abstract class Professor
{
    protected String nome;
    protected int matricula;
    protected int cargaHoraria;

    public Professor(String n, int m, int c) {
        try {
            setNome(n);
            setMatricula(m);
            setCargaHoraria(c);
        }
        catch(Exception e) {
            throw new IllegalStateException( "Valores inválidos no construtor Professor");
        }
    }
    
    public void setNome(String n) {
        if (n == null) {
            n = "";
        }
        nome = n.trim(); //retira os espaços em branco do início e fim da palavra
        if (nome.length() == 0) {
            throw new IllegalArgumentException("Argumento não deve ser branco em setNome");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setMatricula(int m) {
        if (m<=0) {
            throw new IllegalArgumentException("Argumento negativo ou nulo em setMatricula");
        } else {
            matricula = m;
        }
    }
    public int getMatricula() {
        return matricula;
    }
    public void setCargaHoraria(int c) {
        if (c<0) {
            throw new IllegalArgumentException("Argumento negativo em setCargaHoraria");
        } else {        
            cargaHoraria = c;
        }
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String toString() {
        return "Matricula: " + matricula + "\n"
             + "Nome: " + nome + "\n"
             + "Carga horaria: " + cargaHoraria;
    }
    public abstract double getSalario();
}
