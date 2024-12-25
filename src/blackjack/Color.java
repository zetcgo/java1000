package blackjack;

enum Color {
    SPADE("\u001B[38;2;140;140;147m"),
    HEART("\u001B[38;2;224;42;28m"),
    DIAMOND("\u001B[38;2;0;138;223m"),
    CLOVER("\u001B[38;2;228;146;1m"),
    RESET("\u001B[0m");

    final String unicode;

    Color(String unicode) {
        this.unicode = unicode;
    }
}
