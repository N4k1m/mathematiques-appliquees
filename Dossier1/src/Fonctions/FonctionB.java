package Fonctions;

import math.FonctionPeriodique;
import math.Nombre;

/**
 *
 * @author nakim
 */
public class FonctionB extends FonctionPeriodique
{
    public FonctionB()
    {
        super();
    }

    public FonctionB(double amplitude, double frequence, double phase) 
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
                return new Nombre((1.0 - Math.cos((Math.PI*param)/this.periode()))*this.amplitude, 0.0);
            }
        }
    }
}
