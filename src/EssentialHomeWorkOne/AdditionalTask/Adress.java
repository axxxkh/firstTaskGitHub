package EssentialHomeWorkOne.AdditionalTask;

public class Adress {
    public String index;
    public String country;
    public String city;
    public String street;
    public String house;

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    public String apartment;

    public void show() {
        System.out.printf("Current adress is:\n %s, %s, %s, %s, %s, %s",
                getIndex(), getCountry(), getCity(), getStreet(), getHouse(), getApartment());
    }

    public static void main(String[] args) {
        Adress currentAdress = new Adress();
        currentAdress.setIndex("02134");
        currentAdress.setCountry("Ukraine");
        currentAdress.setCity("Vinnytsya");
        currentAdress.setStreet("Aviatoriv str");
        currentAdress.setHouse("111C");
        currentAdress.setApartment("11-1");
        currentAdress.show();
    }
}
