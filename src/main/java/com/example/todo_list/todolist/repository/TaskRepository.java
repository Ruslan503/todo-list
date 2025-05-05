package com.example.todo_list.todolist.repository;

import com.example.todo_list.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
