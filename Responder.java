
import java.util.Random;
import java.util.ArrayList;
/** The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */


public class Responder
{
    private Random unaRespuesta;
    private ArrayList<String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        unaRespuesta = new Random();
        respuestas = new ArrayList<String>();
        
        respuestas.add("I need more information");
        respuestas.add("I can not help you, tell me more details");
        respuestas.add("Might I detail it better");
        respuestas.add("I want to help but I need more information");
        respuestas.add("OK, but I need specifics");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
    
        return respuestas.get(unaRespuesta.nextInt(respuestas.size()));
    }
}
