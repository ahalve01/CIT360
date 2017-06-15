package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Game;

/**
 * Servlet implementation class Servlet
 */
@WebServlet({ "/Servlet", "/doGuess" })

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Game guess = new Game(Integer.parseInt(request.getParameter("guess")));
		Game correct = new Game(Integer.parseInt(request.getParameter("correct")));
		Game guesses = new Game(Integer.parseInt(request.getParameter("guesses")));
		Game minimum = new Game(Integer.parseInt(request.getParameter("mininum")));
		Game maximum = new Game(Integer.parseInt(request.getParameter("maximum")));
		
		//output from guess
		String message = "";
		String url = "/guess.jsp";
		
		// find the next page
		if( guess.getValue() == correct.getValue()){
			// send to correct page
			message = "You have broken the Doctors code!  Enter the Tardis.  It took you" + guesses.getValue() + " guesses.";
			url = "/winner.jsp";
		}else{
			//trying again
			guesses.increment();
			if(guess.getValue() < correct.getValue()){
				message = "Wrong!  Guess higher.";
			}else{
				message = "Wrong!  Guess lower.";
			}
		}
		request.setAttribute("message", message);
		request.setAttribute("guesses", guesses);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
