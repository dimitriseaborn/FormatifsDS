package formatif7;

public class Cercle {
    private double rayon;
    public static final double PI = Math.PI;
    public static final double DEFAULT_RAYON = 0;

    public Cercle() {
        this(0);
    }

    public Cercle(double rayon) {
        setRayon(rayon);
    }

    public static boolean estRayonValide(double rayon) {
        return rayon <= DEFAULT_RAYON;
    }

    public double getAire() {
        return PI * Math.pow(rayon, 2);
    }

    public double getCirconference() {
        return 2 * PI * rayon;
    }

    public double getDiametre() {
        return 2 * rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        if (estRayonValide(rayon)) {
            this.rayon = rayon;
        } else {
            throw  new IllegalArgumentException("Impossible de set le rayon à une valeur négative de " + rayon);
        }
    }

    public Cercle getCercle() {
        return new Cercle(rayon);
    }

    public void setCercle(Cercle cercle) {
        setRayon(cercle.getRayon());
    }

    @Override
    public String toString() {
        return "Cercle de rayon : " + getRayon() +
                "\nSa circonférence est de : " + getCirconference() +
                "\nSon aire est de : " + getAire() +
                "\nSon diamètre est de : " + getDiametre();
    }
}
