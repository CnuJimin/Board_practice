package projcet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projcet.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
