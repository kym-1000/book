package com.ezen.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberVO {

   private int mem_num;
   private String mem_id;
   private String mem_pw;
   private String mem_ad;
   private int mem_age;
   private int mem_gender;
   private int mem_cash;
   private String mem_cell_num;
   private int mno_cno;
   private String mem_date;
   private String mem_rating;
   private String mem_auth;
   private String mem_sum;
   private String mem_cartNum;
   private String mem_name;
   
}