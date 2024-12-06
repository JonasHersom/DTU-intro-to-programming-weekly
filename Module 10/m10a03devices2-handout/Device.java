abstract class Device {
    private String model;

    Device(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
 interface CanTakePictures {
    public String getModel();
    public double getMegapixels();
}
 interface CanPlayMusic {
    public String getModel();
    public String[] getMusicFormats();
}
 interface CanMakeCalls {
    public String getModel();
    public String getNetworkType();
}
class Camera extends Device implements CanTakePictures {
    private double megapixels;

    Camera(String model, double megapixels) {
        super(model);
        this.megapixels = megapixels;
    }
    public double getMegapixels() {
        return megapixels;
    }


}
class MusicPlayer extends Device implements CanPlayMusic {
    private String[] musicFormats;

    MusicPlayer(String model, String[] musicFormats) {
        super(model);
        this.musicFormats = musicFormats;
    }
    public String[] getMusicFormats() {
        return musicFormats;
    }
}
class Featurephone extends Device implements CanMakeCalls{
    private String networkType;

    Featurephone(String model, String networkType) {
        super(model);
        this.networkType = networkType;
    }
    public String getNetworkType() {
        return networkType;
    }
}
class Smartphone extends Device implements CanMakeCalls, CanPlayMusic, CanTakePictures {
    private double megapixels;
    private String musicFormats[];
    private String networkType;

    Smartphone(String model, String networkType, double megapixels, String musicFormats[]) {
        super(model);
        this.megapixels = megapixels;
        this.musicFormats = musicFormats;
        this.networkType = networkType;
    }
    public double getMegapixels() {
        return megapixels;
    }
    public String[] getMusicFormats() {
        return musicFormats;
    }
    public String getNetworkType() {
        return networkType;
    }
}
