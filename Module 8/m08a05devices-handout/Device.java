interface Device {
    public String getModel();
}
 interface CanTakePictures extends Device {
    public double getMegapixels();
}
 interface CanPlayMusic extends Device {
    public String[] getMusicFormats();
}
 interface CanMakeCalls extends Device {
    public String getNetworkType();
}
class Camera implements CanTakePictures {
    private String model;
    private double megapixels;

    Camera(String model, double megapixels) {
        this.model = model;
        this.megapixels = megapixels;
    }
    public String getModel() {
        return model;
    }
    public double getMegapixels() {
        return megapixels;
    }


}
class MusicPlayer implements CanPlayMusic {
    private String model;
    private String[] musicFormats;

    MusicPlayer(String model, String[] musicFormats) {
        this.model = model;
        this.musicFormats = musicFormats;
    }
    public String getModel() {
        return model;
    }
    public String[] getMusicFormats() {
        return musicFormats;
    }
}
class Featurephone implements CanMakeCalls{
    private String model;
    private String networkType;

    Featurephone(String model, String networkType) {
        this.model = model;
        this.networkType = networkType;
    }
    public String getModel() {
        return model;
    }
    public String getNetworkType() {
        return networkType;
    }
}
class Smartphone implements CanMakeCalls, CanPlayMusic, CanTakePictures {
    private String model;
    private double megapixels;
    private String musicFormats[];
    private String networkType;

    Smartphone(String model, String networkType, double megapixels, String musicFormats[]) {
        this.model = model;
        this.megapixels = megapixels;
        this.musicFormats = musicFormats;
        this.networkType = networkType;
    }
    public String getModel() {
        return model;
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
