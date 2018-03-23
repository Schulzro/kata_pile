import org.junit.Test;

import javax.naming.SizeLimitExceededException;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void should_init_stack_size_with_init_size() throws Exception {
        int initSize = 50;
        Stack<Object> myStack = new Stack(initSize);
        assertEquals(myStack.size(), initSize);
    }

    @Test
    public void should_push_top_element() throws Exception {
        Stack<String> myStack = new Stack();
        int initLength = myStack.size();
        myStack.push("foo");
        assertEquals(myStack.size(), initLength + 1);
    }

    @Test(expected = SizeLimitExceededException.class)
    public void should_throw_exception_on_push_when_stack_sized_exceeded() throws Exception {
        Stack<String> myStack = new Stack(2);
        myStack.push("foo");
        myStack.push("bar");
        myStack.push("lorem");
    }

    @Test
    public void should_pop_top_element() throws Exception {
    }


    @Test
    public void should_throw_expection_on_pop_empty_list() throws Exception {
    }
}
