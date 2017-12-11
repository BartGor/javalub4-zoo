package pl.sdacademy.animals.bear;

public class PolarBear extends Bear {
    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public boolean isHibernating() {
        return false;
    }
}
