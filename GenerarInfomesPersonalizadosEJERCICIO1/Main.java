package GenerarInfomesPersonalizadosEJERCICIO1;

public class Main {
    public static void main(String[] args) {

        GenerarInformeTemplate infomeCostos = new InformeCostos();
        Formato Excel = new Excel();
        infomeCostos.pasosGenerarInforme(Excel);

        System.out.println("**************************");

        GenerarInformeTemplate infomeClientes = new InformeClientes();
        Formato HTML = new HTML();
        infomeCostos.pasosGenerarInforme(HTML);
    }
}
