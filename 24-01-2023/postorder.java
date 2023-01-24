class Solution {
    static void result(TreeNode node,ArrayList<Integer>data){
        if(node==null){
            return;
        }
        result(node.left,data);
        result(node.right,data);
        data.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>data=new ArrayList<>();
        result(root,data);
        return data;
    }
}
