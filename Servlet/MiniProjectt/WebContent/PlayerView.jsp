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
PlayerDAO pd=new PlayerDAO();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player_ID</th>
<th>Player_Name</th>
<th>Player_DOB</th>
<th>Player_skills</th>
<th>Player_Runs</th>
<th>Player_wickets</th>
<th>Player_numberofmatches</th>
<th>teamid</th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getName() %></td>
<td><%=p.getDate() %></td>
<td><%=p.getSkills() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getNumber_of_matches() %></td>
<td><%=p.getTeam_id() %></td>
<td><a href="playeredit.jsp?id=<%=p.getPlayer_id()%>"><button>UPDATE</button></a></td>
</tr>
<%} %>
</table>

</body>
</html>