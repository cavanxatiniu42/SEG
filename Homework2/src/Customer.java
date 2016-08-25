
public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;

    public Customer (int id, String name, String phoneNumber, String address){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private boolean isValidId(int id){
        return (String.valueOf(id).length()<=8 && id >= 1 && id <=99999999);
    }
    private boolean isValidName (String name){
        return (!(name == null) &&name.length()<=50);
    }
    private boolean isValidPhoneNumber(String phoneNumber){
        return (!(phoneNumber== null) && phoneNumber.length() <= 10);
    }
    private boolean isValidAddress(String address){
        return (!(address==null) && address.length() <= 100);
    }
    public boolean repOK(){
        return isValidAddress(this.address) && isValidId(this.id)
                && isValidName(this.name) && isValidPhoneNumber(this.phoneNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
