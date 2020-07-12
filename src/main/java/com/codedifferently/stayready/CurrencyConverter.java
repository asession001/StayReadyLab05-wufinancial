package com.codedifferently.stayready;

public class CurrencyConverter {

    public double dollarToEuro(double dollars){
        //mult to change into euro
        //divide when going from euro to dollar
        //echange rate
        double exchangeRate = 0.94;
        dollars = 50.50;
        double euros = 0.0;

        euros = dollars*exchangeRate;

        return euros;
    }
    
    public double euroToDollar(double euro){
        double exchangeRate = 0.94;
        euro = 50.50;
        double dollars = 0.0;

        dollars = euro/exchangeRate;

        return dollars;
    }

    public double euroToBritishPound(double euro){
        //1 dollar > .94 euro > .82 pound
        double exchangeRate = 0.82;
        euro = 50.50;
        double pounds = 0.0;
        //convert to euros, then pounds
        double dollars = euroToDollar(euro);
        pounds = dollars*exchangeRate;

        return pounds;
    }

    public double britishPoundToRupee(double pounds){
         double exchangeRatePound = 0.82;
         double exchangeRateRuppe = 68.32;
         pounds = 50.50;
         double ruppes = 0.0;
        //convet to dollars then ruppes
         double dollars = pounds/exchangeRatePound;
        ruppes = dollars*exchangeRateRuppe;

        return ruppes;
    }

    public double rupeeToCanDollar(double rupee){
        double exchangeRateCanDollar = 1.32;
        double exchangeRateRuppe = 68.32;
        rupee = 50.50;
        double canDollar = 0.0;
        //convert to dollars then canDollars
        double dollars = rupee/exchangeRateRuppe;
        canDollar = dollars*exchangeRateCanDollar;

        return canDollar ;
    }

    public double canDollarToSingaDollar(double canDollar){
        double exchangeRateCanDollar = 1.32;
        double exchangeRateSingaDollar = 1.43;
        canDollar = 50.50;
        double singaDollar = 0.0;
        //convert to dollars then singaDollars
        double dollars = canDollar/exchangeRateCanDollar;
        singaDollar = dollars*exchangeRateSingaDollar;

        return singaDollar;
    }

    public double singaDollarToFranc(double singaDollar){
        double exchangeRatesingDollar = 1.43;
        double exchangeRateFranc = 1.01;
        singaDollar = 50.50;
        double franc = 0.0;
        //convert to dollars then franc
        double dollars = singaDollar/exchangeRatesingDollar;
        franc = dollars*exchangeRateFranc;

        return franc;
    }

    public double francToRinggit(double franc){
        double exchangeRateFranc = 1.01;
        double exchangeRateRinggit = 4.47;
        franc = 50.50;
        double ringgit = 0.0;
        //convert to dollars then ringgit
        double dollars = franc/exchangeRateFranc;
        ringgit = dollars*exchangeRateRinggit;

        return ringgit;
    }

    public double ringgitToYen(double ringgit){
        double exchangeRateRinggit = 4.47;
        double exchangeRateYen = 115.84;
        ringgit = 50.50;
        double yen = 0.0;
        //convert to dollars then yen
        double dollars = ringgit/exchangeRateRinggit;
        yen = dollars*exchangeRateYen;

        return yen;
    }

    public double yenToYuan(double yen){
        double exchangeRateYen = 115.84;
        double exchangeRateYuan = 6.92;
        yen = 50.50;
        double yuan = 0.0;
        //convert to dollars then canDollars
        double dollars = yen/exchangeRateYen;
        yuan = dollars*exchangeRateYuan;

        return yuan;
    }
}