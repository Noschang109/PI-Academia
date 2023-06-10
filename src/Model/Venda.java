/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 181910174
 */
public class Venda {

    public class Vendas {

        private int idVenda;
        private int idCliente;
        private int idFuncionario;
        private String status;
        private float total;
        private String dtVenda;
        private String produto;

        //Visualização
        private String totalVisual;
        private String dtVendaVisual;

        public Vendas() {
        }

        public Vendas(int idVenda, int idCliente, int idFuncionario, String status, float total, String dtVenda, String produto, String totalVisual, String dtVendaVisual) {
            this.idVenda = idVenda;
            this.idCliente = idCliente;
            this.idFuncionario = idFuncionario;
            this.status = status;
            this.total = total;
            this.dtVenda = dtVenda;
            this.produto = produto;
            this.totalVisual = totalVisual;
            this.dtVendaVisual = dtVendaVisual;
        }

        public int getIdVenda() {
            return idVenda;
        }

        public void setIdVenda(int idVenda) {
            this.idVenda = idVenda;
        }

        public int getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public int getIdFuncionario() {
            return idFuncionario;
        }

        public void setIdFuncionario(int idFuncionario) {
            this.idFuncionario = idFuncionario;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public float getTotal() {
            return total;
        }

        public void setTotal(float total) {
            this.total = total;
        }

        public String getDtVenda() {
            return dtVenda;
        }

        public void setDtVenda(String dtVenda) {
            this.dtVenda = dtVenda;
        }

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }

        public String getTotalVisual() {
            return totalVisual;
        }

        public void setTotalVisual(String totalVisual) {
            this.totalVisual = totalVisual;
        }

        public String getDtVendaVisual() {
            return dtVendaVisual;
        }

        public void setDtVendaVisual(String dtVendaVisual) {
            this.dtVendaVisual = dtVendaVisual;
        }

        @Override
        public String toString() {
            return "Vendas{" + "idVenda=" + idVenda + ", idCliente=" + idCliente + ", idFuncionario=" + idFuncionario + ", status=" + status + ", total=" + total + ", dtVenda=" + dtVenda + ", produto=" + produto + ", totalVisual=" + totalVisual + ", dtVendaVisual=" + dtVendaVisual + '}';
        }

    }
}
