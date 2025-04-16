public class Main {
    public static void main(String[] args){

    }
}


class Address{
    protected String country;
    protected String city;

    public Address(String country, String city){
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "[" + country + "," + city + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        Address address = (Address) obj;
        return this.country.equals(address.country) && this.city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}