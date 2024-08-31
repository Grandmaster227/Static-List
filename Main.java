public class Main {
    public static void main(String[] args) {

        Static lista = new Static(5);


        lista.add(2);
        lista.isFull();
        lista.add(3);
        lista.add(1);
        lista.add(4);
        lista.add(70);

        lista.add(10);

        lista.isEmpty();

        lista.isFull();

        lista.clear();
        System.out.println("Lista limpa");
        System.out.println("Tamanho da lista:" + lista.getTam());


    }
}