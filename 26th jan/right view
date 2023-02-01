class Solution {
    static void result(TreeNode root,ArrayList<Integer>data,int level){
        if(root==null){
            return;
        }
        if(data.size()==level){
            data.add(root.val);
        }
        result(root.right,data,level+1);
        result(root.left,data,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>data=new ArrayList<>();
        result(root,data,0);
        return data;
    }
}
