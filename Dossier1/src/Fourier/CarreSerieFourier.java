package Fourier;

/**
 *
 * @author nakim
 */
public class CarreSerieFourier implements SerieFourier
{
    @Override
    public double getCoefficientA0() 
    {
        return 0.0;
    }

    @Override
    public double getCoefficientAn(int n)
    {
        return 0.0;
    }

    @Override
    public double getCoefficientBn(int n)
    {
        // Pair
        if ((n & 1) == 0)
            return 0.0;
        // Impair
        return 4/(Math.PI*n);
    }
}
