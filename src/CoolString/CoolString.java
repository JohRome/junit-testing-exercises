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

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
    public boolean equals(Object obj) {
        return obj.equals(getValue());
    }
}
