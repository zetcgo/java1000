package datingapp;

class User {
    String name;
    boolean isMale;
    double point;

    User(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        this.point = Math.round(Math.random() * 50) / 10.0;
    }

    @Override
    public String toString() {
        return String.format("%s[name=%s,gender=%s,★%.1f]", super.toString(), name, isMale ? "male" : "female", point);
    }
}
