package houses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import houses.beans.Houses;

@Repository
public interface HouseRepo extends JpaRepository<Houses, Long>{

}
