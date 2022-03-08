public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println("Radius moet groter dan 0 zijn!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(c1);
        System.out.println(c2);
    }
}
