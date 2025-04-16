import java.util.*;

public class Main {
    public static void main(String[] args){
        Address one = new Address("RU","MSK");
        Address two = new Address("USA","NYC");

        Map<Address,Integer> map = new HashMap<>();
        map.put(one,1_000);
        map.put(two,2_000);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter country: ");
            String address = scanner.nextLine();
            if(address.equals("end")){
                break;
            }
            System.out.print("Enter city: ");
            String city = scanner.nextLine();
            System.out.print("Enter wight: ");
            String wight = scanner.nextLine();
            int wightRes = Integer.parseInt(wight);
            Address tmpAddress = new Address(address,city);
            System.out.println(map.containsKey(tmpAddress));
            if(map.containsKey(tmpAddress)){
                int price = map.get(tmpAddress);
                System.out.println("Стоимость доставки составит: "+price*wightRes);
            }
        }

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