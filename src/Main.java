import observer.push.WeatherApp;
import strategy.DuckApp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        StarBuzz starBuzz = new StarBuzz();
//        starBuzz.usePattern();

        // strategy pattern
        DuckApp.activateGame();

        // Observer Pattern
        WeatherApp.start();


    }
}