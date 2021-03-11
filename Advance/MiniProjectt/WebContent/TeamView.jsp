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
TeamDAO td=new TeamDAO();
List<Team> li=td.getAllTeams();
%>
<table>
<tr>
<th>TeamId</th>
<th>Teamname</th>
<th>Ownername</th>
<th>Coachname</th>
<th>Captain_id</th>>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%=t.getTeam_id() %></td>
<td><%=t.getTeamname() %></td>
<td><%=t.getOwnername() %></td>
<td><%=t.getCoachname() %></td>
<td><%=t.getCaptain_id() %></td>
</tr>
<%} %>
</table>
</body>
</html>