package olympics;

class Country {
    String name;
    int golds, silvers, bronzes;

    Country(String name, int golds, int silvers, int bronzes) {
        this.name = name;
        this.golds = golds;
        this.silvers = silvers;
        this.bronzes = bronzes;
    }

    @Override
    public String toString() {
        return String.format("%s[name=%s,%d/%d/%d]", super.toString(), name, golds, silvers, bronzes);
    }
}
