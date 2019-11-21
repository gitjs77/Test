
public class LogicOperations {

    public static void main(String[] args) {

        /**
         * Логичкские операции.
         * && операция И
         * || операция ИЛИ
         * Результатом логической операции всегда выстпает boolean
         * результат (true  или false). То есть да или нет.
         */

        // Пример простой логической операции

        // Создали строку password и присвоили ей значение Qwerty
        String password = "Qwerty";

        // Логическая операция
        boolean logicOperationResult =
                password.length() == 5;

        System.out.println("password.length() == 5: " +
                logicOperationResult);

        // Логическая операция
        logicOperationResult =
                password.length() >= 5;

        System.out.println("password.length() >= 5: " +
                logicOperationResult);

        // Пример составной логической операции с && или ||
        boolean logicOperationResult2 =
                (password.length() >= 2 && password.length() <= 10);
        System.out.println("(password.length() >= 2 && password.length() <= 10): " +
                logicOperationResult2);

        logicOperationResult2 =
                (password.length() >= 2 && password.length() <= 5);
        System.out.println("(password.length() >= 2 && password.length() <= 5): " +
                logicOperationResult2);

        //
        boolean logicOperationResult3 =
                (password.length() >= 2 && password.length() <= 10)
                || password.equals("Admin");
        System.out.println(logicOperationResult3);

        logicOperationResult3 =
                (password.length() >= 2 && password.length() <= 5)
                        || password.equals("Qwerty");
        System.out.println(logicOperationResult3);

    }
}
