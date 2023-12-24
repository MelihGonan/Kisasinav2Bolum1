public class Daire extends Konut{

    Daire(String address,int apartmentNumber,int odaSayisi){
        super(address);
        this.apartmentNumber=apartmentNumber;
        this.odaSayisi=odaSayisi;
    }

    private int apartmentNumber;
    private int odaSayisi;

    @Override
    public void displayInfo(){
        System.out.println("Daire bilgileri");
        System.out.println("adres:"+ getAddress() +" oda sayısı:"+ getOdaSayisi() +" apartman numarası:"+apartmentNumber);
    }

    public int compareTo(Daire digerDaire){
        return Integer.compare(this.apartmentNumber,digerDaire.apartmentNumber);
    }


    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
}
