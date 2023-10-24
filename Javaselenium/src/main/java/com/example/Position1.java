package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Position1 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        String[] partner = { "VSTF", "AODP", "DW", "FITW", "SOFT", "JHPA", "STKE", "KHOA", "RVUS", "GOPI", "MATH", "TIME", "DWQA", "MAHI", "SEPT", "CNCL", "KRUG", "KVPT", "GOOD", "CTIN", "VSTF", "AODP", "DW", "FITW", "SOFT", "JHPA", "STKE", "KHOA", "RVUS", "GOPI", "MATH", "TIME", "DWQA", "MAHI", "SEPT", "CNCL", "KRUG", "KVPT", "GOOD", "CTIN", "VSTF", "AODP", "DW", "FITW", "SOFT", "JHPA", "STKE", "KHOA", "RVUS", "GOPI", "MATH", "TIME", "DWQA", "MAHI", "SEPT", "CNCL", "KRUG", "KVPT", "GOOD", "CTIN", "VSTF", "AODP", "DW", "FITW", "SOFT", "JHPA", "STKE", "KHOA", "RVUS", "GOPI", "MATH", "TIME", "DWQA", "MAHI", "SEPT", "CNCL", "KRUG", "KVPT", "GOOD", "CTIN", "VSTF", "AODP", "DW", "FITW", "SOFT", "JHPA", "STKE", "KHOA", "RVUS", "GOPI", "MATH", "TIME", "DWQA", "MAHI", "SEPT", "CNCL", "KRUG", "KVPT", "GOOD", "CTIN"};
        String[] accountno = { "DWUW000538", "KRYM000361", "DWUF000694", "FWAB000003", "VTRQ000009", "VTEP000005", "VTGR000005", "FWMF000001", "VTPA000007", "STQY000027", "DWRH000616", "FWVW000001", "FWGJ000003", "DWGW000706", "FWAF000005", "VTMA000007", "STUQ000013", "VTBY000001", "GMTU000001", "KREW000373", "FWTA000003", "VTAR000001", "DWQH000580", "FWVC000001", "VTUR000007", "VTGQ000009", "CTBM000001", "KRVV000379", "VTAX000003", "RESJ000007", "FWAE000001", "STQU000021", "STXG000011", "KRSV000419", "VTME000003", "VTMV000007", "FWWM000001", "FWYJ000001", "KRNV000353", "FWQM000001", "VTUM000005", "KRJY000361", "STEQ000019", "VTHM000009", "DWRE000352", "DWGC000724", "KRRX000351", "DWPS000201", "STAW000017", "VTSZ000003", "FWNH000001", "FWFH000003", "FWNS000003", "KRYG000355", "VTVD000001", "DWAV000595", "DWZZ000548", "STQQ000035", "KRFV000341", "VTRY000003", "FWZP000001", "VTDT000007", "VTZS000007", "STWD000011", "VTBX000003", "KRYM000365", "STSQ000025", "VTKN000011", "STAB000025", "VTUJ000003", "DWGV000559", "STPC000011", "VTDH000007", "VTZA000013", "DWJE000571", "VTGQ000011", "STTD000019", "VTVW000005", "DPAA000020", "KRMJ000399", "VTNS000011", "VTHZ000009", "STQF000023", "FWPW000003", "DWQU000647", "STPA000029", "STKR000029", "VTPM000011", "ZEZC007143", "FWAS000005", "STST000023", "STYR000017", "DWGT000592", "STRP000023", "KRBN000375", "VTUT000011", "VTXQ000003", "VTRG000005", "KRHE000367", "RUZE000001"};
        String[] symbols = {"AAON", "AIR", "ABB", "ABCM", "ACCO", "ACNB", "ADT", "ABSI", "ACVA", "ABM", "AFAQ", "AFL", "AGCO", "ACMR", "AFCG", "MITT", "AGNC", "AES", "AAGIY", "ATFAX", "LCEYX", "OPGVX", "STBYX", "ACEIX", "IUGXX", "IPPXX", "OIBYX", "ACSTX", "QVOPX", "AKA", "AMCX", "AMC", "ALXO", "MGSDX", "AMN", "POWW", "HKIB", "AMRK", "ANIP", "ANGI", "APG", "ASGN", "AMKBY", "QECRX", "QICRX", "QCERX", "ASANX", "AQMNX", "T", "ATEN", "ATNI", "ASX", "ATIP", "ASTS", "AUOTY", "AXTI", "AZZ", "AAN", "ABT", "ABBV", "ABCL", "ANF", "ABEO", "GLLAX", "ABMD", "ABST", "ACTG", "ASO", "ACHC", "ACAD", "AKR", "AXDX", "XLRN", "ACEL", "ACCD", "ARAY", "AAQC", "ACRX", "ACIW", "ACHL", "ACHN", "ACRS", "ACOR", "ATVI", "AYI", "GOLF", "ABOS", "ATY", "AFIB", "ADAG", "ADGI", "ADMS", "ADPT", "ADAP", "AHCO", "ADUS", "ADDYY", "ACET", "ADEX", "ADBE"};
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/home/nishanthi/Desktop/seclending1/STKE_POS_20220928.csv", true));
        writer.append("system_dt,corr,office,acct_no,acct_type,sub_acct_no,ac_grp_cd,currency,symbol,sec_no,sec_type,tclose,sclose,price,tmktval,ucost,tcost,fed_req_value,ex_req_value,ho_req_value,sec_descr");
        for (int i = 0; i < partner.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                String input = "09/28/2022," + partner[i] + ",3," + accountno[j] + ",L,AC005,504,USD," + symbols[j]
                        + ",13817510,L,500,500,42.7,1900.36,46.950084,2103.48,768.64,385.82,462.38,AGILENT TECHNOLOGIES INC    COM";
                writer.append("\n");
                writer.append(input);

            }
        }

        writer.close();
    }

}
