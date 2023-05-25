package CoolString;

public class CoolString {
    private String value;

    public CoolString(String value) {
        if (value == null)
            throw new NullPointerException("Cannot be null, Hagrid");
        else
            this.value = value;
    }

    public String getValue() {
        return value;
    }
}
