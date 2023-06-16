class Data implements MinhaData {
    private int dia;
    private int mes;
    private int ano;

    @Override
    public int getDia() {
        return dia;
    }

    @Override
    public int getMes() {
        return mes;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido.");
        }
    }

    @Override
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido.");
        }
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String mostrarData() {
        String[] nomesMeses = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        return dia + " de " + nomesMeses[mes] + " de " + ano;
    }

    public void mostrarNome() {
        System.out.println("Classe: Data");
    }
}
