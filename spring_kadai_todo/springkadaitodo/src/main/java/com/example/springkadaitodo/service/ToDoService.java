package com.example.springkadaitodo.service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
}
