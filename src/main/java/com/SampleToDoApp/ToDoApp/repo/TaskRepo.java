package com.SampleToDoApp.ToDoApp.repo;

import com.SampleToDoApp.ToDoApp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
