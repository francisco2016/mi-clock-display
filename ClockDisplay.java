
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
       horas = new NumberDisplay(12);//el 24 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       minutos = new NumberDisplay(60);//el 60 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       
       
       almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue() ;
       
    }
    
    /**
     * Constructor con parámetros para fijar valores a los atributos.
     */
    public ClockDisplay(int valorH, int valorM)
    {
       horas = new NumberDisplay(12);//el 24 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       horas.setValue(valorH);//llamamos al mt. de NumberD y le pasmos el valor del parám. de este Const.
       minutos = new NumberDisplay(60);//el 60 es pq. el const. de NunberD tiene un parametro limite en el Cons.
       minutos.setValue(valorM);//llamamos al mt. de NumberD y le pasmos el valor del parám. de este Const.
       almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();

     
    }
    
    /**
     * Mt. para fijar la hora y los minutos actuales
     */
    public void setTime(int horaA, int minutoAc){
         minutos.setValue(minutoAc);
        if( (horas.getValue() <= 12) && (horas.getValue() <= 0)){
            horas.setValue(horaA);
        }
    }
    
    /**
     * Mt. para devolver al hora como cadena de 5 carateres.
     */
    public String getTime(){
        if(horas.getValue() == 12){
            horas.setValue(1);
        }
        String almacenaH = "";
         almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue()+ " a.m";
        return almacenaH;
    }
    
    /**
     * Mt. para hacer avanzar un minuto la hora actual.
     */
    public void timeTick()
     {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
        }
        if(horas.getValue() == 12){
            horas.setValue(1);
        }
        almacenaH = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
     }
}




















