
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

    
}




















