public class mains {
    public static void main(String[] args){
        docente doc1 = new docente("Cui", "Maistro", 1);
        doc1.getNumeroEmpleado();
        System.out.println(doc1.getNumeroEmpleado());
        doc1.getNombre();
        System.out.println(doc1.getNombre());
        doc1.getRol();
        System.out.println(doc1.getRol());

        alumno alumno1 = new alumno("Juanito", "chalan", "2530831", 899846);
        alumno1.getMatricula();
        System.out.println(alumno1.getMatricula());
        alumno1.getNombre();
        System.out.println(alumno1.getNombre());
        alumno1.getQR();
        System.out.println(alumno1.getQR());
        alumno1.getRol();
        System.out.println(alumno1.getRol());
    }
}
