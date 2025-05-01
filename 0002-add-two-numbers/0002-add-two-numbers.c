/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* l3;

 void insert_node(int val){
    struct ListNode *ptr;
    struct ListNode *new_node = (struct ListNode *) malloc(sizeof(struct ListNode));
    new_node->val=val;
    new_node->next=NULL;
    if(l3==NULL) {
        l3=new_node;
        return;
    }
    ptr=l3;
    while(ptr->next!=NULL)
        ptr=ptr->next;
    ptr->next=new_node;
};

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    l3=NULL;
    int n1=0,n2=0, carry=0, sum=0;
    for(;l1!=NULL && l2!=NULL; l1=l1->next,l2=l2->next){
        sum=l1->val+l2->val+carry;
        insert_node(sum%10);
        carry=sum/10;
    }
    for(;l1!=NULL; l1=l1->next){
        sum=l1->val+carry;
        insert_node(sum%10);
        carry=sum/10;
    }
    for(;l2!=NULL; l2=l2->next){
        sum=l2->val+carry;
        insert_node(sum%10);
        carry=sum/10;
    }
    if(carry!=0) insert_node(carry);
    return l3;
}