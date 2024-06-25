package patterns.structural.flyweight.v1;

/**
 * A concrete Flyweight. Instance is shared.
 */
public class SystemErrorMessage implements ErrorMessage {
    /** Part of intrinsic state */
    // Some error message $errorCode
    private String messageTemplate;
    // https://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    /**
     * @param code extrinsic state
     */
    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}
