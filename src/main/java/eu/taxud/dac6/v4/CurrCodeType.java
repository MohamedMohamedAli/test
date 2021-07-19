
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per currCode_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="currCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AFN"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AOA"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BOV"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BYN"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CDF"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CHW"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CUC"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHS"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MGA"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MRU"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MXV"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="SRD"/>
 *     &lt;enumeration value="SSP"/>
 *     &lt;enumeration value="STN"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TMT"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="USN"/>
 *     &lt;enumeration value="UYI"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UYW"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VES"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="XAG"/>
 *     &lt;enumeration value="XAU"/>
 *     &lt;enumeration value="XBA"/>
 *     &lt;enumeration value="XBB"/>
 *     &lt;enumeration value="XBC"/>
 *     &lt;enumeration value="XBD"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XPD"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="XPT"/>
 *     &lt;enumeration value="XSU"/>
 *     &lt;enumeration value="XUA"/>
 *     &lt;enumeration value="XXX"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="ZMW"/>
 *     &lt;enumeration value="ZWL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currCode_Type", namespace = "urn:eu:taxud:isotypes:v1")
@XmlEnum
public enum CurrCodeType {


    /**
     * UAE Dirham: UNITED ARAB EMIRATES
     * 
     */
    AED,

    /**
     * Afghani: AFGHANISTAN
     * 
     */
    AFN,

    /**
     * Lek: ALBANIA
     * 
     */
    ALL,

    /**
     * Armenian Dram: ARMENIA	
     * 
     */
    AMD,

    /**
     * Netherlands Antillean Guilder: CURACAO; SINT MAARTEN (DUTCH PART)
     * 
     */
    ANG,

    /**
     * Kwanza: ANGOLA
     * 
     */
    AOA,

    /**
     * Argentine Peso: ARGENTINA
     * 
     */
    ARS,

    /**
     * Australian Dollar: AUSTRALIA; CHRISTMAS ISLAND; COCOS (KEELING) ISLANDS; HEARD ISLAND AND McDONALD ISLANDS; KIRIBATI; NAURU; NORFOLK ISLAND; TUVALU
     * 
     */
    AUD,

    /**
     * Aruban Florin: ARUBA
     * 
     */
    AWG,

    /**
     * Azerbaijan Manat: AZERBAIJAN
     * 
     */
    AZN,

    /**
     * Convertible Mark: BOSNIA AND HERZEGOVINA
     * 
     */
    BAM,

    /**
     * Barbados Dollar: BARBADOS
     * 
     */
    BBD,

    /**
     * Taka: BANGLADESH
     * 
     */
    BDT,

    /**
     * Bulgarian Lev: BULGARIA
     * 
     */
    BGN,

    /**
     * Bahraini Dinar: BAHRAIN
     * 
     */
    BHD,

    /**
     * Burundi Franc: BURUNDI
     * 
     */
    BIF,

    /**
     * Bermudian Dollar: BERMUDA
     * 
     */
    BMD,

    /**
     * Brunei Dollar: BRUNEI DARUSSALAM
     * 
     */
    BND,

    /**
     * Boliviano: BOLIVIA, PLURINATIONAL STATE OF
     * 
     */
    BOB,

    /**
     * Mvdol: BOLIVIA, PLURINATIONAL STATE OF
     * 
     */
    BOV,

    /**
     * Brazilian Real: BRAZIL
     * 
     */
    BRL,

    /**
     * Bahamian Dollar: BAHAMAS
     * 
     */
    BSD,

    /**
     * Ngultrum: BHUTAN
     * 
     */
    BTN,

    /**
     * Pula: BOTSWANA
     * 
     */
    BWP,

    /**
     * Belarusian Ruble: BELARUS
     * 
     */
    BYN,

    /**
     * Belize Dollar: BELIZE
     * 
     */
    BZD,

    /**
     * Canadian Dollar: CANADA
     * 
     */
    CAD,

    /**
     * Congolese Franc: CONGO, THE DEMOCRATIC REPUBLIC OF
     * 
     */
    CDF,

    /**
     * WIR Euro: SWITZERLAND
     * 
     */
    CHE,

