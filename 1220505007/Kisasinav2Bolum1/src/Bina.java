public class Bina extends Konut{

    Bina(String address,int numberOfFloors){
        super(address);
        this.numberOfFloors=numberOfFloors;
    }

    private int numberOfFloors;


    @Override
    public void displayInfo(){
        System.out.println("bina adı:"+getAddress()+" kat numarası:"+numberOfFloors);
    }


    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }



}
