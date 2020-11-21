package lr5;

public enum Cards {
    two("2", 2),
    three("3", 3),
    four("4", 4),
    five("5", 5),
    six("6", 6),
    seven("7", 7),
    eight("8", 8),
    nine("9", 9),
    ten("10", 10),
    jack("J", 10),
    queen("Q", 10),
    king("K", 10),
    ace("A", 1);

    protected final String name;
    protected final int points;

    Cards(String name, int points) {
        this.name = name;
        this.points = points;
    }

}
