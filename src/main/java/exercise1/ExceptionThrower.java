package exercise1;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) throws RuntimeException{
		if(value == 42) {
			throw new RuntimeException();
		}
	}
}
