package MeuHorario;
import java.util.*;
public class Horario implements MeuHorario {
    
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
    
    private int hora, minuto, segundo;
    
    public Horario(){
        setHora(calendar.get(Calendar.HOUR_OF_DAY));
        setMinuto(calendar.get(Calendar.MINUTE));
        setSegundo(calendar.get(Calendar.SECOND));
    }

    @Override
    public void setHora(int hora) {
        // TODO Auto-generated method stub
        this.hora = hora;
    }
    @Override
    public int getHora() {
        // TODO Auto-generated method stub
        return hora;
    }

    @Override
    public void setMinuto(int minuto) {
    // TODO Auto-generated method stub
        this.minuto = minuto;
    }
    @Override
    public int getMinuto() {
        // TODO Auto-generated method stub
        return minuto;
    }

    @Override
    public void setSegundo(int segundo) {
        // TODO Auto-generated method stub
        this.segundo = segundo;
    }
    @Override
    public int getSegundo() {
        // TODO Auto-generated method stub
        return segundo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getHora()+":"+getMinuto()+":"+getSegundo();
    }
}