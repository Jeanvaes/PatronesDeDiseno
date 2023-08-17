package BibliotecaIncompatibleEJERCICIO2;


public class FileKMLAdapter implements Maps
{

    @Override
    public void loadGeoJSONMap()
    {
        new KMLMap().loadKMLMap();
    }
}
