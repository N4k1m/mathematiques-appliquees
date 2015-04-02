package Fonctions;

import Fourier.SerieFourier;
import math.FonctionPeriodique;
import math.Nombre;

/**
 *
 * @author nakim
 */
public class FonctionSerieFourier extends FonctionPeriodique
{
    public FonctionSerieFourier(SerieFourier sf, int n)
    {
        super();
        this.sf = sf;
        this.n = n;
    }

    public FonctionSerieFourier(double amplitude, double frequence, double phase, SerieFourier sf, int n)
    {
        super(amplitude, frequence, phase);
        this.sf = sf;
        this.n = n;
    }

    @Override
    public Nombre getValeur(double param)
    {
        if (phase != 0)
        {
            return new FonctionSerieFourier(amplitude, frequence, 0, sf, n)
                    .getValeur(param - phase/(2*Math.PI*frequence));
        }
        else
        {
            if (param < periode() * (-1) / 2)
            {
                return getValeur(param + periode());
            }
            else if (param >= periode() / 2)
            {
                return getValeur(param - periode());
            }
            else
            {
                // a_0
                double value = this.sf.getCoefficientA0();

                // sum(a_n*cos(2*pi*n*f_0*t) + b_n*sin(2*pi*n*f_0*t)
                for(int i = 1; i <= n; i++)
                    value += (this.sf.getCoefficientAn(i) * Math.cos(2*Math.PI*n*frequence*param))
                           + (this.sf.getCoefficientBn(i) * Math.sin(2*Math.PI*n*frequence*param));

                return new Nombre(value, 0.0);
            }
        }
    }

    private final SerieFourier sf;
    private final int n;
}
