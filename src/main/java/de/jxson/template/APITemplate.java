package de.jxson.template;

public class APITemplate {

    private static APITemplateLocal localApiInterface;

    public static final String API_NAME = "Template-API";
    public static final String API_VERSION = "1.0.0";

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
