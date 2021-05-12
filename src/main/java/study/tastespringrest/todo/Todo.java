package study.tastespringrest.todo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Todo {

  @Id
  @GeneratedValue
  private Long id;

  private String title;
  private boolean completed;

}
