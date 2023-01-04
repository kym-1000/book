package com.ezen.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartVO {
	private int cart_num;
	private int cart_price;     
	private int cart_mem_num;   
	private int cart_amount;   
	private String cart_writer;    
	private String cart_book_name;
}
