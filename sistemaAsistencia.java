import java.util.List;
import java.util.ArrayList;
public  class sistemaAsistencia {
    private List<alumno> alumnos;
    private List<asistencia> asistencias;

    public sistemaAsistencia(){
        alumnos = new ArrayList<>();
        asistencias = new ArrayList<>();
    }

    public void registrarAlumno(alumno alum){
        alumnos.add(alum);
    }

    public alumno buscarAlimno(String matricula){
        for (alumno a : alumnos) {
            if(a.getMatricula().equals(matricula)){
                return a;
            }
        }
        return null;
    }

    public void registrarAsistencia(String codigoQr){
        for (alumno a : alumnos) {
            if(a.getQR().validarQR(codigoQr)){
                asistencia asis = new asistencia(a, null);
                asistencias.add(asis);

                System.out.println("Asistencia Registrada:"+a.getNombre());
                return;
            }
        }

        System.out.println("El qr no es valido");
    }

    public List<asistencia> getAsistencias(){
        return asistencias;
    }
}
