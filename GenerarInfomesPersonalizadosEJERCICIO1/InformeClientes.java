package GenerarInfomesPersonalizadosEJERCICIO1;

public class InformeClientes extends Informe {
    @Override
    public String getNombre() {
        return "Infome Clientes";
    }

    @Override
    boolean traerCRM() {
        return true;
    }

    @Override
    void traerDatosDB() {
        System.out.println("Extrayendo los datos de Clientes");
    }

    @Override
    void hacerCalculos() {
        System.out.println("Calculando datos Clientes...");
    }

    @Override
    void organizarResultado() {
        System.out.println("El Resultado se Formateo con los insights clientes");
    }

}
