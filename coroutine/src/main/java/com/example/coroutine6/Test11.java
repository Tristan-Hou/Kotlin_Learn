package com.example.coroutine6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class Test11 {

    public static void main(String[] args) {
        DecimalFormat dfScale2 = new DecimalFormat("###.##");
        dfScale2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("dfScale2.getRoundingMode()=" + dfScale2.getRoundingMode());

        System.out.println("dfScale2.format(new BigDecimal(\"1.1251\"))=" + dfScale2.format(new BigDecimal("1.1251")));
        System.out.println("dfScale2.format(new BigDecimal(\"1.1251\"))=" + dfScale2.format(2929.226f));
        System.out.println("dfScale2.format(new BigDecimal(\"1.1251\"))=" + dfScale2.format(2929.211f));
        System.out.println("dfScale2.format(new BigDecimal(\"1.1351\"))=" + dfScale2.format(new BigDecimal("1.1351")));

    }
}
