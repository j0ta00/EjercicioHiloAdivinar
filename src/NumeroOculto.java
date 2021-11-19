public class NumeroOculto {
    private int numeroGenerado=(int)(Math.random()*100);
    private boolean acertado=false;

    public int getNumeroGenerado() {
        return numeroGenerado;
    }

    public synchronized int propuestaDeNumero(int numero){
       int resultado=-1;
      if(!acertado){
          if(numero==numeroGenerado){
              resultado=1;
              acertado=true;
          }else{
              resultado=0;
          }
      }
       return resultado;
    }
}
