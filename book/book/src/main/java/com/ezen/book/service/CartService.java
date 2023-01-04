package com.ezen.book.service;

import java.util.List;

import com.ezen.book.domain.CartVO;
import com.ezen.book.domain.MemberVO;
import com.ezen.book.domain.BookVO;
import com.ezen.book.domain.CartDTO;

public interface CartService {

	MemberVO getDetailmember(int mn);

	BookVO getCartBook(int bn);

	List<CartVO> getCartList(int mn);

	int addCart(CartDTO cdo);

	int updateCart(CartDTO cdo);

	CartVO getCart(CartDTO cdo);

	int totalSum(int mn);

	

	

	



	

}
