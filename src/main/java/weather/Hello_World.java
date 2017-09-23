package weather;

import java.util.Scanner;

public class Hello_World {

    static WeatherParser parser1 = new WeatherParser();

    //method that prints the human-readable message about weather
    static private void printWeatherInCity(String inputCity){

        //call the WeatherParser's class getTemperature
        //and print it to standard output along with some human-readable notes
        String temper = parser1.getTemperature(inputCity);
        if(temper != "ЕГГОГ") {
            System.out.println("Temperature in " + inputCity + " is " + temper + "!");
        }
        else{
            System.out.println("Unable to parse page");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //write prompt in console
        System.out.println("Enter city name:");

        //get the typed walue in currentCity
        String currentCity = in.next();

        //call the method that prints the human-readable message about weather
        printWeatherInCity(currentCity);

    }

}
