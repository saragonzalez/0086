
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
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
    private HashMap<String, String> respuestaSegunEntrada;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        unaRespuesta = new Random();
        respuestas = new ArrayList<String>();
        respuestaSegunEntrada = new HashMap<>();
        
        respuestas.add("I need more information");
        respuestas.add("I can not help you, tell me more details");
        respuestas.add("Might I detail it better");
        respuestas.add("I want to help but I need more information");
        respuestas.add("OK, but I need specifics");
        
        respuestaSegunEntrada.put("problem","what operating system do you use?");
        respuestaSegunEntrada.put("linux","that gives you the error");
        respuestaSegunEntrada.put("free","have a one year warranty");
        respuestaSegunEntrada.put("error","I do not understand the nature of the error");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet <String> entradaUsuario)
    {
        String respuesta = null;    
        
        Iterator <String> iterator = entradaUsuario.iterator();
        String entradaUsuarioCadena = iterator.next();
        respuesta =respuestaSegunEntrada.get(entradaUsuario);
        if(respuesta==null)
        {
            respuesta = respuestas.get(unaRespuesta.nextInt(respuestas.size()));
        }
        return respuesta;
    }
}
