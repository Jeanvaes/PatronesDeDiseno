package BibliotecaIncompatibleEJERCICIO2;

public class GeoDataProcessor {

    public void processData() {

        Maps mapa1 = new FileKMLAdapter();
        Maps mapa2 = new GeoJSONMap();
        mapa1.loadGeoJSONMap();
        System.out.println(mapa1.getName() + " " + mapa1.getxCoordinate() + " " + mapa1.getyCoordinate());
        mapa2.loadGeoJSONMap();
        System.out.println(mapa2.getName() + " " + mapa2.getxCoordinate() + " " + mapa2.getyCoordinate());
    }
}
