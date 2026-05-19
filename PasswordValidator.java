public class PasswordValidator {
    private int minLength;
    private boolean requireDigit;

    public PasswordValidator(int minLength, boolean requireDigit) {
        this.minLength = minLength;
        this.requireDigit = requireDigit;
    }

    public boolean validate(String password) {
        if (password == null || password.length() < minLength) {
            return false;
        }

        if (requireDigit) {
            boolean hasDigit = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) return false;
        }

        return true;
    }
}
