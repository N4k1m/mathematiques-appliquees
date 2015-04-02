package Fourier;

/**
 *
 * @author nakim
 */
public class DentsScieSerieFourier implements SerieFourier
{
    @Override
    public double getCoefficientA0()
    {
        return 0;
    }

    @Override
    public double getCoefficientAn(int n)
    {
        return 0;
    }

    @Override
    public double getCoefficientBn(int n)
    {
        // Pair
        if ((n & 1) == 0)
            return -2.0/(n*Math.PI);
        // Impair
        return 2.0/(n*Math.PI);
    }
}
