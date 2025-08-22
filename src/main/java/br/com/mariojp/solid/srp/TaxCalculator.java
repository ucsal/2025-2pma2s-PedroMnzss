package br.com.mariojp.solid.srp;
import java.util.Properties;

public class TaxCalculator {
    String tax = System.getProperty("tax.rate");

     public double CalculateTax(double n){

        return n * Double.parseDouble(tax);
     }

}
