package study.tastespringrest.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

  @RestResource(path = "title")
  List<Todo> findByTitleContains(String keyword);

}
