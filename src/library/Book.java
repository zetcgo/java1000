package library;

class Book {
    String title;
    int price;
    boolean rented;

    Book(String title, int price, boolean rented) {
        this.title = title;
        this.price = price;
        this.rented = rented;
    }

    @Override
    public String toString() {
        return String.format("%s[title=%s,price=%d,%s]",
                super.toString(), title, price, rented ? "rented" : "left");
    }

    public void setRented() {
        if (rented) throw new RuntimeException(String.format("%s already rented.", this));
        rented = true;
    }

    public void setReturned() {
        if (!rented) throw new RuntimeException(String.format("%s not rented yet.", this));
        rented = false;
    }
}
