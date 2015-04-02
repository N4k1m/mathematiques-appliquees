package Fourier;

/**
 *
 * @author nakim
 */
public class FonctionBSerieFourier implements SerieFourier
{
    @Override
    public double getCoefficientA0()
    {
        return (1 - (2/Math.PI));
    }

    @Override
    public double getCoefficientAn(int n)
    {
        // Pair
        if ((n & 1) == 0)
            return -4/(Math.PI * (1 - (4*n*n)));
        // Impair
        return 4/(Math.PI * (1 - (4*n*n)));
    }

    @Override
    public double getCoefficientBn(int n)
    {
        return 0.0;
    }
}
