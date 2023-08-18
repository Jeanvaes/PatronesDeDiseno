package GenerarInfomesPersonalizadosEJERCICIO1.logica;

public abstract class GenerarInformeTemplate {


    public void pasosGenerarInforme() {
        traerDatosDB();
        converirDatos();
        hacerCalculos();
        organizarResultado();
        guardarInforme();
    }

    abstract void traerDatosDB();

    public String converirDatos(){
        return "Los datos se convirtieron a txt";
    }
    abstract void hacerCalculos();

    abstract void organizarResultado();

    public String guardarInforme(){
        return "El informe se guardo en Descargas";
    }

}
