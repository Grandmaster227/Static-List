public class Static {
    int[] componentes;
    int tam;


    public Static(int tamanho) {
        this.componentes = new int[tamanho];
        this.tam = 0;
    }


    public void clear() {
        this.tam = 0;
    }


    public boolean add(int componente) {
        if (!isFull()) {
            this.componentes[tam] = componente;
            tam++;
            return true;
        } else {
            System.out.println("Lista cheia");
            return false;
        }
    }


    public boolean add(int componente, int index) {
        if (index < 0 || index > tam || isFull()) {
            System.out.println("Lista está cheia ou posição inválida");
            return false;
        }

        for (int i = tam; i > index; i--) {
            this.componentes[i] = this.componentes[i - 1];
        }
        this.componentes[index] = componente;
        tam++;
        return true;
    }


    public int remove(int index) {
        if (isEmpty()) {
            System.out.println("Lista vazia");
            return -1;
        } else {
            int componente = this.componentes[index];
            for (int i = index; i < tam - 1; i++) {
                this.componentes[i] = this.componentes[i + 1];
            }
            tam--;  // Decrementa o tamanho da lista
            return componente;
        }
    }

    public boolean isEmpty() {
        return tam == 0;
    }

    public boolean isFull() {
        return tam == componentes.length;
    }


    public boolean setComponentes(int componente, int index) {
        if (index < 0 || index >= tam) {
            System.out.println("Posição inválida");
            return false;
        }
        this.componentes[index] = componente;
        return true;
    }


    public int find(int componente) {
        for (int i = 0; i < tam; i++) {
            if (this.componentes[i] == componente) {
                return i;
            }
        }
        return -1;
    }

    public int getTam() {
        return this.tam;
    }
}
