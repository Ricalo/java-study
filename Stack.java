public class Stack {
    ListElement head = null;

    public int pop() {
        if(head == null) {
            throw new NullPointerException("The stack is empty");
        } else {
	    int temp = head.data;
	    head = head.next;
	    return temp;
	}
    }

    public void push(int data) {
        ListElement newElement = new ListElement();
	newElement.data = data;

	newElement.next = head;
	head = newElement;
    }

    @Override
    public String toString() {
	ListElement current = head;
	String returnValue = "";
        while(current != null) {
            returnValue = returnValue + current.data + "\n";
	    current = current.next;
	}

	return returnValue;
    }
}
