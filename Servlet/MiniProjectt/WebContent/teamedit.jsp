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
int t_id=Integer.parseInt(request.getParameter("t_id"));
TeamDAO td=new TeamDAO();
Team t=td.getTeamById(t_id);
%>
<form action="./TeamUpdate" method="post">
Update Team_Id: <input type="text" value="<%=t.getTeamname()%>" name="Teamid"><br><br>
Update Team_Name: <input type="text" value="<%=t.getTeamname()%>" name="Teamname"><br><br>
Update Ownername: <input type="text" value="<%=t.getOwnername()%>" name="Ownername"><br><br>
Update Coachname: <input type="text" value="<%=t.getCoachname()%>" name="Coachname	"><br><br>
Update Captain_id: <input type="text" value="<%=t.getCaptain_id()  %>" name="Captain_id"><br><br>
<input type="submit" value="Update Team">

</form>
</body>
</html>