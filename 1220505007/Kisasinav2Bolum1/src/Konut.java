public abstract class Konut {


    Konut(String address){
        this.setAddress(address);
    }

    private String address;


    public abstract void displayInfo();


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
