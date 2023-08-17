package application;

public enum Scaffold {

    ZERO {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      " +
                  "\n   |      " +
                  "\n   |      " +
                  "\n   |      " +
                  "\n   |     " +
                  "\n   |      " +
                  "\n   |____________";
        }
    },
    ONE {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      |" +
                  "\n   |      O" +
                  "\n   |      " +
                  "\n   |      " +
                  "\n   |     " +
                  "\n   |      " +
                  "\n   |____________";
        }
    },
    TWO {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      |" +
                  "\n   |      O" +
                  "\n   |      |" +
                  "\n   |      |" +
                  "\n   |     " +
                  "\n   |      " +
                  "\n   |____________";
        }
    },
    THREE {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      |" +
                  "\n   |      O" +
                  "\n   |     /|" +
                  "\n   |      |" +
                  "\n   |     " +
                  "\n   |      " +
                  "\n   |____________";
        }
    },
    FOUR {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      |" +
                  "\n   |      O" +
                  "\n   |     /|\\" +
                  "\n   |      |" +
                  "\n   |     " +
                  "\n   |      " +
                  "\n   |____________";
        }
    },
    FIVE {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      |" +
                  "\n   |      O" +
                  "\n   |     /|\\" +
                  "\n   |      |" +
                  "\n   |     /" +
                  "\n   |      " +
                  "\n   |____________";
        }
    },
    SIX {
        @Override
        public String toString() {
            return "\n   ________" +
                  "\n   |      |" +
                  "\n   |      O" +
                  "\n   |     /|\\" +
                  "\n   |      |" +
                  "\n   |     / \\" +
                  "\n   |      " +
                  "\n   |____________";
        }
    }
}
