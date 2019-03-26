package ueb01;

public class CharElement {
    char value;
    CharElement next;
    CharElement(char c, CharElement n){
        this.value = c;
        this.next = n;
    }
    public CharElement getNext(){
        return this.next;
    }
    public char getValue()
    {
        return this.value;
    }
}
