public class CustomException extends Exception{
    private final int errorCode;
    private final String details;

    public CustomException(String message, int errorCode, String details) {
        super(message);
        this.errorCode = errorCode;
        this.details = details != null ? details:"Brak dodatkowych informacji!";
    }
    
    public CustomException(String message){
        super(message);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return String.format("Błąd [%d]: %s. Szczegóły: %s",errorCode,super.getMessage(),details);
    }
}
