public class docente extends usuario{

    private int NumeroEmpleado;

    public docente(String nombre, String rol, int NumeroEmpleado){
        super(nombre, rol);
        this.NumeroEmpleado=NumeroEmpleado;
    }

    public int getNumeroEmpleado(){
        return NumeroEmpleado;
    }

}

/*  
//metodo con simple
    public void metodoSimple(){
        //Instrucciones
    }

    //metodo con parametros
    public void metodoConParametros(int numero){
        //Instrucciones
    } 

    //funcion simple
    protected int funcionSimple(){
        //Instrucciones
        return 0;
    }

    //funcion con parametros
    public String funcionConParametros(int numero){
        //Instrucciones
        return "";
    }
*/
