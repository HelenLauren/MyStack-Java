public class Main {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        //testar push
        pilha.push("Helen");
        pilha.push("Felipe");
        pilha.push("Salaminha");

        //testar top sem remover
        System.out.println(pilha.top());

        //testar size
        System.out.println(pilha.size());

        //testar isEmpty
        System.out.println(pilha.isEmpty());

        //testar pop remove o topo
        pilha.pop(); // remove a Salaminha

        //testando toArray e depois printando o array
        Object[] array = pilha.toArray();

        System.out.println("Sua pilha ficou assim: ");
        for (Object item : array) {
            System.out.println(item);
        }
    }
}
