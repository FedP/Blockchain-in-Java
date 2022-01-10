import java.util.Arrays;

public class Block {
	
	private String[] transactions; // List of transactions
	private int blockHash; // value for hash
	private int previousBlockHash; // hash of the previous hash
	
	// Generate a toString method
	@Override
	public String toString() {
		return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash
				+ ", previousBlockHash=" + previousBlockHash + "]";
	}

	//Let's generate a constructor automatically with Fields with only 2 parameteres
	public Block(String[] transactions, int previousBlockHash) {
		super(); //The super keyword in Java is a reference variable that is used to refer parent class objects.
		this.transactions = transactions;
		this.previousBlockHash = previousBlockHash;
		this.blockHash = Arrays.hashCode(
				new int[] { Arrays.hashCode(transactions), this.previousBlockHash}
				);
	}
	
	// This was generated using getter and setter
		public String[] getTransactions() {
			return transactions;
		}
	
	public void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}
	
	public int getBlockHash() {
		return blockHash;
	}
	
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	
	
	
}
