package calculodeerrores;
/**
 * @author Llanes Barrera Luis Angel 
 * Semestre: Cuarto Grupo: A
 */
public class Errores {
    private double valorReal;
    private double valorAproximado;

    public Errores(double vaRe, double vaApro) {
        valorReal = vaRe;
        valorAproximado = vaApro;
    }

    double ErrorAbsoluto() {
        double ErrorR = Math.abs(valorAproximado - valorReal);
        return ErrorR;
    }

    double ErrorRelativo() {
        double ErrorA = (ErrorAbsoluto()) / valorReal;
        return ErrorA;
    }

    double ErrorRelativoPorcentual() {
        double ErrorRP = (ErrorRelativo()) * 100;
        return ErrorRP;
    }
}
