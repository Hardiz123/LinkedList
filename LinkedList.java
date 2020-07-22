public class LinkedList {
    private int size;
    private Node start;

    public  LinkedList() {
        size =0;
        start = null;
    }
    public void insertAtFirst(int val) {
        Node n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }
    public void insertAtLast(int val) {
        Node n,t;
        n = new Node();
        n.setData(val);
        t = start;
        if(t==null){
            start=n;
        }else{
            while(t.getNext()!=null)
            {
                t=t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }

    public void insertAtpos(int val , int pos) {
        if(pos==1){
            insertAtFirst(val);
        }else if(pos==size+1){
            insertAtLast(val);
        }else if(pos>1 && pos<=size){
            Node n = new Node(val,null);
            Node t;
            t= start;
            for(int i=1;i<=pos-1;i++){
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }
        }else{
            System.out.println("Insertion not possible");
        }
    }
    public void insertInSortedList(int val){
        Node n = new Node(val,null); //we create a new node that we want to add
        Node current = start; // make a node and assign start value to is
        Node temp = null; // make a temp node
        while (current!=null && current.getData()<n.getData()) { // this is the condition
            temp = current; //then current value will be in temp and current will getNext value
            current = current.getNext();
        }
        n.setNext(current);// now we point our new node to the next value
        temp.setNext(n); // we point our previous node to the new node that we created
    }

    public int findElement(int val) {
        int count=1;
        Node current = start;

        while(current!= null && val!=current.getData()){
            current = current.getNext();
            count++;
        }
        System.out.println("Present at postion = " +count);
        return count;
    }
    
    public void deleteFirst() {
        if(start==null){
            System.out.println("List is Empty cannot delete");
        }else{
            start = start.getNext();
            size--;
        }
    }

    public void deleteLast(){
        if(start==null){
            System.out.println("List is Empty cannot delete");
        }else if(size==1)
        {
            start = null;
            size--;
        }else{
            Node t;
            t= start;
            for(int i=1;i<=size-1;i++){
                t =t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void deleteAtPosition(int pos){
        if(start==null)
        System.out.println("list is already empty");
        else if(pos<1 || pos>size)
        {
            System.out.println("Invalid position");
        }else if(pos==1){
            deleteFirst();
        }else if(pos == size)
        {
            deleteLast();
        }else{
            Node t,t1;
            t =start;
            for(int i=1;i<pos-1;i++)
            {
                t=t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
        }
    }

    public void deleteElement (int val) {
       if(start==null){
           System.out.println("list is empty");
       }else{
        Node current = start; // make a node and assign start value to is
        Node temp = null; // make a temp node
        while (current!=null && current.getData()!=val) { // this is the condition
            temp = current; //then current value will be in temp and current will getNext value
            current = current.getNext();
        }
        // now we point our new node to the next value
        temp.setNext(current.getNext());

        }
}

    public boolean isEmpty(){

        return(start == null);
    }

    public int  getListSize() {
        return size;
    }
    public void viewList() {
        Node t;
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            t = start;
            // for(int i=1;i<=size;i++){
            //     System.out.print(t.getData()+ " ");
            //     t = t.getNext();
            // }
            while (t!= null) {
                System.out.println(t.getData());
                t = t.getNext();
            }
        }
    }
}