package videoAventuraEJERCICIO3;

public class Guerrero extends Heroe {
    public Guerrero(String nombre, String aspectoFisico, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoFisico, experiencia, nivel, puntosHabilidad);
    }

    private Guerrero(Guerrero prototipo) {
        super(prototipo);
    }

    @Override
    public void ataque() {
        System.out.println("Daño producido 200");
    }

    @Override
    public void defensa() {
        System.out.println("Escudo 500");
    }

    @Override
    public void habilidaMagica() {
        System.out.println("Regenracion de salud");
    }

    @Override
    public Heroe clonar() {
        return new Guerrero(this);
    }
}
