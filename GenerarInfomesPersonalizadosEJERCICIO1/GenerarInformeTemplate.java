package GenerarInfomesPersonalizadosEJERCICIO1;

public abstract class GenerarInformeTemplate {

    public void pasosGenerarInforme(Formato formato) {

        traerDatosDB();
        converirDatos();
        hacerCalculos();
        if (traerCRM()) {
            traerClientesMasGastan();
        }
        organizarResultado();

        if (formato.tipoExtension().equals("Excel")) {
            guardarInformeExcel(formato);
        } else {
            guardarInforme(formato);
        }
    }

    private void traerClientesMasGastan() {
        System.out.println("El cliente que más gasta es pepito");
    }

    abstract boolean traerCRM();

    private void guardarInforme(Formato formato) {
        System.out.println("Se guardo el informe en formato: " + formato.tipoExtension());
    }

    abstract void traerDatosDB();

    private void converirDatos() {
        System.out.println("Los datos se convirtieron a txt");
    }

    abstract void hacerCalculos();

    abstract void organizarResultado();

    private void guardarInformeExcel(Formato formato) {
        System.out.println("Haciendo las macros en Excel");
        System.out.println("Se guardo el informe en formato: " + formato.tipoExtension());
    }


}
