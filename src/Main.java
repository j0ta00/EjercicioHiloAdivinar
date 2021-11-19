public class Main{
    public static void main(String[] args) {
        NumeroOculto numeroOculto=new NumeroOculto();
        System.out.println(numeroOculto.getNumeroGenerado());
        Thread h1=new Thread(new HiloAdivinador("hilo1",numeroOculto));
        Thread h2=new Thread(new HiloAdivinador("hilo2",numeroOculto));
        Thread h3=new Thread(new HiloAdivinador("hilo3",numeroOculto));
        h1.start();
        h2.start();
        h3.start();
    }
}
