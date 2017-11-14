public class ProfHorista extends Professor {

    private double salarioHora;
    
    public ProfHorista(String n, int m, int c, double s) {
        super(n,m,c);
        try {
            setSalarioHora(s);
        }
        catch(Exception e) {
            throw new IllegalStateException( "Valores inválidos no construtor ProfHorista");
        }  
    }

    public void setSalarioHora(double s) {
        if (salarioHora < 0) {
            throw new IllegalArgumentException("Argumento negativo em setSalarioHora");
        } else {
            salarioHora = s;
        }
    }
    
    public double getSalarioHora() {
        return salarioHora;
    }
    
    public String toString() {
        return super.toString() + "\n"
             + "Salario por hora: " + salarioHora + "\n"
             + "Salario: " + getSalario();
    }
    
    public double getSalario() {
        return (salarioHora * getCargaHoraria() * 4.5);
    }
}
