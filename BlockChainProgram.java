import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// demonstrate a hash function
		String statement1 = "My world is almost blue";
		int hashvalue = statement1.hashCode();
		
		System.out.println("Statement = " + statement1 + " whose has value = " + hashvalue);
		
		// let's has an array
		
		String [] list1 = {"alex", "becky", "cyril"};
		String [] list2 = {"alex", "becky", "cyril"};
		
		int hash1 = Arrays.hashCode(list1);
		int hash2 = Arrays.hashCode(list2);
		
		System.out.println("hash1 = " + hash1 + " hash2 = " + hash2);
		
		// let's has an array

		String [] list3 = {"alex", "becky", "cyril"};
		String [] list4 = {"alex", "becky", "pen"};
		
		int hash3 = Arrays.hashCode(list3);
		int hash4 = Arrays.hashCode(list4);
		
		System.out.println("hash3 = " + hash3 + " hash4 = " + hash4);
		
		// demonstrate a series of blocks in a chain
		ArrayList<Block> blockChain = new ArrayList<Block>();
		
		String[] initialValues = {"Shad has 700$","Miguel has 440$"};
		
		Block firstBlock = new Block(initialValues, 0);
		
		blockChain.add(firstBlock);
		
		System.out.println("First block is " + firstBlock.toString());
		System.out.println("The blockchain is " + blockChain.toString());
		// -2097267470
		
		String[] ShadGivesItAway = {"Shad gives Tim 100$ ","Shad gives Pam 200$", "Shad gives Dan 300$"};
		
		Block secondBlock = new Block(ShadGivesItAway, firstBlock.getBlockHash());
		
		blockChain.add(secondBlock);
		
		System.out.println("Second block is " + secondBlock.toString());
		System.out.println("The blockchain is " + blockChain.toString());
		// blockHash=-1592805269
		
		String[] ShadGetSomeBack = {"Tim gives Shad 100$ ","Pam gives Shad 50$"};
		
		Block thirdBlock = new Block(ShadGetSomeBack, secondBlock.getBlockHash());
		
		blockChain.add(thirdBlock);
		
		System.out.println("Third block is " + thirdBlock.toString());
		System.out.println("The blockchain is " + blockChain.toString());
		// blockHash=-2062146445

	}

}
