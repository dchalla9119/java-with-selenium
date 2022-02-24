package oops_Concept;


@FunctionalInterface
interface Fi
{
	void hello();//by default this method becomes public abstract
	//void hello1();we are using @FunctionalInterface so we have to use only one method, otherwise we will get error. we can have any no of implementations
	default void demo() {
		System.out.println("demo");
	}
	default void demo1() {
		System.out.println("demo1");
	}
}
public class FunctionalInterfaceTest {
public static void main(String[] args) {

}
}
