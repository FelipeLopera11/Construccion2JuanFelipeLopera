
package veterinary.Adapters.Rest;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import veterinary.domain.models.Person;
import veterinary.domain.services.VeterinarianService;

@RestController
@RequestMapping("/veterinarians")
public class VeterinarianController {

    @Autowired
    private VeterinarianService veterinarianService;

    // Registrar un veterinario
    @PostMapping
    public String createVeterinarian(@RequestBody Person veterinarian) {
        try {
            if (!"veterinario".equalsIgnoreCase(veterinarian.getRole())) {
                return "El rol debe ser 'veterinario'.";
            }

            veterinarianService.createOwner(veterinarian);
            return "Veterinario registrado correctamente.";
        } catch (Exception e) {
            return "Error al registrar el veterinario: " + e.getMessage();
        }
    }
}
