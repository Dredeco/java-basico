public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual? " + smartTv.volume);
        
        smartTv.ligarTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        
        smartTv.mudarCanal(56);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual? " + smartTv.canal);

    }
}
