package main.model.dao;

import main.model.entity.Lesson;

import java.util.List;

public interface LessonDao {

    List<Lesson> findAll();

    Lesson findById(long id);

    int insert(Lesson lesson);

    int delete(long id);

    int update(Lesson lesson);
}
