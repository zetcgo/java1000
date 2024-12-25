package blackjack;

record Card(Suit suit, int rank) {
    @Override
    public String toString() {
        int initialCodePoint = 0xdca0;
        int suitModifier = (suit.symbol - '♠') * 16;
        int rankModifier = rank + (rank >= 12 ? 1 : 0);
        int codePoint = initialCodePoint + suitModifier + rankModifier;
        String secondUnicodeString = new String(Character.toChars(codePoint));

        Color outputColor = Suit.SUIT_TO_COLOR.get(suit);
        return outputColor.unicode + String.format("\ud83c%s", secondUnicodeString) + Color.RESET.unicode;
    }
}
