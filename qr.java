public class qr {
    
    private String codigoQr;

    public qr(String codigoQr){
        this.codigoQr = codigoQr;
    }

    public String getCodigoQr() {
        return codigoQr;
    }

    public boolean validarQr(String codigoIngresado) {
        return codigoQr.equals(codigoIngresado);
    }

}
