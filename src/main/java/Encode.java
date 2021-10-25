public class Encode {
    private int shiftKey;
    private String message;

    public StringBuilder Encoding(){
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
