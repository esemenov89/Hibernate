package main;


import main.model.dao.GroupDao;
import main.model.dao.JournalDao;
import main.model.dao.LessonDao;
import main.model.dao.StudentDao;
import main.model.entity.Group;
import main.model.entity.Journal;
import main.model.entity.Lesson;
import main.model.entity.Student;
import main.model.impl.GroupDaoImpl;
import main.model.impl.JournalDaoImpl;
import main.model.impl.LessonDaoImpl;
import main.model.impl.StudentDaoImpl;
import main.services.DataSourceFactory;

import javax.sql.DataSource;

public class Main {

    private static StudentDao studentDao;
    private static GroupDao groupDao;
    private static LessonDao lessonDao;
    private static JournalDao journalDao;

    public static void main(String[] args) {

        DataSource dataSource = DataSourceFactory.getDataSource();//DataSourceFactory.getMyPGDataSource();
        groupDao = new GroupDaoImpl();
        studentDao = new StudentDaoImpl();
        lessonDao = new LessonDaoImpl();
        journalDao = new JournalDaoImpl();

       for (Group group : groupDao.findAll()) {
           System.out.println(group);
           System.out.println();
        }

        for (Student student : studentDao.findAll()) {
            System.out.println(student);
            if (student.getGroup() != null) {
                System.out.println(student.getGroup());
            }
            System.out.println();
        }

        for (Lesson lesson : lessonDao.findAll()) {
            System.out.println(lesson);
            if (lesson.getGroup() != null) {
                System.out.println(lesson.getGroup());
            }
            System.out.println();
        }

        for (Journal journal : journalDao.findAll()) {
            System.out.println(journal);
            if (journal.getLesson() != null)
                System.out.println(journal.getLesson());

            if (journal.getStudent() != null)
                System.out.println(journal.getStudent());
            System.out.println();
        }
    }
}
