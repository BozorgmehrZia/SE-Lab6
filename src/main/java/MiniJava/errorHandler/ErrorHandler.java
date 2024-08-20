package MiniJava.errorHandler;

/**
 * Created by Alireza on 6/28/2015.
 */

public class ErrorHandler {
    private static boolean hasError = false;

    public static boolean getHasError() {
        return hasError;
    }

    public static void setHasError(boolean errorState) {
        hasError = errorState;
    }

    public static void setError() {
        setHasError(true);
    }

    public static boolean hasError() {
        return getHasError();
    }

    public static void printError(String msg) {
        setError();
        System.out.println(msg);
    }
}

