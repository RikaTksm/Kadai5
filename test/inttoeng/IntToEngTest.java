package inttoeng;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntToEngTest {

		@Test
		public void ‚ ‚O‚©‚ç‚X‚Ü‚Å(){
				IntToEng ite= new IntToEng();
				String expected0="zero";
				String expected1="one";
				String expected2="two";
				String expected3="three";
				String expected4="four";
				String expected5="five";
				String expected6="six";
				String expected7="seven";
				String expected8="eight";
				String expected9="nine";
				
				
				String actual0=ite.translateEng(0);
				String actual1=ite.translateEng(1);
				String actual2=ite.translateEng(2);
				String actual3=ite.translateEng(3);
				String actual4=ite.translateEng(4);
				String actual5=ite.translateEng(5);
				String actual6=ite.translateEng(6);
				String actual7=ite.translateEng(7);
				String actual8=ite.translateEng(8);
				String actual9=ite.translateEng(9);
				
				
				assertEquals(actual0,expected0);
				assertEquals(actual1,expected1);
				assertEquals(actual2,expected2);
				assertEquals(actual3,expected3);
				assertEquals(actual4,expected4);
				assertEquals(actual5,expected5);
				assertEquals(actual6,expected6);
				assertEquals(actual7,expected7);
				assertEquals(actual8,expected8);
				assertEquals(actual9,expected9);
				
		}
	}
