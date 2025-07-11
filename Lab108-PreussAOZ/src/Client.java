
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author August Preuss
 * @version 4/12/2025
 * Takes expression from a file and solves them, or prints invalid if they aren't true expressions
 * 
 */
public class Client {

    
    public static void main(String[] args)  {
        
        //find data.txt file that contains algorithms we need
        
        //we make plenty of objects for all of the stacks and queues we need in the algorithms
        Scanner scan = new Scanner(System.in);
        File file;
        
        LinkedStack treeStack;
        LinkedQueue temp;
        LinkedStack bottomDoubles;
        LinkedStack bottom;
        LinkedQueue rightSide;
        LinkedQueue leftSide;
        
        
        System.out.println("Please enter the absolute path to the file.");
        
        String fileName = scan.next();
        
        file = new File(fileName);
        
        
        //scan through the file
       try{
        Scanner fileScan = new Scanner(file);
        
        
        //goes line by line in the file
        while(fileScan.hasNextLine()){
            
            //makes a new object for each new line
            treeStack = new LinkedStack();
            temp = new LinkedQueue();
            bottomDoubles = new LinkedStack();
            bottom = new LinkedStack();
            rightSide = new LinkedQueue();
            leftSide = new LinkedQueue();
                   
            String line = fileScan.nextLine();
            
            //checks if line is blank, if it is we can skip through that line
            if(line.trim().isEmpty()){
                continue;
            }
            
            //simple flag variable to check if expression is valid
            boolean isValid = true;
            
            //prints out the line we are going to check through
            System.out.println("Infix: " + line);
            
            Scanner lineReader = new Scanner(line); 
            
            //we are now going to scan each individual token in the line
            while(lineReader.hasNext()){
                
                
                //we check each token
                String value = lineReader.next();
                
                //checks if the value is valid, AKA an operator or operand
                if(!isValidToken(value)){
                    System.out.println("Invalid expression");
                    isValid = false;
                    break;
                }
                
                //this takes each value in the line and sees what case it falls under
                //shunting yard algorithm
                switch(value) {
                    
                    //if its an operator we will test its level of precedence in the expression
                    case "+": case "-": case "*": case"/": 
                        while (!bottom.isEmpty() && isOperator((String) bottom.top()) && precedence((String) bottom.top()) >= precedence(value)) {
                            leftSide.enqueue(bottom.pop());
                        }
                        //add it to our bottom stack
                        bottom.push(value);
                        break;
                    
                    //we bring all the types of parenthese in the stack
                    case "(": case "{": case "[":
                        bottom.push(value);
                        break;
                    
                    //for each closing parentheses we make sure it has a match, each "parenthese" uses this formula described below
                    case ")":
                        //if stack is empty then expression is invalid so no match
                        if(bottom.isEmpty()){
                            isValid = false;
                            break;
                        }
                        //we add all the other numbers and operators to the left until we find the opening parentheses or the stack is empty
                        while(!bottom.top().equals("(") && !bottom.isEmpty()){
                            leftSide.enqueue(bottom.pop());
                        }
                        //when we reach end of stack and there is no match then we know expression isn't valid
                        if(bottom.isEmpty() || !bottom.top().equals("(")){
                            isValid = false;
                            break;
                        }
                        
                        bottom.pop();
                        break;
                        
                    case "]": 
                        if(bottom.isEmpty()){
                            isValid = false;
                            break;
                        }
                        
                        while(!bottom.top().equals("[") && !bottom.isEmpty()){
                            leftSide.enqueue(bottom.pop());
                        }
                        if(bottom.isEmpty() || !bottom.top().equals("[")){
                            isValid = false;
                            break;
                        }
                        
                        bottom.pop();
                        break;
                        
                    case "}": 
                        if(bottom.isEmpty()){
                            isValid = false;
                            break;
                        }
                        
                        while(!bottom.top().equals("{") && !bottom.isEmpty()){
                            leftSide.enqueue(bottom.pop());
                        }
                        if(bottom.isEmpty() || !bottom.top().equals("{")){
                            isValid = false;
                            break;
                        }
                        
                        bottom.pop();
                        break;
                    
                    //if its not an operator than it must be an operand so we add it to the left queue
                    default:
                        leftSide.enqueue(value);
                        break;        
                }
                //checks if our flag variable is now false, so we can move onto the next expression
                if(!isValid){
                        System.out.println("Invalid expression");
                        break;
                    }
                    
             
            }
                //same check as before
                if(!isValid){
                    System.out.println("Invalid expression");
                    continue;
                }
                //we move any extra things in the bottom stack onto the left queue before continuing
                while(!bottom.isEmpty()) {
                    leftSide.enqueue(bottom.pop());
                }
                
                //we now make two copy queues so we dont mess any data up
                System.out.print("Postfix: " );
                LinkedQueue copyForTree = new LinkedQueue();
                LinkedQueue copyForEval = new LinkedQueue();
                //we printout the postfix expression which is what the leftside queue represents
                while(!leftSide.isEmpty()){
                    Object item = leftSide.dequeue();
                    System.out.print(item + " ");
                    copyForTree.enqueue(item);
                    copyForEval.enqueue(item);
                }
                System.out.println();
                
                
                //now we begin to evaluate the expression
                while(!copyForEval.isEmpty()){
                    String token = (String) copyForEval.dequeue();
                    
                    if(isOperator(token)){
                        //checks if there is less than 2 numbers because then there is nothing to evaluate making the expression invalid
                        if(bottomDoubles.size() < 2){
                            isValid = false;
                            break;
                        }
                        //we pop the two top numbers from the top of the bottom stack that converts the strings into doubles
                        double num2 = (double) bottomDoubles.pop();
                        double num1 = (double) bottomDoubles.pop();
                        
                        double result = 0;
                        //depending on the operator we do that given calculation
                        switch(token){
                            case "+":
                                result = num1 + num2;
                                break;
                            
                            case "-": 
                                result = num1 - num2;
                                break;
                            
                            case "*":
                                result = num1 * num2;
                                break;
                               
                            case "/":
                                result = num1 / num2;
                                break;
                        }
                        //result gets put back into the bottom stack
                        bottomDoubles.push(result);
                    }
                    //check to make sure the bottom stack is strictly numbers
                    else{
                        try{
                        bottomDoubles.push(Double.parseDouble(token));
                        }
                        catch(NumberFormatException nfe){
                            isValid = false;
                            break;
                        }
                    }
                    
                    
            }
                
                
                    //now we are building the binary expression tree
                    while(!copyForTree.isEmpty()){
                        String token = (String) copyForTree.dequeue();
                        //creates a new root if the token is not an operator
                        //then pushes it onto the treeStack
                        if(!isOperator(token)){
                            LinkedBinaryTree<String> node = new LinkedBinaryTree();
                            node.addRoot(token);
                            treeStack.push(node);
                        }
                        //if we find an operator we will attack it with the left and right nodes
                        //checks if treeStack is less than 2 because then we can't make a complete tree
                        else{
                            if(treeStack.size() < 2){
                                isValid = false;
                                break;
                            }
                            
                            //make a right and left child
                            LinkedBinaryTree<String> right = (LinkedBinaryTree<String>) treeStack.pop();
                            LinkedBinaryTree<String> left = (LinkedBinaryTree<String>) treeStack.pop();
                            
                            //attach left and right child to the newTree and the root is the operator
                            LinkedBinaryTree<String> newTree = new LinkedBinaryTree();
                            Position<String> root = newTree.addRoot(token);
                            newTree.attach(root, left, right);
                            
                            treeStack.push(newTree);
                        }
                    }
                    //checks if treeStack is empty or not
                    LinkedBinaryTree<String> expressionTree = null;
                    if(!treeStack.isEmpty()){
                        expressionTree = (LinkedBinaryTree<String>) treeStack.pop();
                    }
                    //final check to see if expression is valid
                    if(!isValid || bottomDoubles.size() != 1){
                        System.out.println("Invalid expression");
                        continue;
                    }
                    else{
                        System.out.println("The result of the expression is: " + bottomDoubles.pop());
                    }
                    
            //if our tree isn't null we do all of the traversals        
            if(expressionTree != null){
                
            System.out.print("Preorder Traversal: ");
        for(Position p : expressionTree.preorder()){
            System.out.print(p.getElement() + " ");
        }
       
        System.out.println();
        
        System.out.print("Inorder Traversal: ");
        for (Position p : expressionTree.inorder()){
            System.out.print(p.getElement() + " ");
        }
        
        
        System.out.println();
        
        System.out.print("Postorder Traversal: ");
        for (Position p : expressionTree.postorder()){
            System.out.print(p.getElement() + " ");
        }
        
        System.out.println();
        
        System.out.print("Euler Tour Expression: ");
        expressionTree.eulerTourBinary(expressionTree, expressionTree.root());
        System.out.println();
    
            
            
            }  
            
        
        }
        
        
        
       }
       catch(FileNotFoundException fnef){
           System.out.println("File couldn't be found");
       }
       catch(Exception e){
           System.out.println("Invalid expression");
       }
        
    
    
    }
    /**
     * Assigns a value for higher precedence operators
     * @param op represents an operator
     * @return an int value depending on how priority an operator is
     */
    private static int precedence(String op) {
            switch (op) {
                case "+": case "-":
                    return 1;
                case "*": case "/":
                    return 2;
                default:
                    return 0;
            }
        }
    
    /**
     * Checks if a token is an operator
     * @param value represents a token from scanning an expression
     * @return true or false, if it's an operator or not
     */
    private static boolean isOperator(String value){
            return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
        }
    
    /**
     * checks if something in the expression is a valid number or operator
     * @param token represents a token from scanning an expression
     * @return true if it's an operator, parentheses, or number
     */
    private static boolean isValidToken(String token){
        return isOperator(token) || token.equals("(") || token.equals(")") ||
               token.equals("{") || token.equals("}") || token.equals("[") || token.equals("]") || isNumeric(token);
    }
    
    /**
     * checks if a token in the expression is a number
     * @param numb is the token we think is a number
     * @return true if it can be converted to a double, false if otherwise
     */
    private static boolean isNumeric(String numb){
        try{
        Double.parseDouble(numb);
        return true;
        } catch(NumberFormatException nfe){
            return false;
        }
    }
    
}
