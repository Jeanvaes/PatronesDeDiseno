package BibliotecaIncompatibleEJERCICIO2;

public class GeoDataProcessor
{

    public void processData()
    {

        Maps mapa1= new FileKMLAdapter();
        Maps mapa2= new GeoJSONMap();
        mapa1.loadGeoJSONMap();
        mapa2.loadGeoJSONMap();

    }
}
