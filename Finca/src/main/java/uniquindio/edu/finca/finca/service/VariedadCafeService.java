package uniquindio.edu.finca.finca.service;

import org.springframework.stereotype.Service;
import uniquindio.edu.finca.finca.model.VariedadCafe;
import uniquindio.edu.finca.finca.repository.VariedadCafeRepository;

import java.util.List;

@Service
public class VariedadCafeService {

    private final VariedadCafeRepository variedadCafeRepository;

    public VariedadCafeService(VariedadCafeRepository variedadCafeRepository) {
        this.variedadCafeRepository = variedadCafeRepository;
    }

    public VariedadCafe guardar(VariedadCafe variedadCafe) {
        return variedadCafeRepository.save(variedadCafe);
    }

    public List<VariedadCafe> listarTodos() {
        return variedadCafeRepository.findAll();
    }

}
