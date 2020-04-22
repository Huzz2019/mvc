package com.huzz.edu.controller;

import com.huzz.edu.pojo.Resume;
import com.huzz.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/query")
    @ResponseBody
    public List<Resume> queryAll(){
        List<Resume> resumeList = resumeService.queryAll();
        return resumeList;
    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Resume resume){
        ModelAndView modelAndView = new ModelAndView();
        try {
            resumeService.updateOne(resume);
            modelAndView.setViewName("success");
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public ModelAndView insert(Resume resume){
        ModelAndView modelAndView = new ModelAndView();
        try {
           resumeService.insertOne(resume);
           modelAndView.setViewName("success");
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
        }
        System.out.println(modelAndView.getViewName());
        return modelAndView;
    }
}
