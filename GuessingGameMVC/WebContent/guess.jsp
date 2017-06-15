<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Game" %>

<%
String guessIt = request.getParameter("guess");
Game guess = new Game(Integer.parseInt(guessIt));

String minGuess = request.getParameter("minimum");
Game minimum = new Game(Integer.parseInt(minGuess));

String maxGuess = request.getParameter("maximum");
Game maximum = new Game(Integer.parseInt(maxGuess));

String correctGuess = request.getParameter("correct");
Game correct = new Game(Integer.parseInt(correctGuess));

Game guesses = new Game(Integer.parseInt(request.getParameter("guesses")));

String message = "";

if(guess.getValue() == correct.getValue()){
	message = "You have cracked the Doctors code!  Enter the Tardis";
}else{
	guesses.increment();
	if(guess.getValue() < correct.getValue()){
		message = "Wrong!  You crazy sidekick!  Guess higher.";	
	}else{
		message = "Wrong!  Let's try that again!  Guess lower.";
	}
}
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Break the Doctors Code</title>
</head>
<body>

<h1> Break the Doctors Code</h1>

<p><%= message %></p>

<%
if(guess.getValue() == correct.getValue()){
%>
	<a href="index.jsp">Play Again!</a>
<%}else{
	%>
	<form name="putYourGuess" action="doGuess" method="post">
<label>
	Guess the code try number: <%= guesses.getValue() %>
</label>
<input type="text" name="code" /><br />
<input type="submit" name="submit" value="Crack The Code">

<input type="hidden" name="correct" value="<%=correct.getValue() %>" />
<input type="hidden" name="guesses" value="<%=guesses.getValue() %>" />
<input type="hidden" name="minimum" value="<%=minimum %>" />
<input type="hidden" name="maximum" value="<%=maximum %>" />

</form>

<%
}
%>



</body>
</html>