package TeleControl;

public class Aula11_ex04 {
    public static void main(String[] args) {

    ControleRemoto cr = new ControleRemoto(); // Canal 3 Volume 0
                cr.addCanal(); // canal 5
                cr.exibecanal();
                cr.addCanal(); //canal 6
                cr.exibecanal();
                cr.addCanal(); // canal 9
                cr.exibecanal();

                cr.addVolume(); // volume 1
                cr.exibevolume();
                cr.subVolume(); // volume 0
                cr.exibevolume();
                cr.subVolume(); //volume 0
                cr.exibevolume();

                cr.setCanal(499); //Canal 500 
                cr.exibecanal();
                cr.addCanal(); //Canal 3
                cr.exibecanal();
                cr.addCanal(); //Canal 5
                cr.exibecanal();
            
            }

  

}
