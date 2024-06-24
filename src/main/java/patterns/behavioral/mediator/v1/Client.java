package patterns.behavioral.mediator.v1;

import patterns.behavioral.mediator.v1.components.*;
import patterns.behavioral.mediator.v1.mediator.Editor;
import patterns.behavioral.mediator.v1.mediator.Mediator;

import javax.swing.*;

/**
 * Demo class.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
