package GenerarInfomesPersonalizadosEJERCICIO1;

public abstract class GenerarInformeTemplate {


    public void pasosGenerarInforme() {
        traerDatosDB();
        converirDatos();
        hacerCalculos();
        organizarResultado();
        guardarInforme();
    }

    abstract void traerDatosDB();

    private void converirDatos() {
        System.out.println("Los datos se convirtieron a txt");
    }

    abstract void hacerCalculos();

    abstract void organizarResultado();

    abstract void guardarInforme();

}
