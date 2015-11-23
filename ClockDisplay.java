
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author Francisco 
 * @version (Kingston,  Kingston,   Kingston,   Kingston)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;
    // Permite elegir si estamos en formato 12 horas(true) o 24 horas(false)
    private boolean relojDe12Horas;
    //At. para crear año.
    private NumberDisplay anno;
    //At. para crear mes.
    private NumberDisplay mes;
    //At. para crear dia.
    private NumberDisplay dia;
    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00. y fecha en 23/11/2015
     */
    public ClockDisplay(boolean reloj12Horas,int horaY, int minutoY)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        // horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue(); 
        relojDe12Horas = reloj12Horas;
        updateHoraActual(); //invocamos este mt par poner el reloj en modo am.  pm
        anno = new NumberDisplay(100);
        anno.setValue(15);
        mes = new NumberDisplay(12);
        mes.setValue(11);
        dia = new NumberDisplay(30);
        dia.setValue(20);
    }

    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     */
    public ClockDisplay (int horasX, int minutosX,boolean reloj12Horas,int horaY, int minutoY,int annoA, int mesM, int diaD)
    {
        horas =   new NumberDisplay(24);
        minutos = new NumberDisplay(60);      
        horas.setValue(horasX); 
        minutos.setValue(minutosX);
        //horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue(); 
        relojDe12Horas = reloj12Horas;
        updateHoraActual(); //invocamos este mt par poner el reloj en modo am.  pm
        anno = new NumberDisplay(100);
        anno.setValue(annoA);
        mes = new NumberDisplay(12);
        mes.setValue(mesM);
        dia = new NumberDisplay(30);
        dia.setValue(diaD);
    }

    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int horaY, int minutoY,int añoA, int mesM, int diaD)
    {
        horas.setValue(horaY);  
        minutos.setValue(minutoY);
        //horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        updateHoraActual(); //invocamos este mt par poner el reloj en modo am.  pm
       
        
    }

    /**
     * Devuelve la hora del reloj como una cadena de 5 caracteres
     */
    public String getTime()
    {
        return horaActual;
    }

    /**
     * Hace avanzar la hora 1 minuto
     */
    public void timeTick()
    {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
        }
        //horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        updateHoraActual(); //invocamos este mt par poner el reloj en modo am.  pm
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     */
    public void updateHoraActual()
    {
        if(relojDe12Horas){   
            if (horas.getValue() == 0) 
            {
                horaActual = "12" + ":"+
                minutos.getDisplayValue() + " am. año " +año+ " mes " +mes+ " dia " +dia;    
                
            } 
            else if(horas.getValue() < 12)
            {
                horaActual = horas.getDisplayValue() + ":" +
                minutos.getDisplayValue() + " am. año " +año+ " mes " +mes+ " dia " +dia;
            }
            else if (horas.getValue() > 12)
            {
                horaActual = (horas.getValue() - 12) + ":" + 
                minutos.getDisplayValue() + " pm. año " +año+ " mes " +mes+ " dia " +dia;
            }

            else    // Si hora.getValue() == 12
            {
                horaActual = horas.getDisplayValue() + ":" + 
                minutos.getDisplayValue() + " pm. año " +año+ " mes " +mes+ " dia " +dia;
            }	
        }
        else{horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ " año " +año+ " mes " +mes+ " dia " +dia;}
    }

    // /**
    // * Actualiza el atributo horaActual siguiendo las normas de un
    // * reloj de 12 horas. HECHO POR MIGUEL.
    // */

    //       public void updateHoraActual()
    //     {
    // 	 		String formato = "";
    //             int horaAhora = horas.getValue(); 
    //             if (horaAhora >= 12){
    //                 formato = "p.m.";
    //             }
    //             else {
    //                 formato = "a.m.";
    //             }
    //             if (horaAhora > 12) {
    //                 horaAhora = horaAhora - 12;
    //             }
    // else if (horaAhora == 0) {
    //                  horaAhora = 12;
    //         }
    //             horaActual = horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
    //     }
    /**
     * Método que permite alternar entre los modos del reloj
     */
     public void changeFormat()
    {
    	if (relojDe12Horas) {
    		relojDe12Horas = false;
    	}
    	else {
    		relojDe12Horas = true;
    	}
    	updateHoraActual();	//necesitamos invocar este método para realizar el cambio.
    }	

}



















