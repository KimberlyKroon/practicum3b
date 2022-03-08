public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        if(rad < 1){
            throw new IllegalArgumentException();
        }
        radius = rad;
        xPositie = x;
        yPositie = y;
    }
    public String toString(){
        return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}
