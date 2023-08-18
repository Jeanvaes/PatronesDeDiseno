package GenerarInfomesPersonalizadosEJERCICIO1;

public class InformeClientes extends Informe {
    @Override
    public String getNombre() {
        return "Infome Clientes";
    }

    @Override
    void traerDatosDB() {
        System.out.println("Extrayendo los datos de Clientes");

    }

    @Override
    void hacerCalculos() {
        System.out.println("Calculando...");

    }

    @Override
    void organizarResultado() {

    }
}
