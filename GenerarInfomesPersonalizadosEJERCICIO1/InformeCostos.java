package GenerarInfomesPersonalizadosEJERCICIO1;

public class InformeCostos extends Informe {
    @Override
    public String getNombre() {
        return "Infome de costos";
    }

    @Override
    void traerDatosDB() {
        System.out.println("Extrayendo los datos Financieros");
    }

    @Override
    void hacerCalculos() {
        System.out.println("Calculando...");
    }

    @Override
    void organizarResultado() {
        System.out.println("El Resultado se Formateo");
    }

}
