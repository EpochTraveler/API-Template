package de.jxson.template.caller;

import de.jxson.template.APITemplate;
import de.jxson.template.APITemplateLocal;

public class ExampleCaller implements APITemplateLocal {

    /**
     * There is no really need for accessing the api Template class with a variable.
     * This step is optional, you can also use local initialization in your constructor here
     */
    private APITemplate template;

    /**
     * We need to construct the api-template class at least one time.
     * You can see we also get an information: "Instantiation of utility class 'APITemplate'"
     */
    public ExampleCaller() {
        template = new APITemplate(this);
    }

    @Override
    public void exampleMethod() {
        System.out.println("This method got called from the Example Caller class!");
    }
}