    /**
     * Swiss Franc: LIECHTENSTEIN; SWITZERLAND
     * 
     */
    CHF,

    /**
     * WIR Franc: SWITZERLAND
     * 
     */
    CHW,

    /**
     * Unidad de Fomento: CHILE
     * 
     */
    CLF,

    /**
     * Chilean Peso: CHILE
     * 
     */
    CLP,

    /**
     * Yuan Renminbi: CHINA
     * 
     */
    CNY,

    /**
     * Colombian Peso: COLOMBIA
     * 
     */
    COP,

    /**
     * Unidad de Valor Real: COLOMBIA
     * 
     */
    COU,

    /**
     * Costa Rican Colon: COSTA RICA
     * 
     */
    CRC,

    /**
     * Peso Convertible: CUBA
     * 
     */
    CUC,

    /**
     * Cuban Peso: CUBA
     * 
     */
    CUP,

    /**
     * Cabo Verde Escudo: CABO VERDE
     * 
     */
    CVE,

    /**
     * Czech Koruna: CZECHIA
     * 
     */
    CZK,

    /**
     * Djibouti Franc: DJIBOUTI
     * 
     */
    DJF,

    /**
     * Danish Krone: DENMARK; FAROE ISLANDS; GREENLAND
     * 
     */
    DKK,

    /**
     * Dominican Peso: DOMINICAN REPUBLIC
     * 
     */
    DOP,

    /**
     * Algerian Dinar: ALGERIA
     * 
     */
    DZD,

    /**
     * Egyptian Pound: EGYPT
     * 
     */
    EGP,

    /**
     * Nakfa: ERITREA
     * 
     */
    ERN,

    /**
     * Ethiopian Birr: ETHIOPIA
     * 
     */
    ETB,

    /**
     * Euro: ALAND ISLANDS; ANDORRA; AUSTRIA; BELGIUM; CYPRUS; ESTONIA; EUROPEAN UNION; FINLAND; FRANCE; FRENCH GUIANA; FRENCH SOUTHERN TERRITORIES; GERMANY; GREECE; GUADELOUPE; HOLY SEE (VATICAN CITY STATE); IRELAND; ITALY; LATVIA; LITHUANIA; LUXEMBOURG; MALTA; MARTINIQUE; MAYOTTE; MONACO; MONTENEGRO; NETHERLANDS; PORTUGAL; REUNION; SAINT BARTHELEMY; SAINT MARTIN (FRENCH PART); SAINT PIERRE AND MIQUELON; SAN MARINO; SLOVAKIA; SLOVENIA; SPAIN
     * 
     */
    EUR,

    /**
     * Fiji Dollar: FIJI
     * 
     */
    FJD,

    /**
     * Falkland Islands Pound: FALKLAND ISLANDS (MALVINAS)
     * 
     */
    FKP,

    /**
     * Pound Sterling: GUERNSEY; ISLE OF MAN; JERSEY; UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND
     * 
     */
    GBP,

    /**
     * Lari: GEORGIA
     * 
     */
    GEL,

    /**
     * Ghana Cedi: GHANA
     * 
     */
    GHS,

    /**
     * Gibraltar Pound: GIBRALTAR
     * 
     */
    GIP,

    /**
     * Dalasi: GAMBIA
     * 
     */
    GMD,

    /**
     * Guinean Franc: GUINEA
     * 
     */
    GNF,

    /**
     * Quetzal: GUATEMALA
     * 
     */
    GTQ,

    /**
     * Guyana Dollar: GUYANA
     * 
     */
    GYD,

    /**
     * Hong Kong Dollar: HONG KONG
     * 
     */
    HKD,

    /**
     * Lempira: HONDURAS
     * 
     */
    HNL,

    /**
     * Kuna: CROATIA
     * 
     */
    HRK,

    /**
     * Gourde: HAITI
     * 
     */
    HTG,

    /**
     * Forint: HUNGARY
     * 
     */
    HUF,

    /**
     * Rupiah: INDONESIA
     * 
     */
    IDR,

    /**
     * New Israeli Sheqel: ISRAEL
     * 
     */
    ILS,

