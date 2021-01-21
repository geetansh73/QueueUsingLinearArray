public class queue
{
    int front=-1;
    int rear=-1;
    int capacity;
    int arr[];
    queue(int c)
    {
    capacity=c;
    arr=new int[capacity];
    }
    boolean isFull()
    {
    if (rear==capacity-1)
    {
    return true;
    }
    else
    {
    return false;
    }
    }
    boolean isEmpty()
    {
if (front==-1||front>rear)
{
front=-1;
rear=-1;
return true;
}
else
{
return false;
}
}
    void enqueue(int item)
    {
        if (isFull())
        {
        System.out.println("queue is overflow");
        return;
        }
   else 
   {
   if (front==-1&&rear==-1)
    {
    front++;
    }
    arr[++rear]=item;
    System.out.println(item+" item added into queue");
    }
    }
    void dequeue()
    {
    if (isEmpty())
    {
    System.out.println("queue underflow");
    }
    else if(front>rear)
    {
    System.out.println("queue underflow");
    front=-1;
    rear=-1;
    }
else
{
System.out.println("deleted item from queue "+arr[front]);
front++;
}
    }
    
    public static void main(String g[])
    {
    queue obj=new queue(5);
    obj.enqueue(1);
    obj.enqueue(2);
    obj.enqueue(3);
    obj.enqueue(4);
    obj.enqueue(5);
      obj.enqueue(5);
    obj.dequeue();
     obj.dequeue();
      obj.dequeue();
     obj.dequeue();
      obj.dequeue();
      obj.dequeue();
       obj.dequeue();
    }
}