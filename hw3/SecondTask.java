import java.util.ArrayList;

public class SecondTask{
    public static void main(String[] args) {
        ArrayList<CapitalCities<Country,Capital> > list=new ArrayList<>();
        list.add(new CapitalCities(new Country("Austria"), new Capital("Vienna")));
        list.add(new CapitalCities(new Country("Kazakhstan"),new Capital("Hur-Sultan") ));
        list.add(new CapitalCities(new Country("Japan"),new Capital("Tokyo") ));
        list.add(new CapitalCities(new Country("Kyrgystan"),new Capital("Bishkek") ));
        Country country=new Country("Kazakhstan");
        for(CapitalCities c: list){
            if(c.getCountry()==country.getCountryName()){
                System.out.print(c.getCountry()+" "+ c.getCapital());
            }
        }
    }
}

class CapitalCities<K,V>{
    public K country;
    public V capital;
    public CapitalCities(K country, V capital){
        this.country=country;
        this.capital=capital;
    }
    public V getCapital(){
        return capital;
    }

    public K getCountry(){
        return country;
    }

    public void setCapital(V capital){
        this.capital=capital;
    }
}

class Country{
    public String country_name;
    public Country(String country_name){
        this.country_name=country_name;
    }
    public String getCountryName(){
        return country_name;
    }
}

class Capital{
    public String capital_name;
    public Capital(String capital_name){
        this.capital_name=capital_name;
    }
    public String getCapitalName(){
        return capital_name;
    }
}