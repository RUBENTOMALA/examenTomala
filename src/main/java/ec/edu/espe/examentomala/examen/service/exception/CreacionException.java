package ec.edu.espe.examentomala.examen.service.exception;

public class CreacionException extends RuntimeException {

    public CreacionException(String message){
        super(message);
    }

    public CreacionException(String message, Exception cause){
        super(message, cause);
    }

}
