package uz.ulugbek.dp.operationalpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.ulugbek.dp.operationalpatterns.domain.President;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/15/2021 9:52 AM
 */
@Repository
public interface PresidentRepository extends CrudRepository<President, Long> {
}
