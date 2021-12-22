<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="../header.jsp"%>


	<div class="container">
		<table class="table">


			<%
			URL url = new URL(
					"https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=300&serviceKey=1LB54yX2%2BHgedpJ5WPtUlCgis3Wj3ulEoeJorsRTkrxmbfRPO21aodfkeLX%2BJ5UUM8nOZdSDoY18dKpdd6shAA%3D%3D");

			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			String result = bf.readLine();
			//System.out.println("url 내 문서 스트림 이용한 호출" + result);

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(result);
			//System.out.println("url 내용을 json 변환" + jsonObject);

			JSONArray jsonArray = (JSONArray) jsonObject.get("data");
			//System.out.println("data 키 호출해서 배열 담기" + jsonArray);

			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject contents = (JSONObject) jsonArray.get(i);
				//System.out.println(contents);
			%>



			<tr>
				<td><%=contents.get("facilityName")%></td>
				<td><%=contents.get("address")%></td>
				<td><%=contents.get("phoneNumber")%></td>
				<td><button id="btnmap" onclick="map(<%=i%> , <%=contents.get("lat")%> , <%=contents.get("lng")%>)">지도보기</button></td>
			</tr>
			<tr>
				<td id="mapimg" colspan="5">
					<!-- 지도를 표시할 div 입니다 -->
					<div id="map<%=i%>" style="width: 100%; height: 350px;"></div>
					
				</td>
			</tr>

			<%
			}
			%>
		</table>
	</div>

</body>
</html>