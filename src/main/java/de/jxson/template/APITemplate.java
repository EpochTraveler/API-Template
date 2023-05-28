package de.jxson.template;

import de.epochtraveler.epochapi.api.API;

@API(
        name = "Template-API",
        version = "1.0.0"
)
public class APITemplate {

    private static APITemplateLocal localApiInterface;

    /**
     * This method needs to be called therefore the api can't be initialized
     * @param localApiInterface our custom caller interface instance
     */
    public APITemplate(APITemplateLocal localApiInterface) {
        APITemplate.localApiInterface = localApiInterface;
    }

    /**
     * This public static method is calling the method we provided from the local class
     */
    public static void exampleMethod() {
        localApiInterface.exampleMethod();
    }

}
