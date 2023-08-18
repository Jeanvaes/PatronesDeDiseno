package GenerarInfomesPersonalizadosEJERCICIO1;

public abstract class GenerarInformeTemplate {


    public void pasosGenerarInforme(Formato formato) {
        traerDatosDB();
        converirDatos();
        hacerCalculos();
        organizarResultado();
        guardarInforme(formato);
    }

    abstract void traerDatosDB();

    private void converirDatos() {
        System.out.println("Los datos se convirtieron a txt");
    }

    abstract void hacerCalculos();

    abstract void organizarResultado();

    private void guardarInforme(Formato formato) {
        System.out.println("Se guardo el informe en formato: " + formato.tipoExtension());
    }

}
