public class EvSahibi {

    EvSahibi(String ad,String soyad,Bina bina){
        this.setAd(ad);
        this.setBina(bina);
        this.setSoyad(soyad);
    }

    private String ad;
    private String soyad;
    private Bina bina;


    public void displayInfo(){
        System.out.println("Ev sahibinin bilgileri");
        System.out.println("adı:"+ getAd() +" soyad:"+ getSoyad());
        System.out.println("Bina bilgisi:");
        getBina().displayInfo();
    }

    public void addApartment(Daire daire){
        System.out.println("daire eklendi");
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

    public Bina getBina() {
        return bina;
    }

    public void setBina(Bina bina) {
        this.bina = bina;
    }
}
