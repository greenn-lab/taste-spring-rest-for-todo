package study.tastespringrest.todo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
@Data
public class Todo {

  @Id
  @GeneratedValue
  private Long id;

  private String title;
  private boolean completed;

  @Version
  private long version;

}
