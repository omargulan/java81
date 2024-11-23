package exeption;

public class Task261024 {
    public static void main(String[] args) {
//        try {
//            System.out.println(validatePassword("admin1"));
//        } catch (PasswordValidationException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            System.out.println(validatePassword("admin12343"));
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(validatePassword("adminadmin"));
        System.out.println(validatePassword("Admin@dmin"));
        System.out.println(validatePassword("Admin@dmin23"));
    }

    // создайте класс PasswordValidateException, который наследуется от RuntimeException
    // создайте конструктор с одним параметром (String message)

    static boolean validatePassword(String password) {
        // Пароль должен содержать минимум 8 символов
        if (password.length() < 8) {

            throw new  PasswordValidationException("Пароль должен содержать минимум 8 символов");

        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            // Проверка, текущий символ - заглавная буква?
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;

            }

            // Проверка, текущий символ - цифра?
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }

            if (hasUpperCase && hasDigit) {
                return true;
            }
        }
        if (!hasUpperCase){
            throw new PasswordValidationException("min 1 zaglavnyi nuzhen");
        } else{
            throw new PasswordValidationException("min 1 tchifr nuzhen");
        }
        //return false;
    }

}
    class PasswordValidationException extends RuntimeException{

        public PasswordValidationException(String str) {
            super(str);
        }
    }
