package com.java.linkedlist;

class MyLinkedList<T>{//LinkedList<���׸�> list = new LinkedList<���׸�>();
    public Node head;//��尡 ������� ǥ���ϱ� ���ؼ� ����
    //private Node tail;//��尡 �������� ǥ���ϱ� ���ؼ� ����
    public int size=0;//���Ḯ��Ʈ�� size��� �Ӽ��� �����ϱ� ���� 0���� �ʱ�ȭ
    class Node{//���� ���Ḯ��Ʈ�� �� �κ��̹Ƿ� ���Ḯ��Ʈ Ŭ���� �ȿ� ���� Ŭ������ �����Ѵ�
        public Node next;//������ ��� Ŭ������ �ν��Ͻ���. �� ��� ��ü�� ���� ����� �ּ��� next
        public Node prev;
        public T data;//�׸��� data�� �Ӽ����� ���´�
        public Node(T data) {//�����Ͱ� ���� ���ͼ� ��尡 ���� �����ɶ�, �� �����ڸ� ����ؾ� �Ѵ�
            this.data = data;
            this.next = null;//���ο� ��尡 ������ ��ÿ��� �̰� head���� tail����
            this.prev = null;
            //������ �ʴ´� �׷��� null�� �����Ѵ�
        }
    }
    public void add(int index,T data) {   
        if (index==0) {
            addFirst(data);
        }
        else {
            Node temp1 = node(index-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(data);
            temp1.next = newNode;
            newNode.next = temp2;
            newNode.prev = temp1;
            temp2.prev = newNode;
            size++;
            if (newNode.next==null) {//���ο� ��尡 ������ ����̸�
                //tail = newNode;//tail�� ���ο� ��带 ����Ű�� �Ѵ�
                newNode.next = head;
            }
        }
    }
    public void addFirst(T data) {
        //���� �߰��ɶ� ��尡 �ϳ� �����Ǳ� ������
        //�����ڸ� ȣ���Ѵ�
        Node newNode = new Node(data);
       // newNode.next = head;//ù��° �ε����� ������ ����̴�
        //newNode.prev = node(size);
        //head.prev = head;
        if (head == null) {//��� ����� ������ ������
            //�� �� ��尡 ó������ ������ ������ �����
            //tail�� head�� ���� ���� ���� ���� �Ѵ�
            head = newNode;
            newNode.prev = newNode;
            newNode.next = newNode;
            //head.prev= head;
            //�� head �� tail�� ����Ű�� ���� ��������
        }
        else{
            Node tmp1 = head;
            Node tmpprv = tmp1.prev;
            newNode.prev = tmpprv;
            newNode.next = tmp1;
            tmp1.prev = newNode;
            tmpprv.next = newNode;
            head = newNode;
        }
       // tmp1.next = head;
        //head���� ���ο� ù��° ��带 ����Ų��
        size++;//����Ʈ�� ����� 1 �����Ѵ�
        // if(head.prev == null) {
        //     head.prev = head;
        //     //newNode.prev = node(size);
        // }
        // TODO Auto-generated method stub
    }
    public void addLast(T data) {
        Node newNode = new Node(data);
        if (size==0) {//addLast�� ȣ��������
            //����Ʈ�� ����� 0�̶�� ����� ���� ��ġ�� ����� ����
            addFirst(data);//�׷���  addFirst�� ȣ���Ѵ�
        }
        else {
            Node last = node(size);
            Node nexts = last.next;
            newNode.next = nexts;
            nexts.prev = newNode;
            last.next = newNode;
            newNode.prev = last;
            size++;
        }    
    }
    private Node node(int index) {
        Node x = head;//�ٷ� x=x.next�� ���� �ʴ� ����
        //�̷��� �����ϸ� x�� ���� ����� ���� ����
        //x = x.next;//�׸��� head�� ���� ��带 x�� ����Ų��
        //���Ḯ��Ʈ�� �ּҸ� ���ؼ� ������ ���ʷ� Ž���� �Ѵ�
        //�׷��ٸ�  x = x.next�� ��� �����ϴ����� �����͸� Ž���ϴ� �� �����̴�
        for (int i = 0; i < index; i++) {
            //�׷��� indexũ�� ��ŭ x=x.next�� �����Ѵ�
            x = x.next;
        }
        return x;//�׸��� x�� �����Ѵ� x�� ��ü�̱⿡ ����ϱ� ���� �޼ҵ� get�� �����Ѵ�
    }
    public void getAll() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+get(i)+" ");
        }
        System.out.println("]");
    }
    public T get(int index) {
        return node(index).data;
        //node(index)������ ����� ����ڰ� ������ index��ŭ ��带 Ž���ϰ� �ּҸ� ��ȯ�Ѵ�
        //�׸��� �װ��� .data���� �����´�
    }
    public Node Testget(int index) {
        return node(index);
        //node(index)������ ����� ����ڰ� ������ index��ŭ ��带 Ž���ϰ� �ּҸ� ��ȯ�Ѵ�
        //�׸��� �װ��� .data���� �����´�
    }
    public T removeFirst() {
        Node temp = head;
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        head = head.next;
        T returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }
    public T remove(int index) {
        if (index==0) {
            return removeFirst();
        }
        Node temp = node(index-1);
        //temp�� ������尡 �����Ϸ��� ����̴�
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        T returnData = todoDeleted.data;
        // if (todoDeleted == node(size-1)) {
        //     node(size-1) = temp;
        // }
        todoDeleted = null;
        size--;
        return returnData;
    }
    public T removeLast() {
        return remove(size-1);
        // TODO Auto-generated method stub
    }
    public int size() {
        return size;
    }
    public int indexOf(T data) {
        Node temp = head;
        int index = 0;
        while (temp.data!=data) {
            temp = temp.next;
            index++;
            if (temp==null) {
                return -1;
            }
        }
        return index;
    }
}
public class DoubleLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.removeLast();
        //list.removeFirst();
        //list.add(0, 80);
        list.getAll();
        //list.add(2, 10);
        for(int i = 0; i  < list.size(); i++){
            System.out.print(list.Testget(i).next.data + " ");
        }
        System.out.println();
        for(int i = 0; i  < list.size(); i++){
            System.out.print(list.Testget(i).prev.data + " ");
        }
    }
}
