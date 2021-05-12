package study.tastespringrest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;
import study.tastespringrest.todo.Todo;
import study.tastespringrest.todo.TodoRepository;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class TodoConfiguration {

  private final TodoRepository repository;

  @PostConstruct
  public void setup() {

    Todo todo = new Todo();
    todo.setTitle("hello!");
    todo.setCompleted(true);

    repository.save(todo);

  }

}
