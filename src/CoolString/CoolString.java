package CoolString;

public class CoolString {
    private String value;

    /**
     * Constructs a CoolString object with the specified value.
     *
     * @param value the value of the CoolString
     * @throws NullPointerException if the specified value is null
     */
    public CoolString(String value) {
        if (value == null)
            throw new NullPointerException("Cannot be null, Hagrid");
        else
            this.value = value;
    }

    /**
     * Returns the value of the CoolString.
     *
     * @return the value of the CoolString
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the CoolString.
     *
     * @param value the new value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a string representation of the CoolString.
     *
     * @return a string representation of the CoolString
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare
     * @return true if this CoolString is the same as the obj argument; false otherwise
     */
    public boolean equals(Object obj) {
        return obj.equals(getValue());
    }
}
