package dllutil;

public class DlNode {
  public int data;
  public DlNode prev;
  public DlNode next;

  public DlNode(int data, DlNode prev, DlNode next) {
	this.data = data;
	this.prev = prev;
	this.next = next;

	if(prev != null) {
	  prev.next = this;
	}
	if(next != null) {
	  next.prev = this;
	}
  }
  public DlNode(int data, DlNode prev) {
	this.data = data;
	this.prev = prev;
	this.next = null;

	if(prev != null) {
	  prev.next = this;
	}
  }
  public DlNode (int data) {
	this.data = data;
	this.prev = null;
	this.next = null;
  }
}
