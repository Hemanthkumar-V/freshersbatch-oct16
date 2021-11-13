package ExceptionHandling;

public class IlligalBankTransactionException extends Exception{

	
		public String getMessage() {
			return "IllegalBankTransactionException! try again";
		}
	}

