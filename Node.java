public class Node<E>{
    private E data;
    public Node(E data){
        this.data = data;
    }

    public E getData(){
        return data;
    }

    public void setData(E data){
        this.data = data;
    }
    @Override
    public String toString(){
        return data + "";
    }
}
