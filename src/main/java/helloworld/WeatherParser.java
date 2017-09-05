package helloworld;

import org.jsoup.Jsoup;

import java.io.IOException;

public class WeatherParser implements WeatherParserInterface {

    //method to return current air temperature in specified city
    @Override
    public int getTemperature(String city) {

        /*
        URL yandexURL;

        //Reads text from a character-input stream, buffering characters
        //so as to provide for the efficient reading of characters, arrays, and lines.
        BufferedReader br;

        InputStream is;

        BufferedInputStream bis1;

        try {
            yandexURL = new URL("https://yandex.ru/");
        }
        catch (MalformedURLException e){
            System.out.println(e.toString());
            return 0;
        }

        yandexURL = new URL("https://yandex.ru/");

        */

        //page address for specified city
        final String myURL = "https://yandex.ru/pogoda/" + city;

        //to store the whole html listing of the page
        String html = null;

        //temporary storage
        String temporaryString = null;

        //indexes to search weather parameters in html listing
        int startIndex = 0;
        int endIndex = 0;

        //a sequence to search current temperature value
        final String temperatureSearchString = "thermometer_type_now\">";

        //connects to specified URL and returns html listing as a String
        //well it wouldn't work without try catch
        try {
            html = Jsoup.connect(myURL).get().html();
        } catch (IOException e) {
           e.printStackTrace(System.out);
        }

        //if there is the piece of code that precedes the temperature, then parse it...
        if(html.contains(temperatureSearchString)){

            //locate the search string in html code,
            //add the search string's length to the index found
            //...and next 8 characters are uninformative, so skip them too
            startIndex = html.lastIndexOf(temperatureSearchString) + temperatureSearchString.length() + 8;

            //extract the value of temperature, with leading '+' or '-' sign
            temporaryString = html.substring(startIndex, startIndex + 3);

            //convert temperature from string to int (together with sign) and return it
            return Integer.parseInt(temporaryString);
        }
        else{
            //if there is no such a code :(
            return 999;
        }

}

}
