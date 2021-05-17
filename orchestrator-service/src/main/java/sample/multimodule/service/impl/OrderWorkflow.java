package sample.multimodule.service.impl;

/**
 *
 * @author brijeshdhaker
 */

import sample.multimodule.service.Workflow;
import sample.multimodule.service.WorkflowStep;

import java.util.List;

public class OrderWorkflow implements Workflow {

    private final List<WorkflowStep> steps;

    public OrderWorkflow(List<WorkflowStep> steps) {
        this.steps = steps;
    }

    @Override
    public List<WorkflowStep> getSteps() {
        return this.steps;
    }

}