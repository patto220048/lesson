package shop;

public enum Size {
    LARGE("L"), MEDIUM("M"), SMALL("S");

    private final String value;

    private Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
