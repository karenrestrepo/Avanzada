package uniquindio.edu.finca.finca.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniquindio.edu.finca.finca.model.VariedadCafe;
import uniquindio.edu.finca.finca.service.VariedadCafeService;

import java.util.List;

@RestController
@RequestMapping("/api/cafes")
public class CafeController {

    private final VariedadCafeService variedadCafeService;

    public CafeController(VariedadCafeService variedadCafeService) {
        this.variedadCafeService = variedadCafeService;
    }

    @PostMapping
    public ResponseEntity<VariedadCafe> guardar(@RequestBody VariedadCafe variedadCafe) {
        VariedadCafe guardada = variedadCafeService.guardar(variedadCafe);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardada);
    }

    @GetMapping
    public ResponseEntity<List<VariedadCafe>> listarTodos() {
        List<VariedadCafe> cafes = variedadCafeService.listarTodos();
        return ResponseEntity.ok(cafes);
    }

}
