import java.io.OutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Country country1 = new Country("Kyrgyzstan", 7000000, 1900900, "kyrgyz");
        Country country2 = new Country("Russian", 1500000000, 4899098, "russia");
        Country country3 = new Country("American", 1600000000, 123123123, "america");


        Country[] countries = {country1,country2,country3};

        System.out.println(Country.outputCountry(countries));
    }


}