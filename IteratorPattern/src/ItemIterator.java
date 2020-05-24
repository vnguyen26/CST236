/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public interface ItemIterator<T> {
     
    boolean hasNext();
     
    T next();
}