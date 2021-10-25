public class Decode {
    private final int shiftKey;
    private final String message;

    public Decode(int shiftKey1, String message1) {
        this.shiftKey = shiftKey1;
        this.message = message1;
    }

    public StringBuilder decoding(){
        int shiftKey = this.shiftKey;
        String message = this.message.toLowerCase();

        StringBuilder eMessage = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalCharPosition = character - 'a';
                int newCharPosition = (originalCharPosition + shiftKey) % 26;
                char newChar = (char) ('a' + newCharPosition);
                eMessage.append(newChar);
            } else {
                eMessage.append(character);
            }
        }
        return eMessage;
    }
}
