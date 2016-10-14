package app.domain.pms;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by arifhosain on 10/14/16.
 */
public class SetupCurrency {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cur_code", length = 10, nullable = true)
    private String curCode;

    @Column(name = "country_name", length = 50, nullable = true)
    private String countryName;

    @Column(name = "currency_name", length = 40, nullable = true)
    private String currencyName;

    @Column(name = "curr_symbol", length = 50, nullable = true)
    private String currSymbol;

    @Column(name = "symbol", length = 40, nullable = true)
    private String symbol;

    @Column(name = "curr_rate", nullable = true)
    private Double currRate;




}
