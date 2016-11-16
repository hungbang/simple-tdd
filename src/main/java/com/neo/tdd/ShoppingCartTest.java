/**
 * 
 */
package com.neo.tdd;

import org.junit.Assert;
import org.junit.Test;

import com.neo.tdd.vo.CartVO;

/**
 * @author Dell
 *
 */
public class ShoppingCartTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	//I want create test case for create 1 empty shopping cart : number product in shopping cart should is 0
	@Test
	public void testCreateEmptyShoppingCart(){
		CartVO cartVO = new CartVO();
		Assert.assertEquals(0, cartVO.getQuantity());
	}
	
	
	//Case 2: add 1 product to shopping cart with quantity is : 30, unit price is 25.0 $.
	@Test
	public void testAddProductToShoppingCart(){
		CartVO cartVO = new CartVO();
		cartVO.setNameProduct("CocaCola");
		cartVO.setQuantity(30);
		cartVO.setUnitPrice("25.0");
		Assert.assertEquals(30, cartVO.getQuantity());
	}
	
	
	
}
