package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private CharElement top;
    public int size = 0;
    @Override
    public void push(char c) {
            top = new CharElement(c, top);
            size++;
    }

    @Override
    public char pop() {
        if (top == null)
            throw new NoSuchElementException();

        char c = top.getValue();
        top = top.getNext();
        size--;
        return c;
    }
    @Override
    public int size()
    {
        return size;
    }
}
