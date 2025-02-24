package com.example.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "todos")  // MongoDB의 "todos" 컬렉션과 매핑
public class Todo {
    @Id
    private String id;
    private String title;
    private boolean completed;
    private LocalDateTime createdAt = LocalDateTime.now();
}
