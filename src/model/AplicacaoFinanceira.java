/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Super Dog
 */
public interface AplicacaoFinanceira {
    public void calcularRendimento(double taxa);
    public void calcularRendimento(BigDecimal taxa);
}
