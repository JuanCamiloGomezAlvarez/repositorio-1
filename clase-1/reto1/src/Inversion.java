public class Inversion{
    //Atributos
    public int tiempo = 0;
    public double capital = 0;
    public double interes = 0;
    //Constructor
    public Inversion(){
        
    }     
    public Inversion(int tiempo, double capital, double interes) {
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;
    }
   
    //metodos
    public double analizarInversion(){
        return Math.round(calcularInteresCompuesto() - calcularInteresSimple());
    }    
    public double analizarInversion(int tiempo, double capital, double interes){
        //return Math.round(calcularInteresCompuesto() - calcularInteresSimple());
        return (Math.round((capital)*(Math.pow((1+(interes/100)),tiempo)-1))) - (Math.round((capital)*(interes/100)*(tiempo)));
    }
    public double calcularInteresSimple(){
        return Math.round((capital)*(interes/100)*(tiempo));
    }
    public double calcularInteresCompuesto(){
        return Math.round((capital)*(Math.pow((1+(interes/100)),tiempo)-1));
    // gets and sets    
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public double getCapital() {
        return capital;
    }
    public void setCapital(double capital) {
        this.capital = capital;
    }
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
}