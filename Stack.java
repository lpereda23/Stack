//Here the interface abstracts the item to any type

public interface Stack <Item> extends Iterable <Item>{
    // Return the top node and remves it from the stack
    Item pop();

    //adds a node to the stack
    void push(Item Item);

    //returns true if stack is empty else false
    boolean isEmpty();

    //returns items in stack at this point
    int size();

}