class Solution {
    static void result(TreeNode node,ArrayList<Integer>data){
        if(node==null){
            return;
        }
        data.add(node.val);
        result(node.left,data);
        result(node.right,data);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>data=new ArrayList<>();
        result(root,data);
        return data;
    }
}
