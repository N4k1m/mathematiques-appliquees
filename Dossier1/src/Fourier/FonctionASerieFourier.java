package Fourier;

/**
 *
 * @author nakim
 */
public class FonctionASerieFourier implements SerieFourier
{
    @Override
    public double getCoefficientA0()
    {
        return 0.25;
    }

    @Override
    public double getCoefficientAn(int n)
    {
        // Pair
        if ((n & 1) == 0)
            return 0.0;
        // Impair
        return -2/(Math.PI*Math.PI*n*n);
    }

    @Override
    public double getCoefficientBn(int n)
    {
        // Pair
        if ((n & 1) == 0)
            return -1/(n*Math.PI);
        // Impair
        return 1/(n*Math.PI);
    }
    
}
