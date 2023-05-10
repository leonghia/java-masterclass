# Section 16: Basic Input and Ouput including java.util

There are two main approaches to dealing with errors when programming. They're often referred to as **LBYL** (Look before you leap) and **EAFP** (Easy to ask for forgiveness than permission).

Example of LBYL:

```java
private static int divideLBYL(int x, int y) {
	if (y != 0) {
		return x / y;
	}
	return 0;
}
```

EAFP is to go ahead and perform the operation then respond to an exception if something goes wrong. Example of EAFP:

```java
private static int divideEAFP(int x, int y) {
	try {
		return x / y;
	} catch (ArithmeticException e) {
		return 0;
	}
}
```

