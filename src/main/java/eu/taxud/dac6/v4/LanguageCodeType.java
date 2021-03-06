
package eu.taxud.dac6.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LanguageCode_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="SQ"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="HY"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AV"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AY"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="EU"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BS"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="ZH"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="DV"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="EO"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="FY"/>
 *     &lt;enumeration value="FF"/>
 *     &lt;enumeration value="KA"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GV"/>
 *     &lt;enumeration value="EL"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HE"/>
 *     &lt;enumeration value="HZ"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="HO"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IG"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="IU"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IK"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JV"/>
 *     &lt;enumeration value="JA"/>
 *     &lt;enumeration value="KL"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="KK"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="KI"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="KV"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="KJ"/>
 *     &lt;enumeration value="KU"/>
 *     &lt;enumeration value="LO"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LN"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="LG"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NN"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NY"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OJ"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="QU"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="TY"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="TI"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="UR"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VO"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WO"/>
 *     &lt;enumeration value="XH"/>
 *     &lt;enumeration value="YI"/>
 *     &lt;enumeration value="YO"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="ZU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageCode_Type", namespace = "urn:eu:taxud:isotypes:v1")
@XmlEnum
public enum LanguageCodeType {


    /**
     * Afar
     * 
     */
    AA,

    /**
     * Abkhazian
     * 
     */
    AB,

    /**
     * Afrikaans
     * 
     */
    AF,

    /**
     * Akan
     * 
     */
    AK,

    /**
     * Albanian
     * 
     */
    SQ,

    /**
     * Amharic
     * 
     */
    AM,

    /**
     * Arabic
     * 
     */
    AR,

    /**
     * Aragonese
     * 
     */
    AN,

    /**
     * Armenian
     * 
     */
    HY,

    /**
     * Assamese
     * 
     */
    AS,

    /**
     * Avaric
     * 
     */
    AV,

    /**
     * Avestan
     * 
     */
    AE,

    /**
     * Aymara
     * 
     */
    AY,

    /**
     * Azerbaijani
     * 
     */
    AZ,

    /**
     * Bashkir
     * 
     */
    BA,

    /**
     * Bambara
     * 
     */
    BM,

    /**
     * Basque
     * 
     */
    EU,

    /**
     * Belarusian
     * 
     */
    BE,

    /**
     * Bengali
     * 
     */
    BN,

    /**
     * Bihari languages
     * 
     */
    BH,

    /**
     * Bislama
     * 
     */
    BI,

    /**
     * Bosnian
     * 
     */
    BS,

    /**
     * Breton
     * 
     */
    BR,

    /**
     * Bulgarian
     * 
     */
    BG,

    /**
     * Burmese
     * 
     */
    MY,

    /**
     * Catalan; Valencian
     * 
     */
    CA,

    /**
     * Chamorro
     * 
     */
    CH,

    /**
     * Chechen
     * 
     */
    CE,

    /**
     * Chinese
     * 
     */
    ZH,

    /**
     * Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic
     * 
     */
    CU,

    /**
     * Chuvash
     * 
     */
    CV,

    /**
     * Cornish
     * 
     */
    KW,

    /**
     * Corsican
     * 
     */
    CO,

    /**
     * Cree
     * 
     */
    CR,

    /**
     * Czech
     * 
     */
    CS,

    /**
     * Danish
     * 
     */
    DA,

    /**
     * Divehi; Dhivehi; Maldivian
     * 
     */
    DV,

    /**
     * Dutch; Flemish
     * 
     */
    NL,

    /**
     * Dzongkha
     * 
     */
    DZ,

    /**
     * English
     * 
     */
    EN,

    /**
     * Esperanto
     * 
     */
    EO,

    /**
     * Estonian
     * 
     */
    ET,

    /**
     * Ewe
     * 
     */
    EE,

    /**
     * Faroese
     * 
     */
    FO,

    /**
     * Fijian
     * 
     */
    FJ,

    /**
     * Finnish
     * 
     */
    FI,

    /**
     * French
     * 
     */
    FR,

    /**
     * Western Frisian
     * 
     */
    FY,

    /**
     * Fulah
     * 
     */
    FF,

    /**
     * Georgian
     * 
     */
    KA,

    /**
     * German
     * 
     */
    DE,

