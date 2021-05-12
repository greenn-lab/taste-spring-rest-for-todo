package study.tastespringrest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import study.tastespringrest.todo.Todo;
import study.tastespringrest.todo.TodoRepository;

@SpringBootApplication
@RequiredArgsConstructor
public class TasteSpringRestApplication implements CommandLineRunner {

  private final TodoRepository repository;


  // CommandLineRunner 가 안되는게 아니었어요.
  // 아마도 log level 이 높아서 로깅 해본게 안나온 것일 뿐인것 같아요.
  @Override
  public void run(String... args) throws Exception {
    Todo todo = new Todo();
    todo.setTitle("hello!");
    todo.setCompleted(true);

    repository.save(todo);
  }

  public static void main(String[] args) {
    SpringApplication.run(TasteSpringRestApplication.class, args);
  }

}
