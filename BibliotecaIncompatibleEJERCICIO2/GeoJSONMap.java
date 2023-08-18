package BibliotecaIncompatibleEJERCICIO2;

public class GeoJSONMap implements Maps {
    private String name;
    private double xCoordinate;
    private double yCoordinate;


    @Override
    public void loadGeoJSONMap() {
        System.out.println("Mapa GeoJSON cargado exitosamente");
    }

    @Override
    public String getName() {
        name = "Universidad de el bosque";
        return name;
    }

    @Override
    public double getxCoordinate() {
        xCoordinate = -74.03137770152625;
        return xCoordinate;
    }

    @Override
    public double getyCoordinate() {
        yCoordinate = 4.710787015491107;
        return yCoordinate;
    }

}
