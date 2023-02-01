public class BSTIterator {
    
        Stack<TreeNode> stack =  new Stack<>() ;            
        TreeNode current = null ;
        public BSTIterator(TreeNode root) {
        	  current = root;
        }
    	public int next(){
    		while (current != null){
    			stack.push(current);
    			current =current.left;
    		}		
    		TreeNode t = stack.pop();		
    		current = t.right ;		
    		return t.val ;
        }
        public boolean hasNext(){
            return !stack.isEmpty() || current!=null;
        }
    }
