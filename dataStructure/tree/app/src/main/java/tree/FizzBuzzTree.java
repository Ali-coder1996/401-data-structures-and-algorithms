package tree;

public class FizzBuzzTree {
    public static Tree output = new Tree();
    public static Tree fizzBuzzTree(Tree tree){
        if(tree.root == null)return output;
        output.root = new KArayNode(checkValue(tree.root.value));
        fizzBuzzTree(tree.root,output.root);
        return output;
    }

    public static void fizzBuzzTree(KArayNode root,KArayNode outputRoot){
        for (int i = 0; i < root.children.size() ; i++){
            KArayNode node = new KArayNode( checkValue(root.children.get(i).value));
            outputRoot.children.add(node);
            fizzBuzzTree(root.children.get(i),outputRoot.children.get(i));
        }
    }

    private static String checkValue(Object val){
        return ((int)val) % 3 == 0 && ((int)val) % 5 == 0 ?  "FizzBuzz" : ((int)val) % 3 == 0 ? "Fizz" :  ((int)val) % 5 == 0 ? "Buzz": val.toString();
    }


}
