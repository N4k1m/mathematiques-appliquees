package Fonctions;

import math.FonctionPeriodique;
import math.Nombre;

/**
 *
 * @author nakim
 */
public class FonctionA extends FonctionPeriodique
{
    public FonctionA()
    {
        super();
    }

    public FonctionA(double amplitude, double frequence, double phase)
    {
        super(amplitude, frequence, phase);
    }
    
    @Override
    public Nombre getValeur(double param)
    {
        // phase?
        if (phase != 0)
        {
            return new FonctionA(amplitude, frequence, 0).getValeur(param - phase/(2*Math.PI*frequence));
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
                return new Nombre((param <= 0) ? 0 : (2*param)*this.amplitude/this.periode(), 0.0);
            }
        }
    }
}
