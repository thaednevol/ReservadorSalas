package beans;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginFiltro implements Filter {
	
	private static final String INDEX = "index.xhtml";

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

    private static boolean checkLoginState(ServletRequest request, ServletResponse response){  
    	return true;
    }

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) {
		// TODO Auto-generated method stub
		 boolean isLoggedIn = checkLoginState(request, response);  
		 if (isRedirect((HttpServletRequest) request) && !isLoggedIn) {  
			 //RequestDispatcher requestDispatcher = request.getRequestDispatcher(INDEX);
			 System.out.println("voy para el index");
			// Force the login  		  
//	         try {
//				//requestDispatcher.forward(request, response);
//			} catch (ServletException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}  
	  
	            return;  
		 }
		 else {  			  
	            try {	  
	                chain.doFilter(request, response);
	            } catch (Throwable t) {  	  
	                // A production quality implementation will  
	                // deal with this exception.  	  
	            }  
	  
	        }  
		
	}
	
	private boolean isRedirect(HttpServletRequest request) {  		  
        String requestURI = request.getRequestURI();    
        return (!requestURI.contains(INDEX));  
  
    } 

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	} 

}
