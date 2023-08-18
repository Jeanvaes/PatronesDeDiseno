package GenerarInfomesPersonalizadosEJERCICIO1;

public class Excel implements Formato {
    @Override
    public String tipoExtension() {
        return "Excel";
    }

    public void crearMacros() {
        System.out.println("Haciendo las macros en Excel");
    }
}
