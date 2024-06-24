package patterns.behavioral.mediator.v1.components;


import patterns.behavioral.mediator.v1.mediator.Mediator;

/**
 * Common component interface
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
