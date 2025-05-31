
package veterinaria.adapters.rest;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import veterinaria.domain.models.Person;
import veterinaria.domain.services.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping("/create")
    public String createSeller(@RequestBody Person seller) {
        try {
            sellerService.createSeller(seller);
            return "Vendedor creado correctamente.";
        } catch (Exception e) {
            return "Error al crear vendedor: " + e.getMessage();
        }
    }

    @GetMapping("/get/{id}")
    public Person getSellerById(@PathVariable long id) {
        try {
            return sellerService.getSellerById(id);
        } catch (Exception e) {
            System.out.println("Error al obtener vendedor: " + e.getMessage());
            return null;
        }
    }
}
