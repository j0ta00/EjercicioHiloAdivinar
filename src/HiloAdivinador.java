public class HiloAdivinador implements Runnable{
    private String name;
    private NumeroOculto numeroOculto;

    public HiloAdivinador(String name,NumeroOculto numeroOculto){
        this.name=name;
        this.numeroOculto=numeroOculto;
    }

    @Override
    public synchronized void run() {
        int i,j;
        do{
            i=(int)(Math.random()*100);
            System.out.println("Hilo "+name+" ha generado el número:"+i);
            j=numeroOculto.propuestaDeNumero(i);
             if(j==1){
                 System.out.println("He acertado"+name);
             }
        }while(j==0);
    }
}