    /**
     * Indian Rupee: BHUTAN; INDIA
     * 
     */
    INR,

    /**
     * Iraqi Dinar: IRAQ
     * 
     */
    IQD,

    /**
     * Iranian Rial: IRAN, ISLAMIC REPUBLIC OF
     * 
     */
    IRR,

    /**
     * Iceland Krona: ICELAND
     * 
     */
    ISK,

    /**
     * Jamaican Dollar: JAMAICA
     * 
     */
    JMD,

    /**
     * Jordanian Dinar: JORDAN
     * 
     */
    JOD,

    /**
     * Yen: JAPAN
     * 
     */
    JPY,

    /**
     * Kenyan Shilling: KENYA
     * 
     */
    KES,

    /**
     * Som: KYRGYZSTAN
     * 
     */
    KGS,

    /**
     * Riel: CAMBODIA
     * 
     */
    KHR,

    /**
     * Comorian Franc : COMOROS
     * 
     */
    KMF,

    /**
     * North Korean Won: KOREA, DEMOCRATIC PEOPLE’S REPUBLIC OF
     * 
     */
    KPW,

    /**
     * Won: KOREA, REPUBLIC OF
     * 
     */
    KRW,

    /**
     * Kuwaiti Dinar: KUWAIT
     * 
     */
    KWD,

    /**
     * Cayman Islands Dollar: CAYMAN ISLANDS
     * 
     */
    KYD,

    /**
     * Tenge: KAZAKHSTAN
     * 
     */
    KZT,

    /**
     * Lao Kip: LAO PEOPLE’S DEMOCRATIC REPUBLIC
     * 
     */
    LAK,

    /**
     * Lebanese Pound: LEBANON
     * 
     */
    LBP,

    /**
     * Sri Lanka Rupee: SRI LANKA
     * 
     */
    LKR,

    /**
     * Liberian Dollar: LIBERIA
     * 
     */
    LRD,

    /**
     * Loti: LESOTHO
     * 
     */
    LSL,

    /**
     * Libyan Dinar: LIBYA
     * 
     */
    LYD,

    /**
     * Moroccan Dirham: MOROCCO; WESTERN SAHARA
     * 
     */
    MAD,

    /**
     * Moldovan Leu: MOLDOVA, REPUBLIC OF
     * 
     */
    MDL,

    /**
     * Malagasy Ariary: MADAGASCAR
     * 
     */
    MGA,

    /**
     * Denar: MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF
     * 
     */
    MKD,

    /**
     * Kyat: MYANMAR
     * 
     */
    MMK,

    /**
     * Tugrik: MONGOLIA
     * 
     */
    MNT,

    /**
     * Pataca: MACAO
     * 
     */
    MOP,

    /**
     * Ouguiya: MAURITANIA
     * 
     */
    MRU,

    /**
     * Mauritius Rupee: MAURITIUS
     * 
     */
    MUR,

    /**
     * Rufiyaa: MALDIVES
     * 
     */
    MVR,

    /**
     * Malawi Kwacha: MALAWI
     * 
     */
    MWK,

    /**
     * Mexican Peso: MEXICO
     * 
     */
    MXN,

    /**
     * Mexican Unidad de Inversion (UDI): MEXICO
     * 
     */
    MXV,

    /**
     * Malaysian Ringgit: MALAYSIA
     * 
     */
    MYR,

    /**
     * Mozambique Metical: MOZAMBIQUE
     * 
     */
    MZN,

    /**
     * Namibia Dollar: NAMIBIA
     * 
     */
    NAD,

    /**
     * Naira: NIGERIA
     * 
     */
    NGN,

    /**
     * Cordoba Oro: NICARAGUA
     * 
     */
    NIO,

    /**
     * Norwegian Krone: BOUVET ISLAND; NORWAY; SVALBARD AND JAN MAYEN
     * 
     */
    NOK,

    /**
     * Nepalese Rupee: NEPAL
     * 
     */
    NPR,

    /**
     * New Zealand Dollar: COOK ISLANDS; NEW ZEALAND; NIUE; PITCAIRN; TOKELAU
     * 
     */
    NZD,

