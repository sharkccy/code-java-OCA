package javaapplication10;

public class IdException extends Exception {

    int n;

    public IdException(int n) {
        this.n = n;
    }

    public String toString() {
        return "錯誤訊息代碼" + n;
    }
}
