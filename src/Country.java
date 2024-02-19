public class Country {
    String name;
    long population;
    long  ground;
    String language;

    public Country(String name, long population, long ground, String language) {
        this.name = name;
        this.population = population;
        this.ground = ground;
        this.language  = language;
    }
    public static int outputCountry(Country[] countries){
         int max = Integer.MIN_VALUE;
        for(Country country : countries){
            if(country.ground > max){
                max = (int) country.ground;



            }

        }
return max;

    }


}
