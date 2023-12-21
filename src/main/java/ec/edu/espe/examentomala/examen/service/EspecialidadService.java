package ec.edu.espe.examentomala.examen.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.examentomala.examen.dao.EspecialidadRepository;
import ec.edu.espe.examentomala.examen.domain.Especialidad;
import ec.edu.espe.examentomala.examen.service.exception.CreacionException;

@Service
public class EspecialidadService {
    private final EspecialidadRepository especialidadRepository;

    public EspecialidadService(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    public Especialidad create(Especialidad especialidad) {
        try {
            return this.especialidadRepository.save(especialidad);
        } catch (Exception e) {
            throw new CreacionException("Ocurrio un error al crear la especialidad: " + especialidad.toString(), e);
        }

        



    }


    

    

}
