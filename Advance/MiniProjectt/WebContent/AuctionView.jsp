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
AuctionDAO ad=new AuctionDAO();
List<Auction> li=ad.getAllAuctions();
%>
<table>
<tr>
<th>Auc_id</th>
<th>Player_id</th>
<th>Team_id</th>
<th>Year1</th>
<th>Sold_price</th>
</tr>
<%
for(Auction a:li){
%>
<tr>
<td><%=a.getAuc_id() %></td>
<td><%=a.getPlayer_id() %></td>
<td><%=a.getTeam_id() %></td>
<td><%=a.getYear1() %></td>
<td><%=a.getSold_price() %></td>
</tr>
<%} %>
</table>

</body>
</html>