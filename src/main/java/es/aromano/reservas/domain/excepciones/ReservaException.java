package es.aromano.reservas.domain.excepciones;


public class ReservaException extends Exception {

    public ReservaException(String message) {
        super(message);
    }

    public ReservaException(String message, Throwable cause) {
        super(message, cause);
    }

}
