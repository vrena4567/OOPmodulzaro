package person;

public enum Gender {
    FEMALE("nő", "female"),
    MALE("férfi", "male");
    private String magyarul;
    private String angolul;

    Gender(String magyarul, String angolul) {
        this.magyarul = magyarul;
        this.angolul = angolul;
    }

    public String getMagyarul() {
        return magyarul;
    }

    public String getAngolul() {
        return angolul;
    }
}
