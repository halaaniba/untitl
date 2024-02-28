

    public class User {
        private String nome;
        private int eta;

        // Costruttore
        public User(String nome, int eta) {
            this.nome = nome;
            this.eta = eta;
        }

        // Getter per il nome
        public String getNome() {
            return nome;
        }

        // Getter per l'età
        public int getEta() {
            return eta;
        }

        // Setter per il nome
        public void setNome(String nuovoNome) {
            this.nome = nuovoNome;
        }

        // Setter per l'età
        public void setEta(int nuovaEta) {
            this.eta = nuovaEta;
        }

        // Metodo per stampare le informazioni
        public void stampaInformazioni() {
            System.out.println("Nome: " + nome + ", Età: " + eta);
        }
}