    /**
     * Rial Omani: OMAN
     * 
     */
    OMR,

    /**
     * Balboa: PANAMA
     * 
     */
    PAB,

    /**
     * Sol: PERU
     * 
     */
    PEN,

    /**
     * Kina: PAPUA NEW GUINEA
     * 
     */
    PGK,

    /**
     * Philippine Peso: PHILIPPINES
     * 
     */
    PHP,

    /**
     * Pakistan Rupee: PAKISTAN
     * 
     */
    PKR,

    /**
     * Zloty: POLAND
     * 
     */
    PLN,

    /**
     * Guarani: PARAGUAY
     * 
     */
    PYG,

    /**
     * Qatari Rial: QATAR
     * 
     */
    QAR,

    /**
     * Romanian Leu: ROMANIA
     * 
     */
    RON,

    /**
     * Serbian Dinar: SERBIA
     * 
     */
    RSD,

    /**
     * Russian Ruble: RUSSIAN FEDERATION
     * 
     */
    RUB,

    /**
     * Rwanda Franc: RWANDA
     * 
     */
    RWF,

    /**
     * Saudi Riyal: SAUDI ARABIA
     * 
     */
    SAR,

    /**
     * Solomon Islands Dollar: SOLOMON ISLANDS
     * 
     */
    SBD,

    /**
     * Seychelles Rupee: SEYCHELLES
     * 
     */
    SCR,

    /**
     * Sudanese Pound: SUDAN
     * 
     */
    SDG,

    /**
     * Swedish Krona: SWEDEN
     * 
     */
    SEK,

    /**
     * Singapore Dollar: SINGAPORE
     * 
     */
    SGD,

    /**
     * Saint Helena Pound: SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
     * 
     */
    SHP,

    /**
     * Leone: SIERRA LEONE
     * 
     */
    SLL,

    /**
     * Somali Shilling: SOMALIA
     * 
     */
    SOS,

    /**
     * Surinam Dollar: SURINAME
     * 
     */
    SRD,

    /**
     * South Sudanese Pound: SOUTH SUDAN
     * 
     */
    SSP,

    /**
     * Dobra: SAO TOME AND PRINCIPE
     * 
     */
    STN,

    /**
     * El Salvador Colon: EL SALVADOR
     * 
     */
    SVC,

    /**
     * Syrian Pound: SYRIAN ARAB REPUBLIC
     * 
     */
    SYP,

    /**
     * Lilangeni: ESWATINI
     * 
     */
    SZL,

    /**
     * Baht: THAILAND
     * 
     */
    THB,

    /**
     * Somoni: TAJIKISTAN
     * 
     */
    TJS,

    /**
     * Turkmenistan New Manat: TURKMENISTAN
     * 
     */
    TMT,

    /**
     * Tunisian Dinar: TUNISIA
     * 
     */
    TND,

    /**
     * Pa’anga: TONGA
     * 
     */
    TOP,

    /**
     * Turkish Lira: TURKEY
     * 
     */
    TRY,

    /**
     * Trinidad and Tobago Dollar: TRINIDAD AND TOBAGO
     * 
     */
    TTD,

    /**
     * New Taiwan Dollar: TAIWAN, PROVINCE OF CHINA
     * 
     */
    TWD,

    /**
     * Tanzanian Shilling: TANZANIA, UNITED REPUBLIC OF
     * 
     */
    TZS,

    /**
     * Hryvnia: UKRAINE
     * 
     */
    UAH,

    /**
     * Uganda Shilling: UGANDA
     * 
     */
    UGX,

    /**
     * US Dollar: AMERICAN SAMOA; BONAIRE; SINT EUSTATIUS AND SABA; BRITISH INDIAN OCEAN TERRITORY; ECUADOR; EL SALVADOR; GUAM; HAITI; MARSHALL ISLANDS; MICRONESIA, FEDERATED STATES OF; NORTHERN MARIANA ISLANDS; PALAU; PANAMA; PUERTO RICO; TIMOR-LESTE; TURKS AND CAICOS ISLANDS, UNITED STATES; UNITED STATES MINOR OUTLYING ISLANDS; VIRGIN ISLANDS (BRITISH); VIRGIN ISLANDS (US)
     * 
     */
    USD,

