
package veterinaria.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import veterinaria.adapters.rest.utils.PersonValidator;
import veterinaria.adapters.rest.utils.UserValidator;
import veterinaria.adapters.rest.utils.SimpleValidator;
import veterinaria.adapters.rest.utils.Util;
import veterinaria.domain.models.ClinicHistory;
import veterinaria.domain.models.MedicalOrder;
import veterinaria.domain.models.Person;
import veterinaria.domain.models.Pet;
import veterinaria.domain.models.User;
import veterinaria.domain.services.VeterinarianService;
import veterinaria.Ports.InputPort;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Felipe Lopera
 */


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
public class VeterinarianInput implements InputPort {
    
     @Autowired
    private VeterinarianService veterinarianService;
    @Autowired
    private PersonValidator personValidator;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private SimpleValidator simpleValidator;

    // Método para crear un nuevo dueño
    public void createOwner() {
        Scanner scanner = Util.getReader();

        try {
            System.out.println("Ingrese el ID del dueño:");
            long ownerId = Long.parseLong(scanner.nextLine());

            System.out.println("Ingrese el nombre del dueño:");
            String name = scanner.nextLine();
            personValidator.nameValidator(name);

            System.out.println("Ingrese la edad del dueño:");
            int age = Integer.parseInt(scanner.nextLine());
            personValidator.ageValidator(String.valueOf(age));

            System.out.println("Ingrese el rol del dueño:");
            String role = scanner.nextLine();
            personValidator.roleValidator(role);

            Person owner = new Person(ownerId, name, age, role);

            veterinarianService.createOwner(owner);
            System.out.println("Dueño creado exitosamente.");

        } catch (Exception e) {
            System.out.println("Error al crear dueño: " + e.getMessage());
        }
    }

    // Método para crear una nueva mascota
    public void createPet() {
        Scanner scanner = Util.getReader();

        try {
            System.out.println("Ingrese el ID de la mascota:");
            long petId = Long.parseLong(scanner.nextLine());

            System.out.println("Ingrese el nombre de la mascota:");
            String petName = scanner.nextLine();

            System.out.println("Ingrese el ID del dueño de la mascota:");
            long ownerId = Long.parseLong(scanner.nextLine());

            Person owner = new Person(ownerId, "", 0, "");
            Pet pet = new Pet(petId, petName, owner, 0, "", "", "", 0.0);

            veterinarianService.createPet(pet);
            System.out.println("Mascota creada exitosamente.");

        } catch (Exception e) {
            System.out.println("Error al crear mascota: " + e.getMessage());
        }
    }

    // Método para crear una nueva orden médica
    public void createOrder() {
        Scanner scanner = Util.getReader();

        try {
            System.out.println("Ingrese el ID de la orden médica:");
            long orderId = Long.parseLong(scanner.nextLine());

            System.out.println("Ingrese el ID de la mascota asociada:");
            long petId = Long.parseLong(scanner.nextLine());

            System.out.println("Ingrese el nombre del medicamento:");
            String medicationName = scanner.nextLine();

            System.out.println("Ingrese la dosis del medicamento:");
            double dosage = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese la fecha de la orden (YYYY-MM-DD):");
            String dateString = scanner.nextLine();

            java.sql.Date date = java.sql.Date.valueOf(dateString);

            Pet pet = new Pet(petId, "", null, 0, "", "", "", 0.0); // Simulando la mascota con solo el ID
            User veterinarian = new User(1L, "Veterinario", 35, "Veterinario", "veterinario", "password");

            MedicalOrder medicalOrder = new MedicalOrder(orderId, pet, new Person(1L, "Persona", 25, "Dueño"), veterinarian, medicationName, dosage, date);
            veterinarianService.createOrder(medicalOrder);
            System.out.println("Orden médica creada exitosamente.");

        } catch (Exception e) {
            System.out.println("Error al crear orden médica: " + e.getMessage());
        }
    }

    
    public void visualizeOrder() {
        Scanner scanner = Util.getReader();

        try {
            System.out.println("Ingrese el ID de la orden médica:");
            long orderId = Long.parseLong(scanner.nextLine());

            MedicalOrder order = new MedicalOrder(orderId, new Pet(1L, "Pet", null, 0, "", "", "", 0.0), new Person(), new User(), "", 0.0, new java.sql.Date(System.currentTimeMillis()));
            veterinarianService.visualizeOrder(order);
            System.out.println("Orden médica visualizada.");

        } catch (Exception e) {
            System.out.println("Error al visualizar la orden médica: " + e.getMessage());
        }
    }

    public void visualizeClinicHistory() {
        Scanner scanner = Util.getReader();

        try {
            System.out.println("Ingrese el ID del historial clínico:");
            long clinicHistoryId = Long.parseLong(scanner.nextLine());

            
            Person veterinarian = new Person(1L, "Veterinario", 27, "Veterinario");
            Pet pet = new Pet(1L, "Mascota", veterinarian, 3, "Perro", "Labrador", "Saludable", 20.0);
            MedicalOrder order = new MedicalOrder(1L, pet, veterinarian, new User(1L, "Veterinario", 27, "Veterinario", "veterinario", "password"), "Medicamento", 1.5, new java.sql.Date(System.currentTimeMillis()));

            
            veterinarianService.visualizeOrder(order);
            System.out.println("Historial clínico visualizado.");

        } catch (Exception e) {
            System.out.println("Error al visualizar el historial clínico: " + e.getMessage());
        }
    }

    @Override
    public void menu() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}