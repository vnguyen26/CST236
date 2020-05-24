/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();
}
