
package Model;

/**
 *
 * @author Nuala Morita
 */
public class Orcamento_Tratamento {
    
    private int fkTratamentoUniao;
    private int fkOrcamentoUniao;

    public Orcamento_Tratamento(int fkTratamentoUniao, int fkOrcamentoUniao) {
        this.fkTratamentoUniao = fkTratamentoUniao;
        this.fkOrcamentoUniao = fkOrcamentoUniao;
    }

    public int getFkTratamentoUniao() {
        return fkTratamentoUniao;
    }

    public void setFkTratamentoUniao(int fkTratamentoUniao) {
        this.fkTratamentoUniao = fkTratamentoUniao;
    }

    public int getFkOrcamentoUniao() {
        return fkOrcamentoUniao;
    }

    public void setFkOrcamentoUniao(int fkOrcamentoUniao) {
        this.fkOrcamentoUniao = fkOrcamentoUniao;
    }
    
    
    
}
