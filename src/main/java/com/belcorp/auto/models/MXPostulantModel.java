package com.belcorp.auto.models;

public class MXPostulantModel {

    private static String Names;
    private static String FirstLastName;
    private static String SecondLastName;
    private static String BirthDate;
    private static String Gender;
    private static String CelNumber;
    private static String Email;
    private static String Municipality;
    private static String LinkMTOName;
    private static String RFC;

    public static String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public static String getFirstLastName() {
        return FirstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        FirstLastName = firstLastName;
    }

    public static String getSecondLastName() {
        return SecondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        SecondLastName = secondLastName;
    }

    public static String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public static String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public static String getCelNumber() {
        return CelNumber;
    }

    public void setCelNumber(String celNumber) {
        CelNumber = celNumber;
    }

    public static String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public static String getMunicipality() {
        return Municipality;
    }

    public void setMunicipality(String municipality) {
        Municipality = municipality;
    }

    public static String getLinkMTOName() {
        return LinkMTOName;
    }

    public void setLinkMTOName(String linkMTOName) {
        LinkMTOName = linkMTOName;
    }

    public static String getRFC() {
        return RFC;
    }

    public void setRFC(String rfc) {
        RFC = rfc;
    }
}
