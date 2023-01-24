class Solution {
    static void result(TreeNode node,ArrayList<Integer>data){
        if(node==null){
            return;
        }
        result(node.left,data);
        data.add(node.val);
        result(node.right,data);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>data=new ArrayList<>();
        result(root,data);
        return data;
    }
}
