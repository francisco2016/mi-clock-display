
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // At. para crear un valor.
    private int valor;
    // At. para crear un límite.
    private int limite;

    /**
     * Constructor for dar valor  a los atributos.
     */
    public NumberDisplay(int valorLimite)
    {
        valor = 0;
        limite = valorLimite;
    }
    
    /**
     * Mt.para fijar el valor actual del display.
     */
    public void setValue(int valorV){
        if( (valorV >= 0) && (valorV < limite)){
            valor = valorV;
        }
   
    
    }


















}
