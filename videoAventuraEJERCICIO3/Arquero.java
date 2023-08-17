package videoAventuraEJERCICIO3;

public class Arquero extends Heroe {
    public Arquero(String nombre, String aspectoFisico, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoFisico, experiencia, nivel, puntosHabilidad);
    }

    private Arquero(Arquero prototipo) {
        super(prototipo);
    }
    @Override
    public void ataque() {
        System.out.println("Daño producido 250");
    }

    @Override
    public void defensa() {
        System.out.println("Escudo 300");
    }

    @Override
    public void habilidaMagica() {
        System.out.println("Lluvia de flechas");
    }

    @Override
    public Heroe clonar() {
        return new Arquero(this);
    }


}
