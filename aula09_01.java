public class aula09_01 {
    public static void main (String args[]){
        Lampada lampadal = new Lampada ("Incandescente");
        lampadal.setPotencia(40);
        System.out.println(lampadal);
        Interruptor il = new Interruptor();
        il.conectar (lampadal);
        System.out.println(il);
        il.ligar();
        System.out.println(lampadal);
        il.desligar();
        System.out.println(lampadal);
    }
    
}
