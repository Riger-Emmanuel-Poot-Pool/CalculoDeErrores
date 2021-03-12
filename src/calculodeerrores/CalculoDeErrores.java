package calculodeerrores;
import java.util.Scanner;
/**
 * @author Llanes Barrera Luis Angel
 * Semestre: Cuarto  Grupo: A
 */
public class CalculoDeErrores {
    public static void main(String[] args) {
        double valorR, valorA;
        Scanner xd = new Scanner(System.in);
        System.out.print("Ingrese el valor real: ");
        valorR = xd.nextDouble();
        System.out.print("Ingrese el valor aproximado: ");
        valorA = xd.nextDouble();
        Errores E = new Errores(valorR, valorA);
        System.out.println("\n**************************************************************\n");
        System.out.println("El error absoluto es " + E.ErrorAbsoluto());
        System.out.println("El error relativo es " + E.ErrorRelativo());
        System.out.println("El error relativo porcentual es " + E.ErrorRelativoPorcentual() + "%");
    }
}
