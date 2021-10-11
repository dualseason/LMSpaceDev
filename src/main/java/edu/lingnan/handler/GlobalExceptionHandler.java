package edu.lingnan.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**处理系统未知异常*/
    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "系统发生错误，请通知管理员！");
        mv.addObject("ex", exception);
        mv.setViewName("error");
        return mv;
    }
}
