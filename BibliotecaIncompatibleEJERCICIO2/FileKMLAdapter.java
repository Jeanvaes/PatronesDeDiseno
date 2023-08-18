package BibliotecaIncompatibleEJERCICIO2;


public class FileKMLAdapter implements Maps {

    @Override
    public void loadGeoJSONMap() {
        new KMLMap().loadKMLMap();
    }

    @Override
    public String getName() {
        return new KMLMap().descriptiveName();
    }

    @Override
    public double getxCoordinate() {
        return new KMLMap().getxCord();
    }

    @Override
    public double getyCoordinate() {
        double zCord = new KMLMap().getzCord();
        if (0 != zCord) {
            zCord = (double) 0;
        }
        return zCord + new KMLMap().getyCord();
    }


}
