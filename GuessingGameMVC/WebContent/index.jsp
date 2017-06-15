<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.Game" %>
    <%
    int minimum = 100;
    int maximum = 999;
    
    Game correct = new Game();
    correct.setRandom(minimum, maximum);
    
    Game guesses = new Game(0);
      %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find the Doctors Password</title>
</head>
<body>
<h1>Find the Doctors Password</h1>

<p> Try and break the Doctors Code!</p>

<p> Pick a 3 digit number to break the code! </p>

<form name="putYourGuess" action="doGuess" method="post">
<label>
Guess the code:
</label>
<input type="text" name="code" /><br />
<input type="submit" name="submit" value="Crack The Code">

<input type="hidden" name="correct" value="<%=correct.getValue() %>" />
<input type="hidden" name="guesses" value="<%=guesses.getValue() %>" />
<input type="hidden" name="minimum" value="<%=minimum %>" />
<input type="hidden" name="maximum" value="<%=maximum %>" />

</form>


</body>
</html>