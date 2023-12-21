package ec.edu.espe.examentomala.examen.service;

import ec.edu.espe.examentomala.examen.dao.DocenteRepository;
import ec.edu.espe.examentomala.examen.domain.Docente;
import ec.edu.espe.examentomala.examen.service.exception.CreacionException;
import jakarta.transaction.Transactional;

public class DocenteService {

    private final DocenteRepository docenteRepository;

    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    @Transactional
    public Docente create(Docente docente) {
        try {
            return this.docenteRepository.save(docente);
        } catch (Exception e) {
            throw new CreacionException("Ocurrio un error al crear el docente: " + docente.toString(),  e);
        }
    }

}