    /**
     * US Dollar (Next day): UNITED STATES
     * 
     */
    USN,

    /**
     * Uruguay Peso en Unidades Indexadas (UI): URUGUAY
     * 
     */
    UYI,

    /**
     * Peso Uruguayo: URUGUAY
     * 
     */
    UYU,

    /**
     * Unidad Previsional: URUGUAY
     * 
     */
    UYW,

    /**
     * Uzbekistan Sum: UZBEKISTAN
     * 
     */
    UZS,

    /**
     * Bolivar Soberano: VENEZUELA, BOLIVARIAN REPUBLIC OF
     * 
     */
    VES,

    /**
     * Dong: VIET NAM
     * 
     */
    VND,

    /**
     * Vatu: VANUATU
     * 
     */
    VUV,

    /**
     * Tala: SAMOA
     * 
     */
    WST,

    /**
     * CFA Franc BEAC: CAMEROON; CENTRAL AFRICAN REPUBLIC; CHAD; CONGO; EQUATORIAL GUINEA; GABON
     * 
     */
    XAF,

    /**
     * Silver: ZZ11_Silver
     * 
     */
    XAG,

    /**
     * Gold: ZZ08_Gold
     * 
     */
    XAU,

    /**
     * Bond Markets Unit European Composite Unit (EURCO):  ZZ01_Bond Markets Unit European_EURCO
     * 
     */
    XBA,

    /**
     * Bond Markets Unit European Monetary Unit (E.M.U.-6): ZZ02_Bond Markets Unit European_EMU-6
     * 
     */
    XBB,

    /**
     * Bond Markets Unit European Unit of Account 9 (E.U.A.-9): ZZ03_Bond Markets Unit European_EUA-9
     * 
     */
    XBC,

    /**
     * Bond Markets Unit European Unit of Account 17 (E.U.A.-17): ZZ04_Bond Markets Unit European_EUA-17
     * 
     */
    XBD,

    /**
     * East Caribbean Dollar: ANGUILLA; ANTIGUA AND BARBUDA; DOMINICA; GRENADA; MONTSERRAT; SAINT KITTS AND NEVIS; SAINT LUCIA; SAINT VINCENT AND THE GRENADINES
     * 
     */
    XCD,

    /**
     * SDR (Special Drawing Right): INTERNATIONAL MONETARY FUND (IMF)
     * 
     */
    XDR,

    /**
     * CFA Franc BCEAO: BENIN; BURKINA FASO; COTE D'IVOIRE; GUINEA-BISSAU; MALI; NIGER; SENEGAL; TOGO
     * 
     */
    XOF,

    /**
     * Palladium: ZZ09_Palladium
     * 
     */
    XPD,

    /**
     * CFP Franc: FRENCH POLYNESIA; NEW CALEDONIA; WALLIS AND FUTUNA
     * 
     */
    XPF,

    /**
     * Platinum: ZZ10_Platinum
     * 
     */
    XPT,

    /**
     * Sucre: SISTEMA UNITARIO DE COMPENSACION REGIONAL DE PAGOS "SUCRE"
     * 
     */
    XSU,

    /**
     * ADB Unit of Account: MEMBER COUNTRIES OF THE AFRICAN DEVELOPMENT BANK GROUP
     * 
     */
    XUA,

    /**
     * The codes assigned for transactions where no currency is involved: ZZ07_No_Currency
     * 
     */
    XXX,

    /**
     * Yemeni Rial: YEMEN
     * 
     */
    YER,

    /**
     * Rand: LESOTHO; NAMIBIA; SOUTH AFRICA
     * 
     */
    ZAR,

    /**
     * Zambian Kwacha: ZAMBIA
     * 
     */
    ZMW,

    /**
     * Zimbabwe Dollar: ZIMBABWE
     * 
     */
    ZWL;

    public String value() {
        return name();
    }

    public static CurrCodeType fromValue(String v) {
        return valueOf(v);
    }

}
