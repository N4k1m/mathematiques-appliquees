package Fourier;

import math.Nombre;
import operations.SignalOperations;
import signaux.Discretiseur;
import signaux.Signal;
import signaux.SignalAnalogique;
import signaux.SignalPeriodique;

/**
 *
 * @author Nakim
 */
public abstract class FourierSeriesBuilder
{
    public static Signal fourierSerie(SerieFourier sf, int n, double amplitude, double periode, Discretiseur discretiseur)
    {
        // a_0
        Signal fourierSerie = SignalAnalogique.getInstance(
            SignalAnalogique.CONSTANT,
            new Nombre(sf.getCoefficientA0(), 0),
            discretiseur);

         // sum(a_n*cos(2*pi*n*f_0*t) + b_n*sin(2*pi*n*f_0*t)
        for (int i = 1; i <= n; i++)
        {
            Signal cos = SignalPeriodique.getInstance(SignalPeriodique.COSINUS, sf.getCoefficientAn(i)*amplitude, (1/periode)*i, 0.0, discretiseur);
            Signal sin = SignalPeriodique.getInstance(SignalPeriodique.SINUS, sf.getCoefficientBn(i)* amplitude, (1/periode)*i, 0.0, discretiseur);

            fourierSerie = SignalOperations.somme(fourierSerie, SignalOperations.somme(cos, sin));
        }

        return fourierSerie;
    }
}
