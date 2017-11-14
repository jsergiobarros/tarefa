public class ProfDE extends Professor {

    private double salario;
    
    public ProfDE(String n, int m, double s) {
        super(n,m,40);
        try {
            setSalario(s);
        }
        catch (Exception e) {
            throw new IllegalStateException( "Valores inválidos no construtor ProfRegime");
        }
    }

    public void setSalario(double s) {
        if (s<0) {
            throw new IllegalArgumentException("Argumento negativo em setSalario");
        } else {
            salario = s;
        }
    }
    
    public String toString() {
        return super.toString() + "\n"
             + "Salario: " + salario;
    }
    
    public double getSalario() {
        return salario;
    }
}
