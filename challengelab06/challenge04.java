package challengelab06;
class BankError extends Exception {
    BankError(String message) {
        super(message);
    }
}

class InsufficientFundsError extends BankError {
    InsufficientFundsError() {
        super("Insufficient Funds!");
    }
}

class AccountNotFoundError extends BankError {
    AccountNotFoundError() {
        super("Account Not Found!");
    }
}

class CurrencyMismatchError extends BankError {
    CurrencyMismatchError() {
        super("Currency Mismatch!");
    }
}
public class challenge04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new InsufficientFundsError();
		}catch(BankError e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new AccountNotFoundError();
		}catch(BankError e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new CurrencyMismatchError();
		}catch(BankError e) {
			System.out.println(e.getMessage());
		}

	}

}
