/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     public List_inChainOfNodes() {
     }

    /**
      @return the number of elements in this list
     */
    public int size() {
      Node holdReference = headReference;
      int size = 0;

      while (holdReference != null) {
        size++;
        holdReference = holdReference.getReferenceToNextNode();
      }

      return size;
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
      Node holdReference = headReference;
      String s = size() + "[";

      while (holdReference != null) {
        s += (String) holdReference.getCargoReference() + ",";
	      holdReference = holdReference.getReferenceToNextNode();
      }

      s += "]";

      return s;
    }

    public Object set (int index, Object val) {

      int curr = 0;
      Node holdReference = headReference;

      while (curr < index && holdReference != null) {
        curr++;
        holdReference = holdReference.getReferenceToNextNode();
      }


      Object old = holdReference.getCargoReference();
      holdReference.setCargoReference(val);

      return old;
    }

    public Object get (int index) {

      int curr = 0;
      Node holdReference = headReference;

      while (curr < index && holdReference != null) {
        curr++;
        holdReference = holdReference.getReferenceToNextNode();
      }

      return holdReference.getCargoReference();
    }

    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	Node holdReference = headReference;
	headReference = new Node(val);
	headReference.setReferenceToNextNode(holdReference);

        return true;
     }
}
