package interface_inner_abstract;

public class InnerTest {
    private final Data data;
    public InnerTest(char c, int count) {
        data = new Data(c, count);
    }

    public String getContent() {
        return data.word + " : " + data.count;
    }

    public static class Data {
        private char word;
        private final int count;

        public Data(char word, int count) {
            this.word = word;
            this.count = count;
        }

        public char getWord() {
            return word;
        }

        public int getCount() {
            return count;
        }

        public void setWord(char word) {
            this.word = word;
        }
    }
}
