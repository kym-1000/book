package com.ezen.book.repository;

import java.util.List;

import com.ezen.book.domain.CartVO;
import com.ezen.book.domain.MemberVO;
import com.ezen.book.domain.BookVO;
import com.ezen.book.domain.CartDTO;

public interface CartDAO {

	MemberVO selectmemberONE(int mn);

	BookVO getBook(int bn);

	List<CartVO> CartList(int mn);

	int addCartBook(CartDTO cdo);

	int updateCart(CartDTO cdo);

	CartVO selectCart(CartDTO cdo);

	int totalSum(int mn);

	

	

	

}
