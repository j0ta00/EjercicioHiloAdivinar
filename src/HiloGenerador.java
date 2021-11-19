public class HiloGenerador implements Runnable{
    private int numeroGenerado;


    public int getNumeroGenerado() {
        return numeroGenerado;
    }

    public void setNumeroGenerado(int numeroGenerado) {
        this.numeroGenerado = numeroGenerado;
    }


    @Override
    public void run() {
        numeroGenerado=(int)(Math.random()*100);
        System.out.println("El número generado es: "+numeroGenerado);
    }
}
