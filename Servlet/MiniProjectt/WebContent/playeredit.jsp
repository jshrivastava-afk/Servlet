<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.modal.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
PlayerDAO pd=new PlayerDAO();
Player p=pd.getPlayerById(id);
%>
<form action="./PlayerUpdate" method="post">
Update Player_ID: <input type="text" value="<%=p.getPlayer_id()%>" name="Player_ID"><br><br>
Update Player_Name: <input type="text" value="<%=p.getName()%>" name="Player_Name"><br><br>
Update Player_DOB: <input type="text" value="<%=p.getDate()%>" name="Player_DOB"><br><br>
Update Player_skills: <input type="text" value="<%=p.getSkills()  %>" name="Player_skills"><br><br>
Update Player_Runs: <input type="text" value="<%=p.getRuns()  %>" name="Player_skills"><br><br>
Update Player_WIckets: <input type="text" value="<%=p.getWickets()  %>" name="Player_skills"><br><br>
Update Player_No_Matches: <input type="text" value="<%=p.getNumber_of_matches()  %>" name="Player_skills"><br><br>
Update teamid: <input type="text" value="<%=p.getTeam_id()%>" name="teamid"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>