    /**
     * Gaelic; Scottish Gaelic
     * 
     */
    GD,

    /**
     * Irish
     * 
     */
    GA,

    /**
     * Galician
     * 
     */
    GL,

    /**
     * Manx
     * 
     */
    GV,

    /**
     * Greek
     * 
     */
    EL,

    /**
     * Guarani
     * 
     */
    GN,

    /**
     * Gujarati
     * 
     */
    GU,

    /**
     * Haitian; Haitian Creole
     * 
     */
    HT,

    /**
     * Hausa
     * 
     */
    HA,

    /**
     * Hebrew
     * 
     */
    HE,

    /**
     * Herero
     * 
     */
    HZ,

    /**
     * Hindi
     * 
     */
    HI,

    /**
     * Hiri Motu
     * 
     */
    HO,

    /**
     * Croatian
     * 
     */
    HR,

    /**
     * Hungarian
     * 
     */
    HU,

    /**
     * Igbo
     * 
     */
    IG,

    /**
     * Icelandic
     * 
     */
    IS,

    /**
     * Ido
     * 
     */
    IO,

    /**
     * Sichuan Yi; Nuosu
     * 
     */
    II,

    /**
     * Inuktitut
     * 
     */
    IU,

    /**
     * Interlingue; Occidental
     * 
     */
    IE,

    /**
     * Interlingua (International Auxiliary Language Association)
     * 
     */
    IA,

    /**
     * Indonesian
     * 
     */
    ID,

    /**
     * Inupiaq
     * 
     */
    IK,

    /**
     * Italian
     * 
     */
    IT,

    /**
     * Javanese
     * 
     */
    JV,

    /**
     * Japanese
     * 
     */
    JA,

    /**
     * Kalaallisut; Greenlandic
     * 
     */
    KL,

    /**
     * Kannada
     * 
     */
    KN,

    /**
     * Kashmiri
     * 
     */
    KS,

    /**
     * Kanuri
     * 
     */
    KR,

    /**
     * Kazakh
     * 
     */
    KK,

    /**
     * Central Khmer
     * 
     */
    KM,

    /**
     * Kikuyu; Gikuyu
     * 
     */
    KI,

    /**
     * Kinyarwanda
     * 
     */
    RW,

    /**
     * Kirghiz; Kyrgyz
     * 
     */
    KY,

    /**
     * Komi
     * 
     */
    KV,

    /**
     * Kongo
     * 
     */
    KG,

    /**
     * Korean
     * 
     */
    KO,

    /**
     * Kuanyama; Kwanyama
     * 
     */
    KJ,

    /**
     * Kurdish
     * 
     */
    KU,

    /**
     * Lao
     * 
     */
    LO,

    /**
     * Latin
     * 
     */
    LA,

    /**
     * Latvian
     * 
     */
    LV,

    /**
     * Limburgan; Limburger; Limburgish
     * 
     */
    LI,

    /**
     * Lingala
     * 
     */
    LN,

    /**
     * Lithuanian
     * 
     */
    LT,

    /**
     * Luxembourgish; Letzeburgesch
     * 
     */
    LB,

    /**
     * Luba-Katanga
     * 
     */
    LU,

    /**
     * Ganda
     * 
     */
    LG,

    /**
     * North Macedonia
     * 
     */
    MK,

    /**
     * Marshallese
     * 
     */
    MH,

    /**
     * Malayalam
     * 
     */
    ML,

    /**
     * Maori
     * 
     */
    MI,

    /**
     * Marathi
     * 
     */
    MR,

    /**
     * Malay
     * 
     */
    MS,

    /**
     * Malagasy
     * 
     */
    MG,

    /**
     * Maltese
     * 
     */
    MT,

    /**
     * Mongolian
     * 
     */
    MN,

    /**
     * Nauru
     * 
     */
    NA,

    /**
     * Navajo; Navaho
     * 
     */
    NV,

    /**
     * Ndebele, South; South Ndebele
     * 
     */
    NR,

    /**
     * Ndebele, North; North Ndebele
     * 
     */
    ND,

    /**
     * Ndonga
     * 
     */
    NG,

    /**
     * Nepali
     * 
     */
    NE,

    /**
     * Norwegian Nynorsk; Nynorsk, Norwegian
     * 
     */
    NN,

