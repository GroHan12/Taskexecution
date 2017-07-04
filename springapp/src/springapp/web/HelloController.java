package springapp.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;

public class HelloController implements Controller {
    protected final Log logger = LogFactory.getLog(getClass());
    
    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        logger.info("Returning hello view");
        
        String message = "HELLO WORLD!!!";
		
        
        return new ModelAndView("hello.jsp", "message", message);
    }
    
    

}



