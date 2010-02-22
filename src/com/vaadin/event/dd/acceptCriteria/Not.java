/**
 * 
 */
package com.vaadin.event.dd.acceptCriteria;

import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.terminal.gwt.client.ui.dd.VNot;

/**
 * TODO Javadoc
 * 
 * @since 6.3
 * 
 */
@ClientCriterion(VNot.class)
public class Not extends ClientSideCriterion {

    private AcceptCriterion acceptCriterion;

    public Not(ClientSideCriterion acceptCriterion) {
        this.acceptCriterion = acceptCriterion;
    }

    @Override
    public void paintContent(PaintTarget target) throws PaintException {
        super.paintContent(target);
        acceptCriterion.paint(target);
    }

    public boolean accepts(DragAndDropEvent dragEvent) {
        return !acceptCriterion.accepts(dragEvent);
    }

}