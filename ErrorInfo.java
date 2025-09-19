public class ErrorInfo {
    private String errorName;
    private String explanation;
    private String fixSuggestion;

    public ErrorInfo(String errorName, String explanation, String fixSuggestion) {
        this.errorName = errorName;
        this.explanation = explanation;
        this.fixSuggestion = fixSuggestion;
    }

    public String getErrorName() {
        return errorName;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getFixSuggestion() {
        return fixSuggestion;
    }
}
