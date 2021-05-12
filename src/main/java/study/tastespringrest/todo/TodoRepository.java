package study.tastespringrest.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

  // TODO 검색조건 만들어보기


}
