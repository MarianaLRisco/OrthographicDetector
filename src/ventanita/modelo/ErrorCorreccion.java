package ventanita.modelo;

public class ErrorCorreccion {
    private String oracion;
    private String msgError;

    public ErrorCorreccion(String oracion, String msgError) {
        this.oracion = oracion;
        this.msgError = msgError;
    }

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
    }

    public String getMsgError() {
        return msgError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }
}
