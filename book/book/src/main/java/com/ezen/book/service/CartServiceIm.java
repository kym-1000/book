package com.ezen.book.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ezen.book.domain.CartVO;
import com.ezen.book.domain.MemberVO;
import com.ezen.book.domain.BookVO;
import com.ezen.book.domain.CartDTO;
import com.ezen.book.repository.CartDAO;

@Service
public class CartServiceIm implements CartService {
	
	
	@Inject
	private CartDAO cdao;

	@Override
	public MemberVO getDetailmember(int mn) {
		// TODO Auto-generated method stub
		return cdao.selectmemberONE(mn);
	}

	@Override
	public BookVO getCartBook(int bn) {
		// TODO Auto-generated method stub
		return cdao.getBook(bn);
	}

	@Override
	public List<CartVO> getCartList(int mn) {
		// TODO Auto-generated method stub
		return cdao.CartList(mn);
	}

	@Override
	public int addCart(CartDTO cdo) {
		// TODO Auto-generated method stub
		return cdao.addCartBook(cdo);
	}

	@Override
	public int updateCart(CartDTO cdo) {
		// TODO Auto-generated method stub
		return cdao.updateCart(cdo);
	}

	@Override
	public CartVO getCart(CartDTO cdo) {
		// TODO Auto-generated method stub
		return cdao.selectCart(cdo);
	}

	@Override
	public int totalSum(int mn) {
		// TODO Auto-generated method stub
		return cdao.totalSum(mn);
	}

	

	

	

	
	

}
