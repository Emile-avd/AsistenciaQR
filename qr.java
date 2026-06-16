public class qr {
    
    private String codigoQr;

    public qr(String codigoQr){
        this.codigoQr = codigoQr;
    }

    public String getQr() {
        return codigoQr;
    }

    public boolean validarQR(String codigoIngresado) {
        return codigoQr.equals(codigoIngresado);
    }

}
