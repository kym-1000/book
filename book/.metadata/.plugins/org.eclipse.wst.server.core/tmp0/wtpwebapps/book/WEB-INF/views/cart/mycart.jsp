<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		
		*{
			margin: auto;
			padding: 0;
		}	
		
		#cart{
			margin-left: 200px;
			margin-right: 200px;
			text-align: center;
			align-items : center;
		}
		
		

	</style>
</head>
<body>

	<jsp:include page="../cart/cartheader.jsp"></jsp:include>
	
	
	<h2 style="text-align: center;">장바구니임</h2>
	
	<div id="cart">
<form action="/cart/ShippingInformation?mn=2" method="post">
	<div id="cart">	
		<table  border="1" id="table">
			<caption >
		      배송상품!
		    </caption> 
			<thead>
		      <tr>
			      <th >장바구니번호</th> 
			      <th >회원번호</th> 
			      <th >책이름</th> 
			      <th >수량</th>
			      <th >상품금액</th> 
			      <th >작가명</th> 
		      </tr>
		     </thead> 
		      <tbody>
			    <c:forEach items="${Clist}" var="cvo">
				    <tr >
				      <th >${cvo.cart_num}</th> 
				      <th >${cvo.cart_mem_num}</th> <!-- 회원번호를 가져와서 배송정보 페이지에서 조인해서 정보를 가져오기 -->
				      <th >${cvo.cart_book_name}</th>
				      <th >${cvo.cart_amount}</th> 
				      <th >${cvo.cart_price}</th>
				      <th >${cvo.cart_writer}</th> 
				    </tr>
			    </c:forEach>
		      </tbody>
		      
		</table>
	</div>
	
	<button type="submit" id="btn" >주문</button>
	
</form>

</div>

</body>
</html>