package stack.and.queue;

public class PseudoQueue<T> {
   private Stack stackOne;
   private Stack stackHelper;

    public PseudoQueue() {
        this.stackOne = new Stack();
        this.stackHelper = new Stack();
    }

    public void enqueue(T value){
        try {
            while (!stackOne.isEmpty()){
                stackHelper.push(stackOne.pop());
            }
            stackOne.push(value);
            while (!stackHelper.isEmpty()){
                stackOne.push(stackHelper.pop());
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public <T> T dequeue(){
        T tempData = null;
        if (stackOne.top == null && stackOne.top == null) {
            return null;
        }
        if (stackOne.top != null) {
            while (stackOne.top != null) {
                stackHelper.push(stackOne.pop());
            }
            tempData = (T) stackHelper.pop();
            while (stackHelper.top != null) {
                stackOne.push(stackHelper.pop());
            }
        }
        return tempData;
    }

    @Override
    public String toString() {
        Node current = stackOne.top;
        String result = "front -> ";
        while (current != null) {
            result += "{ " + current.value + " } -> ";
            current = current.next;
        }
        return result + "Null";
    }

    public Stack getStackQueue() {
        return stackOne;
    }

    public void setStackOne(Stack stackOne) {
        this.stackOne = stackOne;
    }

    public Stack getStackHelper() {
        return stackHelper;
    }

    public void setStackHelper(Stack stackHelper) {
        this.stackHelper = stackHelper;
    }

}

