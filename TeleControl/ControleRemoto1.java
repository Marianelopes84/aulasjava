package TeleControl;

public class ControleRemoto1 {
    public static void main(String[] args) {


    ControleRemoto cr = new ControleRemoto();

                cr.exibecanal();
                cr.exibevolume();

                for (int i = 0; i < 10; i++) {
                    cr.addCanal();
                    cr.addVolume();
                }

                cr.exibecanal();
                cr.exibevolume();

                cr.setCanal(6);
                cr.setVolume(7);

                for (int i = 0; i < 5; i++) {
                    cr.subCanal();
                    cr.subVolume();
                }

                
            }


}
