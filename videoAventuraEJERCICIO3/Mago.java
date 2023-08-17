package videoAventuraEJERCICIO3;

public class Mago extends Heroe {
    public Mago(String nombre, String aspectoFisico, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoFisico, experiencia, nivel, puntosHabilidad);
    }

    public Mago(Mago prototipo) {
        super(prototipo);
    }

    @Override
    public void ataque() {
        System.out.println("Daño producido 150");
    }

    @Override
    public void defensa() {
        System.out.println("Escudo 600");
    }

    @Override
    public void habilidaMagica() {
        System.out.println("Escudo magico");
    }

    @Override
    public Heroe clonar() {
        return new Mago(this);
    }
}
