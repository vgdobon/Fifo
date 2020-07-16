import java.util.Random;

public class Fifo {
    int [] myArrayInt=new int[1];

    public Fifo(){
        for (int i = 0; i <myArrayInt.length; i++) {
            myArrayInt[i]=new Random().nextInt(100);
        }
    }

    public void push(int numeroNuevo){
        int [] myArrayAux= new int[myArrayInt.length+1];
        for (int i = 0; i < myArrayAux.length; i++) {
            if(i==myArrayAux.length-1){
                myArrayAux[i]=numeroNuevo;
            }else{
                myArrayAux[i]=myArrayInt[i];
            }
        }
        myArrayInt=new int[myArrayAux.length];
        //for (int i = 0; i < myArrayInt.length; i++) {
           // myArrayInt[i]=myArrayAux[i];
        //}
        myArrayInt=myArrayAux;
    }

    public int pop(){

        if(myArrayInt.length==0){
            return -1;
        }else{
            int [] myArrayAux= new int[myArrayInt.length-1];
            int numeroDevuelto= myArrayInt[0];

            for (int i = 1; i < myArrayInt.length; i++) {
                myArrayAux[i-1]=myArrayInt[i];
            }

            myArrayInt=new int[myArrayAux.length];

            for (int i = 0; i < myArrayInt.length; i++) {
                myArrayInt[i]=myArrayAux[i];
            }

            return numeroDevuelto;
        }

    }





}
