package org.dimigo.gui.UniAll;

import javafx.beans.property.SimpleStringProperty;

public class Univ {

    private SimpleStringProperty schoolName;
    private SimpleStringProperty campusName;
    private SimpleStringProperty schoolType;
    private SimpleStringProperty schoolGubun;
    private SimpleStringProperty adres;
    private SimpleStringProperty estType;
    private SimpleStringProperty link;

    public Univ(String schoolName, String campusName, String schoolType, String schoolGubun, String adres, String estType, String link) {
        this.schoolName = new SimpleStringProperty(schoolName);
        this.campusName = new SimpleStringProperty(campusName);
        this.schoolType = new SimpleStringProperty(schoolType);
        this.schoolGubun = new SimpleStringProperty(schoolGubun);
        this.adres = new SimpleStringProperty(adres);
        this.estType = new SimpleStringProperty(estType);
        this.link = new SimpleStringProperty(link);

    }

    public String getSchoolName() {
        return schoolName.get();
    }

    public SimpleStringProperty schoolNameProperty() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName.set(schoolName);
    }

    public String getCampusName() {
        return campusName.get();
    }

    public SimpleStringProperty campusNameProperty() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName.set(campusName);
    }

    public String getSchoolType() {
        return schoolType.get();
    }

    public SimpleStringProperty schoolTypeProperty() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType.set(schoolType);
    }

    public String getSchoolGubun() {
        return schoolGubun.get();
    }

    public SimpleStringProperty schoolGubunProperty() {
        return schoolGubun;
    }

    public void setSchoolGubun(String schoolGubun) {
        this.schoolGubun.set(schoolGubun);
    }

    public String getAdres() {
        return adres.get();
    }

    public SimpleStringProperty adresProperty() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres.set(adres);
    }

    public String getEstType() {
        return estType.get();
    }

    public SimpleStringProperty estTypeProperty() {
        return estType;
    }

    public void setEstType(String estType) {
        this.estType.set(estType);
    }

    public String getLink() {
        return link.get();
    }

    public SimpleStringProperty linkProperty() {
        return link;
    }

    public void setLink(String link) {
        this.link.set(link);
    }

    @Override
    public String toString() {
        return schoolName + " " + campusName + "(" + schoolType + ")"
                + "\n구분 : " + schoolGubun
                + "\n주소 : " + adres
                + "\n설립유형 : " + estType
                + "\n학교 사이트 : " + link;
    }

}
