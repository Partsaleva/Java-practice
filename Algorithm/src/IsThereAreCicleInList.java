
public class IsThereAreCicleInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static<T> boolean checkForCicle(Node<T> list){
		if (list==null) {
			return false;
		}
		Node<T> turtle, rabbit;
		turtle=rabbit=list;
		while(rabbit.getNext() != null || rabbit.getNext().getNext() != null) {			
			if (rabbit.getNext()== turtle || rabbit.getNext().getNext()==turtle) {
				return true;
			}
			turtle=turtle.getNext();
			rabbit=rabbit.getNext().getNext();
		}
		return false;
		}
}

class Node<T>{
	private T data;
	private Node<T> next;
	
	public Node(T data,Node<T> next){
		this.data=data;
		this.next=next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}