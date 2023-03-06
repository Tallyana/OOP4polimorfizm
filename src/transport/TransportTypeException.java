package transport;
import transport.*;
import transport.TransportTypeException;

public class TransportTypeException extends  RuntimeException {

    public TransportTypeException(){
    }
    public TransportTypeException(String massage){
        super(massage);
    }
}
