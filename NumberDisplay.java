
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
    
    /**
     * Mt. que devuelve el valor actual del display como entero.
     */
    public int getValue(){
      return valor;  
    }
    
    /**
     * Mt. que devuelve el valor del display en forma de cadena de 2 caracteres.
     */
    public String getDisplayValue(){
        String devuelveV = "";
        devuelveV = valor+ "";
        if(valor < 10){
            devuelveV = "0" +valor;
        }
        return devuelveV; 
    }
    
    /**
     * Mt. para incrementar un minuto el valor del display, llegando al límite, pasa a valor 0.
     */
    public void increment(){
        valor = (valor + 1) % limite;
    }


















}
