package main.controllers;

import main.model.entity.Student;
import main.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olesya on 27.04.2017.
 */
@Controller
@RequestMapping(value = "/list")
public class ListController {


    private List<Student> students = new ArrayList<>();

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showList(Model model) {
        students=studentService.getAllStudents();
        model.addAttribute("list", students);
        return "list/list";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(@RequestParam(value = "name", required = true) String name,
                              @RequestParam(value = "age", required = true) String age,
                              @RequestParam(value = "group_id", required = true) String group_id) {
        ModelAndView mav = new ModelAndView();
        Student student = new Student(name, Integer.parseInt(age),Long.parseLong(group_id));

        studentService.insert(student);
        mav.setViewName("redirect:list");

        return mav;
    }


}
