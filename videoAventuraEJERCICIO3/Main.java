package videoAventuraEJERCICIO3;

public class Main {
    public static void main(String[] args) {

        Arquero yo = new Arquero("jona","feo",500,800,90);
        Arquero yo1 = (Arquero) yo.clonar();
        yo.datosHeroe();
        yo1.datosHeroe();

        Mago david = new Mago("david","lindo",666,999,7);
        Mago davidClonado = (Mago) david.clonar();
        davidClonado.setNombre("nose");
        davidClonado.setAspectoVisual("sasa");
    }
}
