package inteligenciaartificial;
/**
 *
 * @author Alma LHO
 */
public class Metodo_Exhaucion {
    public static void main(String[] args) { 
        double NLados = 6;
        double LadoInicial = 1;
        double x, a, b, NuevoLado , P, PD;
        System.out.println("  NLados  ||     LadoInicial     ||          x          ||          a         ||          b         ||     NuevoLado     ||          P          ||     PD");
        for (int i = 1; i <= 12; i++){   
        x = LadoInicial / 2;
        a = Math.sqrt((1-(x*x)));
        b = 1 - a;
        NuevoLado = Math.sqrt(((x*x)+(b*b)));
        P = NLados * LadoInicial;
        PD = P/2;
        System.out.println(NLados + " || " + LadoInicial + " || " + x + " || " + a + " || " + b + " || " + NuevoLado + " || " + P + " || " + PD);
        NLados = NLados*2;     
        LadoInicial = NuevoLado;
        }}}