package ec.edu.espe.examentomala.examen.dao;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examentomala.examen.domain.DocenteMateria;
import ec.edu.espe.examentomala.examen.domain.DocenteMateriaPK;

public interface DocenteMateriaRepository extends CrudRepository<DocenteMateria, DocenteMateriaPK> {

}
