public class Kiraci {


    public Kiraci(String ad, String soyad, EvSahibi evSahibi) {
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setEvSahibi(evSahibi);
    }

    private String ad;
    private String soyad;
    private EvSahibi evSahibi;

    public void displayInfo() {
        System.out.println("Kiracının bilgileri");
        System.out.println("adı:"+ getAd() +" soyadı:"+getSoyad());
        getEvSahibi().displayInfo();
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public EvSahibi getEvSahibi() {
        return evSahibi;
    }

    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }
}