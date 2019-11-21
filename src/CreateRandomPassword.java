import java.util.Random;

/**
 * @Author Jack <e.kobets>
 */


public class CreateRandomPassword {

    private static final String PASSWORD_SMS_TEXT_LITERAL = "%Parol%";

    public static void main(String[] args) {
        generateRandomPassword(8, 20);
    }

    /**
     * Generates random password by next restrictions:
     * - At least one upper case letter;
     * - At least one special character;
     * - At least one lower case character;
     * - At least one digit;
     *
     *
     *
     * @param minimalPasswordLength minimal password length
     * @param maximalPasswordLength maximal password length
     * @return generated random password
     */
    private static String generateRandomPassword(final int minimalPasswordLength, final int maximalPasswordLength) {

        final String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        final String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String specialCharacters = "\\!\"#$%&'()*+,-./:\\;<=>?@\\[\\]|^_`{}~";
        final String digits = "0123456789";
        final Random random = new Random();

        final StringBuilder randomPassword = new StringBuilder();
        randomPassword
                .append(upperLetters.charAt(random.nextInt(upperLetters.length())))
                .append(specialCharacters.charAt(random.nextInt(specialCharacters.length())))
                .append(lowerLetters.charAt(random.nextInt(lowerLetters.length())))
                .append(digits.charAt(random.nextInt(digits.length())));

        while (randomPassword.length() <= minimalPasswordLength && !(randomPassword.length() >= maximalPasswordLength)) {

            int randomPick = random.nextInt(2);
            if (randomPick == 0) {
                randomPassword.append(lowerLetters.charAt(random.nextInt(lowerLetters.length())));
            }
            else if (randomPick == 1) {
                randomPassword.append(digits.charAt(random.nextInt(digits.length())));
            }
        }

        System.out.println("Random password: " + randomPassword);
        return randomPassword.toString();
    }
}
