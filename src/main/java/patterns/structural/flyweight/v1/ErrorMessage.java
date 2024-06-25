package patterns.structural.flyweight.v1;

/**
 * Interface which will be implemented by Flyweights
 */
public interface ErrorMessage {
    String getText(String code);
}
