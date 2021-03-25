package community.community.repository;

import community.community.domain.Board;
import community.community.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByUser(User user);

}
