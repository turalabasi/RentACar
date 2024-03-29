package exception;

import enums.ExceptionEnum;

public class EmptyListException extends RuntimeException {
    public EmptyListException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.message = exceptionEnum.getMessage();
    }
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    String message;


}
