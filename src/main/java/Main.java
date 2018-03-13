import fr.curie.cd2sbgnml.Cd2SbgnmlScript;
import fr.curie.cd2sbgnml.Sbgnml2CdScript;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        Cd2SbgnmlScript.convert("anchorPoints.xml", "anchorPoints.sbgn");
        Sbgnml2CdScript.convert("samples/anchorPointsConverted.xml", "samples/anchorPoints.sbgn");

        get("/hello", (reg, res) -> "Hello World");
    }
}
