package exception;

import enums.ExceptionEnum;

public class InvalidOptionExceptions extends RuntimeException{
    public InvalidOptionExceptions(ExceptionEnum exceptionEnum) {
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
