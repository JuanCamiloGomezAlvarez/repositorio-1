public class Main {
    public static void main(String[] args) {
        Inversion analisis = new Inversion();
        System.out.println(analisis.calcularInteresSimple());
        System.out.println(analisis.calcularInteresCompuesto());
        System.out.println(analisis.analizarInversion(48,100000,9));
        System.out.println("----");
        Inversion analisis2 = new Inversion();
        System.out.println(analisis2.calcularInteresSimple());
        System.out.println(analisis2.calcularInteresCompuesto());
        System.out.println(analisis2.analizarInversion());
        System.out.println("----");        	
        Inversion analisis3 = new Inversion(36, 120000.0, 12);
        System.out.println(analisis3.calcularInteresSimple());
        System.out.println(analisis3.calcularInteresCompuesto());
        System.out.println(analisis3.analizarInversion());
    }
}
