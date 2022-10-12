package edu.najah.eng.solid.ocp.exercise.v2;


import edu.najah.eng.solid.ocp.exercise.Country;
import edu.najah.eng.solid.ocp.exercise.tax.EGYTax;
import edu.najah.eng.solid.ocp.exercise.tax.UKTax;
import edu.najah.eng.solid.ocp.exercise.tax.USATax;

public class TaxCalculator extends edu.najah.eng.solid.ocp.exercise.TaxCalculator {

    @Override
    public Double calculateTax(Double amount, Country country) {

        Double taxAmount = super.calculateTax(amount, country);
        if (taxAmount == 0){
            switch (country) {
                case EGY -> {
                    EGYTax egyTax = new EGYTax();
                    taxAmount += egyTax.calculateTax(amount);
                }
            }

        }

        return taxAmount;
    }


}
