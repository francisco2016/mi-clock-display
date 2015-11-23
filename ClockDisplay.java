
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author Francisco 
 * @version (Kingston,  Kingston,   Kingston,   Kingston)
 */
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (francisco.) 
 * @version (prueba de MiClockDisplay HP PAVILION HP PAVILION HP PAVILION)
 */
public class ClockDisplay
{
    //At. para crear horas.
    public NumberDisplay horas;
    //At. para crear minutos.
    public NumberDisplay minutos;
    //At. para almacenar la hora.
    public String almacenaH;
    //At. para elegir modelo horario. AM, PM O 24H.
    public boolean eligeFormato;
    //At. para crear el año
    public NumberDisplay anno;
    //At. para crear el mes.
    public NumberDisplay mes;
    //At. para crear el dia.
    public NumberDisplay dia;

    /**
     * Cons. sin parámetros. eligeFormato permite elegir entre el modelo 24H o AM, PM.
     */
    public ClockDisplay(boolean formatoAm){
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        //almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
        eligeFormato = formatoAm;
        anno = new NumberDisplay(100);
        anno.setValue(15);
        mes = new NumberDisplay(12);
        mes.setValue(11);
        dia = new NumberDisplay(30);
        dia.setValue(23);
        devuelveH();
    }

    /**
     * Cons. con parámetros para poder fijar la hora y los minutos.
     */
    public ClockDisplay(int valorH, int valorM, boolean formatoAm, int valorA, int valorMes, int valorD){
        horas = new NumberDisplay(24);
        horas.setValue(valorH);
        minutos = new NumberDisplay(60);
        minutos.setValue(valorM);
        //almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
        devuelveH();
        eligeFormato = formatoAm ;
        anno = new NumberDisplay(100);
            anno.setValue(valorA) ;
        mes = new NumberDisplay(12);
            mes.setValue(valorM);
       dia = new NumberDisplay(30);
            dia.setValue(valorD);
        devuelveH();
    }

    /**
     * Mt. para fijar horas y minutos al objeto ClockDisplay.
     */
    public void setTime(int valorH, int valorM, int valorAño, int valorMes, int valorDia){
        horas.setValue(valorH);
        minutos.setValue(valorM);
        anno.setValue(valorAño);
        mes.setValue(valorMes);
        dia.setValue(valorDia);
        devuelveH();
    }

    //     /**
    //      * Mt. para devolver la hora como cadena de 5  caracteres en formato de 24 h.
    //      */
    //     public String devuelveH(){
    //         almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
    //         return almacenaH;
    //     }

    //     /**
    //      * Mt. para devolver la hora en formato AM PM.
    //      */
    //     public String devuelveH(){
    //         if(horas.getValue() == 0){
    //             almacenaH = 12 + ":" +minutos.getDisplayValue()+ " a.m";
    //         }
    //         else if( (horas.getValue() > 12) ){
    //             almacenaH = horas.getValue() - 12 + ":" +minutos.getDisplayValue()+ " p.m";
    //         }
    //         else if(horas.getValue() < 12){
    //              almacenaH = horas.getDisplayValue()  + ":" +minutos.getDisplayValue()+ " a.m";
    //         }
    //         else{
    //             almacenaH = horas.getDisplayValue()  + ":" +minutos.getDisplayValue()+ " p.m";
    //         }
    //         return almacenaH;
    //     }

    /**
     * Mt. Otra posivilidad más simple para devolver la hora en formato AM PM.
     */
    public String devuelveH(){
        String AmPm = "";   
        if(eligeFormato) {

            int ahoraSon = horas.getValue(); 
            if( ahoraSon >= 12){
                AmPm = " p.m";
            }
            else {
                AmPm = " a.m";
            }
            if(ahoraSon > 12){
                ahoraSon = horas.getValue() -12;
            }
            else if(ahoraSon == 0) {
                ahoraSon = 12;
            }
            almacenaH = ahoraSon+ ":" +minutos.getDisplayValue() +  " " + AmPm + " Año " +anno.getDisplayValue()+ " mes " +mes.getDisplayValue()+ " dia " +dia.getDisplayValue();

        }
        else{
            almacenaH = horas.getDisplayValue()  + ":" +minutos.getDisplayValue()+ " " + AmPm + " Año " +anno.getDisplayValue()+ " mes " +mes.getDisplayValue()+ " dia " +dia.getDisplayValue();
        }
        return almacenaH;
       
    }

    /**
     * Mt. para hacer avanzar un minuto la hora.
     */
    public void timeTick(){
        minutos.increment();
        if(minutos.getValue() == 0){
            horas.increment();
            if( (horas.getValue() == 0) ){
            dia.increment(); 
            if( (dia.getValue() == 0)){
            mes.increment();
             if ( (mes.getValue() == 1)){
            anno.increment();
        }
            
        }
            
        }
        }
        
         
         
        //almacenaH = horas.getDisplayValue()+ ":" +minutos.getDisplayValue();
        devuelveH();
    }   

}



















