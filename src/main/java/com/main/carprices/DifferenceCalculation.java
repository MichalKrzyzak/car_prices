package com.main.carprices;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DifferenceCalculation {

    public String calculatePercentageDiff(BigDecimal axaDirectPrice, BigDecimal otherCompanyPrice) {
        return toPercentage(axaDirectPrice.divide(otherCompanyPrice, RoundingMode.HALF_UP).setScale(2, RoundingMode.HALF_UP));
    }

    private String toPercentage(BigDecimal price) {
        return price.multiply(new BigDecimal("100")).toString() + "%";
    }
}
