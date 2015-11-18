
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author Francisco 
 * @version (Kingston)
 */
public class ClockDisplay
{
    // At. para crear las horas.
    private NumberDisplay horas;
    // At. para crear minutos.
    private NumberDisplay minutos;
    // At. para almacenar hora en forma de cadena.
    private String almacenaH;

    /**
     * Constructor sin parámetros para fijar valores a los atributos.
     */
    public ClockDisplay()
    {
       horas = new NumberDisplay(24);//el 24 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       minutos = new NumberDisplay(60);//el 60 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
    }
    
    /**
     * Constructor con parámetros para fijar valores a los atributos.
     */
    public ClockDisplay(int valorH, int valorM)
    {
       horas = new NumberDisplay(24);//el 24 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       horas.setValue(valorH);//llamamos al mt. de NumberD y le pasmos el valor del parám. de este Const.
       minutos = new NumberDisplay(60);//el 60 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       minutos.setValue(valorM);//llamamos al mt. de NumberD y le pasmos el valor del parám. de este Const.
       almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
    }
    
    /**
     * Mt. para fijar la hora y los minutos actuales
     */
    public void setTime(int horaA, int minutoAc){
        horas.setValue(horaA);
        minutos.setValue(minutoAc);
    }
    
    /**
     * Mt. para devolver al hora como cadena de 5 carateres.
     */
    public String getTime(){
        String almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
        return almacenaH;
    }
    
    /**
     * Mt. para hacer avanzar un minuto la hora actual.
     */
    public void timeTick(){
        minutos.increment();
        
        if(minutos.getValue() == 60){
            minutos.increment();
            horas.increment();
            almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
        }
        else{
        minutos.increment();
        almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
        
        }
       
    }
}




















