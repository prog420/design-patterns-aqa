package patterns.structural.flyweight.v1;

import java.util.HashMap;
import java.util.Map;

/** Flyweight factory. Returns shared flyweight based on key */
public class ErrorMessageFactory {
    /** This serves as a key for getting flyweight instance */
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
    private final Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(
            ErrorType.GenericSystemError,
            new SystemErrorMessage("Generic Error Message: $errorCode ", "https://someurl.com")
        );
        errorMessages.put(
                ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page Not Found Message: $errorCode ", "https://someurl.com")
        );
    }

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();
    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }
}
