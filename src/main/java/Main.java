import fr.curie.cd2sbgnml.Cd2SbgnmlScript;
import fr.curie.cd2sbgnml.Sbgnml2CdScript;

public class Main {
    public static void main(String[] args) {
        Cd2SbgnmlScript.convert("samples/anchorPoints.xml", "samples/anchorPoints.sbgn");
        Sbgnml2CdScript.convert("samples/anchorPoints.sbgn", "samples/anchorPointsConverted.xml");
    }
}
