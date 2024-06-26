package patterns.behavioral.iterator.v1;

/**
 * This enum represents the aggregate from the Iterator pattern.
 */
public enum ThemeColor {
    RED,
    ORANGE,
    BLACK,
    GREEN,
    WHITE;

    public static Iterator<ThemeColor> getIterator() {
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor> {
        private int position;

        @Override
        public boolean hasNext() {
            return position < values().length;
        }

        @Override
        public ThemeColor next() {
            return values()[position++];
        }
    }
}
