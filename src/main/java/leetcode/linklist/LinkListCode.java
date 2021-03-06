package leetcode.linklist;

/**
 * Created by apple on 19/4/28.
 * 链表是一种递归的数据结构，它或者为空Null，或者指向一个节点的引用
 * 链表表示的是一列元素
 */

public class LinkListCode {
    /**
     * s1.获取单链表的长度
     * @param head
     * @return
     */
    public static int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.getNext(); //获取下一个节点
        }
        return length;
    }




    /**
     * s2.查找单链表的倒数第K个节点
     * @param head
     * @param k
     */

    public static ListNode findLastKNode(ListNode head,int k ){
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head;
        //让second先移动k个位置
        for(int i=0;i<k;i++){
            second=second.getNext();
        }
        //让first和second结点整体向后移动，直到second结点为Null
        while (second.getNext() != null){
            first= first.getNext();
            second =second.getNext();
        }
        //当second结点为空的时候，此时first指向的结点就是我们要找的结点
        return first;
    }

    public static void main(String args[]){
        ListNode P1 = new ListNode(1);
        ListNode P2 = new ListNode(6);
        ListNode P3 = new ListNode(3 );
        P1.setVal(5);
        P1.setNext(P2);
        P2.setNext(P3);

        ListNode.print(P1);
        System.out.println(getLength(P1));
        System.out.print("");
        System.out.println(findLastKNode(P1,2).getVal());
    }

}
