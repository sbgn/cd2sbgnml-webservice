import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (reg, res) -> "Hello World");
    }
}
