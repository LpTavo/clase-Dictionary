import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class EjemploDictionary {
    public static void main(String[] args) {
        
        Dictionary<String, String> diccionario = new Hashtable<>();
        
        
        diccionario.put("rojo", "FF0000");
        diccionario.put("verde", "00FF00");
        diccionario.put("azul", "0000FF");
        
       
        System.out.println("Tamaño del diccionario: " + diccionario.size());
        
      
        String colorRojo = diccionario.get("rojo");
        System.out.println("El código del color rojo es: " + colorRojo);
        
    
        Enumeration<String> claves = diccionario.keys();
        while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            String valor = diccionario.get(clave);
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
        
   
        diccionario.remove("verde");
        System.out.println("Tamaño del diccionario después de eliminar 'verde': " + diccionario.size());
        
       
        System.out.println("¿El diccionario está vacío? " + diccionario.isEmpty());
    }
}
