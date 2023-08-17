package videoAventuraEJERCICIO3;

public abstract class Heroe {
    public String nombre;
    public String aspectoVisual;
    private int experiencia;
    private int nivel;
    private int puntosHabilidad;

    public Heroe(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        this.nombre = nombre;
        this.aspectoVisual = aspectoVisual;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntosHabilidad = puntosHabilidad;
    }

    public Heroe(Heroe heroe) {
        this.nombre = heroe.nombre;
        this.aspectoVisual = heroe.aspectoVisual;
        this.experiencia = heroe.experiencia;
        this.nivel = heroe.nivel;
        this.puntosHabilidad = heroe.puntosHabilidad;
    }

    public void datosHeroe() {
        System.out.println( "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", aspectoVisual='" + aspectoVisual + '\'' +
                ", experiencia=" + experiencia +
                ", nivel=" + nivel +
                ", puntosHabilidad=" + puntosHabilidad +
                '}');
    }

    public abstract void ataque();
    public abstract void defensa();
    public abstract void habilidaMagica();
    public abstract Heroe clonar();
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setAspectoVisual(String aspectoVisual) { this.aspectoVisual = aspectoVisual; }
}
