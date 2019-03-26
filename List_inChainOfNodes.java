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
      String s = "[";

      while (holdReference != null) {
        s += holdReference.getCargoReference() + ",";
	holdReference = holdReference.getReferenceToNextNode();
      }

      s += "]";

      return s;
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

     public boolean add (int index, Object val) {

	Node holdReference = headReference;
	int currentIndex = 0;
	
	while (currentIndex < index && holdReference != null) {
	    holdReference = holdReference.getReferenceToNextNode();
	    currentIndex++;
	}

	
     }
}
