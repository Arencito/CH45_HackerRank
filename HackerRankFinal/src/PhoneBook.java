import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        // Primero, vamos a crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Ahora, creamos un HashMap para guardar el nombre y número de teléfono
        HashMap<String, String> phoneBook = new HashMap<>();
        
        // Leemos el número de entradas en el directorio telefónico
        int n = Integer.parseInt(scanner.nextLine());
        
        // Empezamos a llenar el directorio con nombres y números
        for (int i = 0; i < n; i++) {
            // Leemos el nombre de la persona
            String name = scanner.nextLine();
            // Leemos el número de teléfono correspondiente
            String phoneNumber = scanner.nextLine();
            // Guardamos esta combinación de nombre y teléfono en nuestro mapa
            phoneBook.put(name, phoneNumber);
        }

        // Ahora vamos a procesar las consultas hasta que se acaben los datos
        while (scanner.hasNext()) {
            // Leemos el nombre que el usuario está consultando
            String query = scanner.nextLine();
            // Revisamos si ese nombre está en el directorio
            if (phoneBook.containsKey(query)) {
                // Si el nombre está, mostramos el nombre y su número
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                // Si no lo encontramos, mostramos "Not found"
                System.out.println("Not found");
            }
        }
        
        // Finalmente, cerramos el escáner para no dejar recursos abiertos
        scanner.close();
    }
}