    /**
     * Bokm??l, Norwegian; Norwegian Bokm??l
     * 
     */
    NB,

    /**
     * Norwegian
     * 
     */
    NO,

    /**
     * Chichewa; Chewa; Nyanja
     * 
     */
    NY,

    /**
     * Occitan (post 1500)
     * 
     */
    OC,

    /**
     * Ojibwa
     * 
     */
    OJ,

    /**
     * Oriya
     * 
     */
    OR,

    /**
     * Oromo
     * 
     */
    OM,

    /**
     * Ossetian; Ossetic
     * 
     */
    OS,

    /**
     * Panjabi; Punjabi
     * 
     */
    PA,

    /**
     * Persian
     * 
     */
    FA,

    /**
     * Pali
     * 
     */
    PI,

    /**
     * Polish
     * 
     */
    PL,

    /**
     * Portuguese
     * 
     */
    PT,

    /**
     * Pushto; Pashto
     * 
     */
    PS,

    /**
     * Quechua
     * 
     */
    QU,

    /**
     * Romansh
     * 
     */
    RM,

    /**
     * Romanian; Moldavian; Moldovan
     * 
     */
    RO,

    /**
     * Rundi
     * 
     */
    RN,

    /**
     * Russian
     * 
     */
    RU,

    /**
     * Sango
     * 
     */
    SG,

    /**
     * Sanskrit
     * 
     */
    SA,

    /**
     * Sinhala; Sinhalese
     * 
     */
    SI,

    /**
     * Slovak
     * 
     */
    SK,

    /**
     * Slovenian
     * 
     */
    SL,

    /**
     * Northern Sami
     * 
     */
    SE,

    /**
     * Samoan
     * 
     */
    SM,

    /**
     * Shona
     * 
     */
    SN,

    /**
     * Sindhi
     * 
     */
    SD,

    /**
     * Somali
     * 
     */
    SO,

    /**
     * Sotho, Southern
     * 
     */
    ST,

    /**
     * Spanish; Castilian
     * 
     */
    ES,

    /**
     * Sardinian
     * 
     */
    SC,

    /**
     * Serbian
     * 
     */
    SR,

    /**
     * Swati
     * 
     */
    SS,

    /**
     * Sundanese
     * 
     */
    SU,

    /**
     * Swahili
     * 
     */
    SW,

    /**
     * Swedish
     * 
     */
    SV,

    /**
     * Tahitian
     * 
     */
    TY,

    /**
     * Tamil
     * 
     */
    TA,

    /**
     * Tatar
     * 
     */
    TT,

    /**
     * Telugu
     * 
     */
    TE,

    /**
     * Tajik
     * 
     */
    TG,

    /**
     * Tagalog
     * 
     */
    TL,

    /**
     * Thai
     * 
     */
    TH,

    /**
     * Tibetan
     * 
     */
    BO,

    /**
     * Tigrinya
     * 
     */
    TI,

    /**
     * Tonga (Tonga Islands)
     * 
     */
    TO,

    /**
     * Tswana
     * 
     */
    TN,

    /**
     * Tsonga
     * 
     */
    TS,

    /**
     * Turkmen
     * 
     */
    TK,

    /**
     * Turkish
     * 
     */
    TR,

    /**
     * Twi
     * 
     */
    TW,

    /**
     * Uighur; Uyghur
     * 
     */
    UG,

    /**
     * Ukrainian
     * 
     */
    UK,

    /**
     * Urdu
     * 
     */
    UR,

    /**
     * Uzbek
     * 
     */
    UZ,

    /**
     * Venda
     * 
     */
    VE,

    /**
     * Vietnamese
     * 
     */
    VI,

    /**
     * Volap??k
     * 
     */
    VO,

    /**
     * Welsh
     * 
     */
    CY,

    /**
     * Walloon
     * 
     */
    WA,

    /**
     * Wolof
     * 
     */
    WO,

    /**
     * Xhosa
     * 
     */
    XH,

    /**
     * Yiddish
     * 
     */
    YI,

    /**
     * Yoruba
     * 
     */
    YO,

    /**
     * Zhuang; Chuang
     * 
     */
    ZA,

    /**
     * Zulu
     * 
     */
    ZU;

    public String value() {
        return name();
    }

    public static LanguageCodeType fromValue(String v) {
        return valueOf(v);
    }

}
