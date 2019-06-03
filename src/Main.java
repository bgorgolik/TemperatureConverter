import java.math.BigDecimal;
import java.util.Scanner;

class Degrees {

    BigDecimal celcius = new BigDecimal("0");
    BigDecimal kelvin = new BigDecimal("0");
    BigDecimal fahrenheit = new BigDecimal("0");
    BigDecimal ck = new BigDecimal("275.15");
//nie da sie dziesietnych wpisac...
    void calcCelcKel() {
        System.out.println("Wpisz Celcjusze");
        Scanner scanner = new Scanner(System.in);
        celcius = scanner.nextBigDecimal();
        if (celcius.compareTo(BigDecimal.valueOf(-275.15)) < 0) {
            System.out.println("Taka temperatura nie istnieje");
        }
        kelvin = celcius.add(ck);
        System.out.println(celcius + " stopni C to jest " + kelvin + " stopni kelv");
    }

    void calcKelCelc() {
        System.out.println("Wpisz Kelviny");
        Scanner scanner = new Scanner(System.in);
        kelvin = scanner.nextBigDecimal();
        if (kelvin.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Taka temperatura nie istnieje");
        }
        celcius = kelvin.subtract(ck);
        System.out.println(kelvin + " stopni K to jest " + celcius + " stopni c");
    }

}

public class Main {

    public static void main(String[] args) {
        Degrees deg = new Degrees();

        deg.calcCelcKel();

        deg.calcKelCelc();

    }
}
