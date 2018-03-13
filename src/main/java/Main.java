import fr.curie.cd2sbgnml.Cd2SbgnmlScript;
import fr.curie.cd2sbgnml.Sbgnml2CdScript;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        Sbgnml2CdScript sbgnml2CdScript = new Sbgnml2CdScript();
        Cd2SbgnmlScript cd2SbgnmlScript = new Cd2SbgnmlScript();

        get("/hello", (reg, res) -> "Hello World");
    }
}
