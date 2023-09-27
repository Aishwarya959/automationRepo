package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority=0)
  public void f() {
	  System.out.println("f");
  }
  @Test
  public void g() {
	  System.out.println("g");

  }
  @Test(priority=7)
  public void h() {
	  System.out.println("h");

  }
  @Test(priority=4)
  public void i() {
	  System.out.println("i");

  }
  @Test(priority=7)
  public void a() {
	  System.out.println("a");

  }
  @Test(priority=5)
  public void r() {
	  System.out.println("r");

  }
  @Test(priority=2)
  public void q() {
	  System.out.println("q");

  }
  @Test(priority=8)
  public void w() {
	  System.out.println("w");

  }
  @Test
  public void z() {
	  System.out.println("z");

  }
}
