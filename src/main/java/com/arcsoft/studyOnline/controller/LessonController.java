package com.arcsoft.studyOnline.controller;

import com.arcsoft.studyOnline.bean.Lesson;
import com.arcsoft.studyOnline.bean.LessonWithRoute;
import com.arcsoft.studyOnline.service.LessonService;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Focus on 2017/6/19.
 */
@Controller
public class LessonController {
    @Autowired
    private LessonService lessonService;

    /**
     * @return 跳转到 createLesson.jsp 新增课程页面
     */
    @RequestMapping("/toCreateLesson")
    public String toCreateLesson() {
        return "createLesson";
    }


    /**
     * 根据传入的参数新增课程
     *
     * @param file       上传的课程封面图片文件
     * @param lessonName 传入的课程名称
     * @param request
     * @param isshow     是否上线该课程，1未上线，0为不上线
     * @param detail     课程简介
     * @return 跳转到原页面 createLesson.jsp 新增课程页面
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/createLesson")
    public String createLesson(@RequestParam("picFile") MultipartFile file, @RequestParam("lessonName") String lessonName, HttpServletRequest request, @RequestParam("isshow") Integer isshow, @RequestParam("detail") String detail) throws UnsupportedEncodingException {
        lessonService.insertLesson(file, lessonName, request, isshow, detail);
        return "createLesson";
    }


    /**
     * 根据课程ID，查出该课程信息，将信息回显到课程信息修改页面
     *
     * @param model 作用相当于request，用于传值到页面
     * @param id    传入的课程ID
     * @return 跳转到 updateLesson.jsp 课程信息修改页面
     */
    @RequestMapping("/toUpdateLesson")
    public String toUpdateLesson(Model model, @RequestParam("id") Integer id) {
        Lesson lesson = lessonService.selectLesson(id);
        model.addAttribute("lesson", lesson);
        return "updateLesson";
    }

    /**
     * 根据上传的参数修改单个课程信息
     *
     * @param file       上传的课程封面图片文件
     * @param lessonName 课程名称
     * @param request    HttpServletRequest
     * @param isshow     是否上线该课程，1未上线，0为不上线
     * @param id         课程ID
     * @param oldCover   原本的课程封面
     * @param detail     课程简介
     * @return 跳转到 toLessonList 方法，重新查询新的课程信息列表后显示
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/updateLesson")
    public String updateLesson(@RequestParam("picFile") MultipartFile file, @RequestParam("lessonName") String lessonName, HttpServletRequest request, @RequestParam("isshow") Integer isshow, @RequestParam("id") Integer id, @RequestParam("oldPicFile") String oldCover, @RequestParam("detail") String detail) throws UnsupportedEncodingException {
        lessonService.updateLesson(file, lessonName, request, isshow, id, oldCover, detail);
        return "redirect:/toLessonList";
    }


    /**
     * 查询所有课程信息列表后跳转到lessonList.jsp
     *
     * @param model 相当于request
     * @return 跳转到 课程信息列表
     */
    @RequestMapping("/toLessonList")
    public String toLessonList(Model model,@RequestParam(required = false, defaultValue = "") String searchName, @RequestParam(required = false, defaultValue = "1") Integer start) {
        Page<Object> page = PageHelper.startPage(start, 10);
        List<Lesson> lessonList = lessonService.selectLessonList();
        PageInfo<Lesson> pageInfo = new PageInfo<>(lessonList);
        int pageCount = pageInfo.getPages();
        model.addAttribute("lessonList", lessonList);
        model.addAttribute("pageCount", pageCount);
        model.addAttribute("start", start);
        if (start - 1 >= 1) {
            model.addAttribute("pre", start - 1);
        } else {
            model.addAttribute("pre", 1);
        }
        if (start + 1 <= pageCount) {
            model.addAttribute("next", start + 1);
        } else {
            model.addAttribute("next", pageCount);
        }
        return "lessonList";
    }


    /**
     * 根据传入的课程ID，删除该课程
     *
     * @param id 传入的课程ID
     * @return 完成后重定向到 查询后跳转到 课程信息列表 的方法
     */
    @RequestMapping("/delLesson")
    public String delLesson(@RequestParam Integer id) {
        lessonService.deleteLesson(id);
        return "redirect:/toLessonList";
    }


    /**
     * @return 将查到的课程列表以Json的格式传回
     */
    @RequestMapping("/getLessonListByJson")
    @ResponseBody
    public List getLessonListByJson() {
        List lessonList = lessonService.selectLessonList();
        return lessonList;
    }

    /**
     * @return 将查询到的课程及其子课程的信息封装好以Json的格式传回
     */
    @RequestMapping("/getLessonListWithRouteByJson")
    @ResponseBody
    public List getLessonListWithRouteByJson() {
        List<LessonWithRoute> lessonWithRouteList = lessonService.selectLessonListWithRoute();
        return lessonWithRouteList;
    }


    /**
     * @param model 相当于request
     * @return 查询课程信息和课程及其子课程信息，跳转到页面course.jsp页面
     */
    @RequestMapping("/moreLesson")
    public String moreLesson(Model model) {
        List<Lesson> lessonList = lessonService.selectLessonList();
        List<LessonWithRoute> lessonWithRouteList = lessonService.selectLessonListWithRoute();
        model.addAttribute("lessonList", lessonList);
        model.addAttribute("lessonWithRouteList", lessonWithRouteList);
        return "course";
    }

    /**
     * @param searchName 接收前台提交的课程名参数
     * @param model      相当于request
     * @return 跳转到页面 course.jsp
     */
    @RequestMapping("selectLessonByName")
    public String selectLessonByName(@RequestParam(required = false, defaultValue = "") String searchName, @RequestParam(required = false, defaultValue = "0") Integer start, Model model) {
        Page<Object> page = PageHelper.startPage(start, 10);
        List<LessonWithRoute> lessonWithRouteList = lessonService.selectLessonListWithRouteByName(searchName);
        PageInfo<LessonWithRoute> pageInfo = new PageInfo<>(lessonWithRouteList);
        int pageCount = pageInfo.getPages();
        List<Lesson> lessonList = lessonService.selectLessonListByName(searchName);

        model.addAttribute("lessonList", lessonList);
        model.addAttribute("lessonWithRouteList", lessonWithRouteList);
        model.addAttribute("pageCount", pageCount);
        model.addAttribute("start", start);
        if (start - 1 >= 1) {
            model.addAttribute("pre", start - 1);
        }
        if (start + 1 <= pageCount) {
            model.addAttribute("next", start + 1);
        }
        return "course";
    }


    /**
     * @param searchName 接收前台提交的课程名参数
     * @return 返回json数据
     */
    @RequestMapping("selectLessonByNameWithJson")
    @ResponseBody
    public Map selectLessonByNameWithJson(@RequestParam(required = false, defaultValue = "") String searchName,@RequestParam(required = false, defaultValue = "1") Integer start) {


        Map<String, Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(start, 15);
        List<LessonWithRoute> lessonWithRouteList = lessonService.selectLessonListWithRouteByName(searchName);
        PageInfo<LessonWithRoute> pageInfo = new PageInfo<>(lessonWithRouteList);
        int pageCount = pageInfo.getPages();

        map.put("start", start);
        if (start - 1 >= 1) {
            map.put("pre", start - 1);
        }else {
            map.put("pre", 1);
        }
        if (start + 1 <= pageCount) {
            map.put("next", start + 1);
        }else {
            map.put("next", pageCount);
        }
        map.put("pageCount", pageCount);
        map.put("lessonWithRouteList", lessonWithRouteList);
        return map;
    }


}
