package tax;

public class DefaultTaxCalculator extends TaxCalculator {

    private boolean firstYear = false;
    private boolean firstYearExpensive = false;

    public DefaultTaxCalculator(boolean firstYear, boolean firstYearExpensive) {
        this.firstYear = firstYear;
        this.firstYearExpensive = firstYearExpensive;
    }

    public DefaultTaxCalculator() {

    }

    public int calculateTax(Vehicle vehicle) {
        if (firstYearExpensive) {
            if (getYear() - vehicle.getDateOfFirstRegistration().getYear() > 1
                    && vehicle.getListPrice() > 40000) {
                if (vehicle.getFuelType() == FuelType.ELECTRIC) {
                    return 310;
                }
                if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL) {
                    return 440;
                }
                return 450;
            }
        }
        if (vehicle.getFuelType() == FuelType.PETROL) {
            if (vehicle.getCo2Emissions() <= 0) {
                return 0;
            } else if (vehicle.getCo2Emissions() <= 50) {
                return 10;
            } else if (vehicle.getCo2Emissions() <= 75) {
                return 25;
            } else if (vehicle.getCo2Emissions() <= 90) {
                return 105;
            } else if (vehicle.getCo2Emissions() <= 100) {
                return 125;
            } else if (vehicle.getCo2Emissions() <= 110) {
                return 145;
            } else if (vehicle.getCo2Emissions() <= 130) {
                return 165;
            } else if (vehicle.getCo2Emissions() <= 150) {
                return 205;
            } else if (vehicle.getCo2Emissions() <= 170) {
                return 515;
            } else if (vehicle.getCo2Emissions() <= 190) {
                return 830;
            } else if (vehicle.getCo2Emissions() <= 225) {
                return 1240;
            } else if (vehicle.getCo2Emissions() <= 255) {
                return 1760;
            } else if (vehicle.getCo2Emissions() <= 256) {
                return 2070;
            }
        }
        if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL || vehicle.getFuelType() == FuelType.ELECTRIC) {
            int co2Emissions = vehicle.getCo2Emissions();
            if (co2Emissions <= 50) {
                return 0;
            } else if (co2Emissions <= 75) {
                return 15;
            } else if (co2Emissions <= 90) {
                return 95;
            } else if (co2Emissions <= 100) {
                return 115;
            } else if (co2Emissions <= 110) {
                return 135;
            } else if (co2Emissions <= 130) {
                return 155;
            } else if (co2Emissions <= 150) {
                return 195;
            } else if (co2Emissions <= 170) {
                return 505;
            } else if (co2Emissions <= 190) {
                return 820;
            } else if (co2Emissions <= 225) {
                return 1230;
            } else if (co2Emissions <= 255) {
                return 1750;
            } else {
                return 2060;
            }
        } else if (vehicle.getFuelType() == FuelType.DIESEL) {
            if (vehicle.getCo2Emissions() <= 0) {
                return 0;
            } else if (vehicle.getCo2Emissions() <= 50) {
                return 25;
            } else if (vehicle.getCo2Emissions() <= 75) {
                return 105;
            } else if (vehicle.getCo2Emissions() <= 90) {
                return 125;
            } else if (vehicle.getCo2Emissions() <= 100) {
                return 145;
            } else if (vehicle.getCo2Emissions() <= 110) {
                return 165;
            } else if (vehicle.getCo2Emissions() <= 130) {
                return 205;
            } else if (vehicle.getCo2Emissions() <= 150) {
                return 515;
            } else if (vehicle.getCo2Emissions() <= 170) {
                return 830;
            } else if (vehicle.getCo2Emissions() <= 190) {
                return 1240;
            } else if (vehicle.getCo2Emissions() <= 225) {
                return 1760;
            } else if (vehicle.getCo2Emissions() <= 255) {
                return 2070;
            } else if (vehicle.getCo2Emissions() <= 256) {
                return 2070;
            }
        }
        return -1;
    }
}
