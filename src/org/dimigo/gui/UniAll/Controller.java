package org.dimigo.gui.UniAll;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private CheckBox Gangwon;
    @FXML private CheckBox Gyeonggi;
    @FXML private CheckBox Gyeongnam;
    @FXML private CheckBox Gyeongbuk;
    @FXML private CheckBox Gwangju;
    @FXML private CheckBox Daegu;
    @FXML private CheckBox Daejeon;
    @FXML private CheckBox Busan;
    @FXML private CheckBox Seoul;
    @FXML private CheckBox Sejong;
    @FXML private CheckBox Ulsan;
    @FXML private CheckBox Incheon;
    @FXML private CheckBox Jeonnam;
    @FXML private CheckBox Jeonbuk;
    @FXML private CheckBox Jeju;
    @FXML private CheckBox Chungnam;
    @FXML private CheckBox Chungbuk;


    @FXML private CheckBox nat;
    @FXML private CheckBox pub;
    @FXML private CheckBox pri;


    @FXML private CheckBox tec;
    @FXML private CheckBox unicol;

    @FXML private TableView univTableView;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
    }


    @FXML
    public void handleSearchAction(ActionEvent event) {
//        //콤보박스
//        SearchType item = cbSearch.getSelectionModel().getSelectedItem();
//        String type = item.getValue();
//        String text = txtSearch.getText();
//        System.out.printf("type: %s, text: %s\n", type, text);
//        Scrap.Scrap();

        try {

            String region = "";
            String type = "";
            String Gubun = "";


            if (nat.isSelected()) {
                type = "국립";
                if (tec.isSelected()) {
                    Gubun = "전문";
                    if (Gangwon.isSelected()) {
                        region = "강원도";
                        yay(region, type, Gubun);
                    } if (Gyeonggi.isSelected()) {
                        region = "경기도";
                        yay(region, type, Gubun);
                    } if (Gyeongnam.isSelected()) {
                        region = "경상남도";
                        yay(region, type, Gubun);
                    } if (Gyeongbuk.isSelected()) {
                        region = "경상북도";
                        yay(region, type, Gubun);
                    } if (Gwangju.isSelected()) {
                        region = "광주광역시";
                        yay(region, type, Gubun);
                    } if (Daegu.isSelected()) {
                        region = "대구광역시";
                        yay(region, type, Gubun);
                    } if (Daejeon.isSelected()) {
                        region = "대전광역시";
                        yay(region, type, Gubun);
                    } if (Busan.isSelected()) {
                        region = "부산광역시";
                        yay(region, type, Gubun);
                    } if (Seoul.isSelected()) {
                        region = "서울특별시";
                        yay(region, type, Gubun);
                    } if (Sejong.isSelected()) {
                        region = "세종특별시";
                        yay(region, type, Gubun);
                    } if (Ulsan.isSelected()) {
                        region = "울산광역시";
                        yay(region, type, Gubun);
                    } if (Incheon.isSelected()) {
                        region = "인천광역시";
                        yay(region, type, Gubun);
                    } if (Jeonnam.isSelected()) {
                        region = "전라남도";
                        yay(region, type, Gubun);
                    } if (Jeonbuk.isSelected()) {
                        region = "전라북도";
                        yay(region, type, Gubun);
                    } if (Jeju.isSelected()) {
                        region = "제주특별시";
                        yay(region, type, Gubun);
                    } if (Chungnam.isSelected()) {
                        region = "충청남도";
                        yay(region, type, Gubun);
                    } if (Chungbuk.isSelected()) {
                        region = "충청북도";
                        yay(region, type, Gubun);
                    } if (region == ""){
                        yay(region, type, Gubun);
                    }

                }

                if (unicol.isSelected()) {
                    Gubun = "대학";
                    if (Gangwon.isSelected()) {
                        region = "강원도";
                        yay(region, type, Gubun);
                    } if (Gyeonggi.isSelected()) {
                        region = "경기도";
                        yay(region, type, Gubun);
                    } if (Gyeongnam.isSelected()) {
                        region = "경상남도";
                        yay(region, type, Gubun);
                    } if (Gyeongbuk.isSelected()) {
                        region = "경상북도";
                        yay(region, type, Gubun);
                    } if (Gwangju.isSelected()) {
                        region = "광주광역시";
                        yay(region, type, Gubun);
                    } if (Daegu.isSelected()) {
                        region = "대구광역시";
                        yay(region, type, Gubun);
                    } if (Daejeon.isSelected()) {
                        region = "대전광역시";
                        yay(region, type, Gubun);
                    } if (Busan.isSelected()) {
                        region = "부산광역시";
                        yay(region, type, Gubun);
                    } if (Seoul.isSelected()) {
                        region = "서울특별시";
                        yay(region, type, Gubun);
                    } if (Sejong.isSelected()) {
                        region = "세종특별시";
                        yay(region, type, Gubun);
                    } if (Ulsan.isSelected()) {
                        region = "울산광역시";
                        yay(region, type, Gubun);
                    } if (Incheon.isSelected()) {
                        region = "인천광역시";
                        yay(region, type, Gubun);
                    } if (Jeonnam.isSelected()) {
                        region = "전라남도";
                        yay(region, type, Gubun);
                    } if (Jeonbuk.isSelected()) {
                        region = "전라북도";
                        yay(region, type, Gubun);
                    } if (Jeju.isSelected()) {
                        region = "제주특별시";
                        yay(region, type, Gubun);
                    } if (Chungnam.isSelected()) {
                        region = "충청남도";
                        yay(region, type, Gubun);
                    } if (Chungbuk.isSelected()) {
                        region = "충청북도";
                        yay(region, type, Gubun);
                    } if (region == ""){
                        yay(region, type, Gubun);
                    }
                }

                if (region == "" && Gubun == ""){
                    yay(region, type, Gubun);
                }
            }

            if (pub.isSelected()) {
                type = "공립";
                if (tec.isSelected()) {
                    Gubun = "전문";
                    if (Gangwon.isSelected()) {
                        region = "강원도";
                        yay(region, type, Gubun);
                    } if (Gyeonggi.isSelected()) {
                        region = "경기도";
                        yay(region, type, Gubun);
                    } if (Gyeongnam.isSelected()) {
                        region = "경상남도";
                        yay(region, type, Gubun);
                    } if (Gyeongbuk.isSelected()) {
                        region = "경상북도";
                        yay(region, type, Gubun);
                    } if (Gwangju.isSelected()) {
                        region = "광주광역시";
                        yay(region, type, Gubun);
                    } if (Daegu.isSelected()) {
                        region = "대구광역시";
                        yay(region, type, Gubun);
                    } if (Daejeon.isSelected()) {
                        region = "대전광역시";
                        yay(region, type, Gubun);
                    } if (Busan.isSelected()) {
                        region = "부산광역시";
                        yay(region, type, Gubun);
                    } if (Seoul.isSelected()) {
                        region = "서울특별시";
                        yay(region, type, Gubun);
                    } if (Sejong.isSelected()) {
                        region = "세종특별시";
                        yay(region, type, Gubun);
                    } if (Ulsan.isSelected()) {
                        region = "울산광역시";
                        yay(region, type, Gubun);
                    } if (Incheon.isSelected()) {
                        region = "인천광역시";
                        yay(region, type, Gubun);
                    } if (Jeonnam.isSelected()) {
                        region = "전라남도";
                        yay(region, type, Gubun);
                    } if (Jeonbuk.isSelected()) {
                        region = "전라북도";
                        yay(region, type, Gubun);
                    } if (Jeju.isSelected()) {
                        region = "제주특별시";
                        yay(region, type, Gubun);
                    } if (Chungnam.isSelected()) {
                        region = "충청남도";
                        yay(region, type, Gubun);
                    } if (Chungbuk.isSelected()) {
                        region = "충청북도";
                        yay(region, type, Gubun);
                    } if (region == ""){
                        yay(region, type, Gubun);
                    }

                }

                if (unicol.isSelected()) {
                    Gubun = "대학";
                    if (Gangwon.isSelected()) {
                        region = "강원도";
                        yay(region, type, Gubun);
                    } if (Gyeonggi.isSelected()) {
                        region = "경기도";
                        yay(region, type, Gubun);
                    } if (Gyeongnam.isSelected()) {
                        region = "경상남도";
                        yay(region, type, Gubun);
                    } if (Gyeongbuk.isSelected()) {
                        region = "경상북도";
                        yay(region, type, Gubun);
                    } if (Gwangju.isSelected()) {
                        region = "광주광역시";
                        yay(region, type, Gubun);
                    } if (Daegu.isSelected()) {
                        region = "대구광역시";
                        yay(region, type, Gubun);
                    } if (Daejeon.isSelected()) {
                        region = "대전광역시";
                        yay(region, type, Gubun);
                    } if (Busan.isSelected()) {
                        region = "부산광역시";
                        yay(region, type, Gubun);
                    } if (Seoul.isSelected()) {
                        region = "서울특별시";
                        yay(region, type, Gubun);
                    } if (Sejong.isSelected()) {
                        region = "세종특별시";
                        yay(region, type, Gubun);
                    } if (Ulsan.isSelected()) {
                        region = "울산광역시";
                        yay(region, type, Gubun);
                    } if (Incheon.isSelected()) {
                        region = "인천광역시";
                        yay(region, type, Gubun);
                    } if (Jeonnam.isSelected()) {
                        region = "전라남도";
                        yay(region, type, Gubun);
                    } if (Jeonbuk.isSelected()) {
                        region = "전라북도";
                        yay(region, type, Gubun);
                    } if (Jeju.isSelected()) {
                        region = "제주특별시";
                        yay(region, type, Gubun);
                    } if (Chungnam.isSelected()) {
                        region = "충청남도";
                        yay(region, type, Gubun);
                    } if (Chungbuk.isSelected()) {
                        region = "충청북도";
                        yay(region, type, Gubun);
                    } if (region == ""){
                        yay(region, type, Gubun);
                    }
                }

                if (region == "" && Gubun == ""){
                    yay(region, type, Gubun);
                }
            }

            if (pri.isSelected()) {
                type = "사립";
                if (tec.isSelected()) {
                    Gubun = "전문";
                    if (Gangwon.isSelected()) {
                        region = "강원도";
                        yay(region, type, Gubun);
                    } if (Gyeonggi.isSelected()) {
                        region = "경기도";
                        yay(region, type, Gubun);
                    } if (Gyeongnam.isSelected()) {
                        region = "경상남도";
                        yay(region, type, Gubun);
                    } if (Gyeongbuk.isSelected()) {
                        region = "경상북도";
                        yay(region, type, Gubun);
                    } if (Gwangju.isSelected()) {
                        region = "광주광역시";
                        yay(region, type, Gubun);
                    } if (Daegu.isSelected()) {
                        region = "대구광역시";
                        yay(region, type, Gubun);
                    } if (Daejeon.isSelected()) {
                        region = "대전광역시";
                        yay(region, type, Gubun);
                    } if (Busan.isSelected()) {
                        region = "부산광역시";
                        yay(region, type, Gubun);
                    } if (Seoul.isSelected()) {
                        region = "서울특별시";
                        yay(region, type, Gubun);
                    } if (Sejong.isSelected()) {
                        region = "세종특별시";
                        yay(region, type, Gubun);
                    } if (Ulsan.isSelected()) {
                        region = "울산광역시";
                        yay(region, type, Gubun);
                    } if (Incheon.isSelected()) {
                        region = "인천광역시";
                        yay(region, type, Gubun);
                    } if (Jeonnam.isSelected()) {
                        region = "전라남도";
                        yay(region, type, Gubun);
                    } if (Jeonbuk.isSelected()) {
                        region = "전라북도";
                        yay(region, type, Gubun);
                    } if (Jeju.isSelected()) {
                        region = "제주특별시";
                        yay(region, type, Gubun);
                    } if (Chungnam.isSelected()) {
                        region = "충청남도";
                        yay(region, type, Gubun);
                    } if (Chungbuk.isSelected()) {
                        region = "충청북도";
                        yay(region, type, Gubun);
                    } if (region == ""){
                        yay(region, type, Gubun);
                    }

                }

                if (unicol.isSelected()) {
                    Gubun = "대학";
                    if (Gangwon.isSelected()) {
                        region = "강원도";
                        yay(region, type, Gubun);
                    } if (Gyeonggi.isSelected()) {
                        region = "경기도";
                        yay(region, type, Gubun);
                    } if (Gyeongnam.isSelected()) {
                        region = "경상남도";
                        yay(region, type, Gubun);
                    } if (Gyeongbuk.isSelected()) {
                        region = "경상북도";
                        yay(region, type, Gubun);
                    } if (Gwangju.isSelected()) {
                        region = "광주광역시";
                        yay(region, type, Gubun);
                    } if (Daegu.isSelected()) {
                        region = "대구광역시";
                        yay(region, type, Gubun);
                    } if (Daejeon.isSelected()) {
                        region = "대전광역시";
                        yay(region, type, Gubun);
                    } if (Busan.isSelected()) {
                        region = "부산광역시";
                        yay(region, type, Gubun);
                    } if (Seoul.isSelected()) {
                        region = "서울특별시";
                        yay(region, type, Gubun);
                    } if (Sejong.isSelected()) {
                        region = "세종특별시";
                        yay(region, type, Gubun);
                    } if (Ulsan.isSelected()) {
                        region = "울산광역시";
                        yay(region, type, Gubun);
                    } if (Incheon.isSelected()) {
                        region = "인천광역시";
                        yay(region, type, Gubun);
                    } if (Jeonnam.isSelected()) {
                        region = "전라남도";
                        yay(region, type, Gubun);
                    } if (Jeonbuk.isSelected()) {
                        region = "전라북도";
                        yay(region, type, Gubun);
                    } if (Jeju.isSelected()) {
                        region = "제주특별시";
                        yay(region, type, Gubun);
                    } if (Chungnam.isSelected()) {
                        region = "충청남도";
                        yay(region, type, Gubun);
                    } if (Chungbuk.isSelected()) {
                        region = "충청북도";
                        yay(region, type, Gubun);
                    } if (region == ""){
                        yay(region, type, Gubun);
                    }
                }

                if (region == "" && Gubun == ""){
                    yay(region, type, Gubun);
                }
            }

            if (tec.isSelected()) {
                Gubun = "전문";
                if (Gangwon.isSelected()) {
                    region = "강원도";
                    yay(region, type, Gubun);
                } if (Gyeonggi.isSelected()) {
                    region = "경기도";
                    yay(region, type, Gubun);
                } if (Gyeongnam.isSelected()) {
                    region = "경상남도";
                    yay(region, type, Gubun);
                } if (Gyeongbuk.isSelected()) {
                    region = "경상북도";
                    yay(region, type, Gubun);
                } if (Gwangju.isSelected()) {
                    region = "광주광역시";
                    yay(region, type, Gubun);
                } if (Daegu.isSelected()) {
                    region = "대구광역시";
                    yay(region, type, Gubun);
                } if (Daejeon.isSelected()) {
                    region = "대전광역시";
                    yay(region, type, Gubun);
                } if (Busan.isSelected()) {
                    region = "부산광역시";
                    yay(region, type, Gubun);
                } if (Seoul.isSelected()) {
                    region = "서울특별시";
                    yay(region, type, Gubun);
                } if (Sejong.isSelected()) {
                    region = "세종특별시";
                    yay(region, type, Gubun);
                } if (Ulsan.isSelected()) {
                    region = "울산광역시";
                    yay(region, type, Gubun);
                } if (Incheon.isSelected()) {
                    region = "인천광역시";
                    yay(region, type, Gubun);
                } if (Jeonnam.isSelected()) {
                    region = "전라남도";
                    yay(region, type, Gubun);
                } if (Jeonbuk.isSelected()) {
                    region = "전라북도";
                    yay(region, type, Gubun);
                } if (Jeju.isSelected()) {
                    region = "제주특별시";
                    yay(region, type, Gubun);
                } if (Chungnam.isSelected()) {
                    region = "충청남도";
                    yay(region, type, Gubun);
                } if (Chungbuk.isSelected()) {
                    region = "충청북도";
                    yay(region, type, Gubun);
                } if (region == ""){
                    yay(region, type, Gubun);
                }

            }

            if (unicol.isSelected()) {
                Gubun = "대학";
                if (Gangwon.isSelected()) {
                    region = "강원도";
                    yay(region, type, Gubun);
                } if (Gyeonggi.isSelected()) {
                    region = "경기도";
                    yay(region, type, Gubun);
                } if (Gyeongnam.isSelected()) {
                    region = "경상남도";
                    yay(region, type, Gubun);
                } if (Gyeongbuk.isSelected()) {
                    region = "경상북도";
                    yay(region, type, Gubun);
                } if (Gwangju.isSelected()) {
                    region = "광주광역시";
                    yay(region, type, Gubun);
                } if (Daegu.isSelected()) {
                    region = "대구광역시";
                    yay(region, type, Gubun);
                } if (Daejeon.isSelected()) {
                    region = "대전광역시";
                    yay(region, type, Gubun);
                } if (Busan.isSelected()) {
                    region = "부산광역시";
                    yay(region, type, Gubun);
                } if (Seoul.isSelected()) {
                    region = "서울특별시";
                    yay(region, type, Gubun);
                } if (Sejong.isSelected()) {
                    region = "세종특별시";
                    yay(region, type, Gubun);
                } if (Ulsan.isSelected()) {
                    region = "울산광역시";
                    yay(region, type, Gubun);
                } if (Incheon.isSelected()) {
                    region = "인천광역시";
                    yay(region, type, Gubun);
                } if (Jeonnam.isSelected()) {
                    region = "전라남도";
                    yay(region, type, Gubun);
                } if (Jeonbuk.isSelected()) {
                    region = "전라북도";
                    yay(region, type, Gubun);
                } if (Jeju.isSelected()) {
                    region = "제주특별시";
                    yay(region, type, Gubun);
                } if (Chungnam.isSelected()) {
                    region = "충청남도";
                    yay(region, type, Gubun);
                } if (Chungbuk.isSelected()) {
                    region = "충청북도";
                    yay(region, type, Gubun);
                } if (region == ""){
                    yay(region, type, Gubun);
                }
            }

            if (Gangwon.isSelected()) {
                region = "강원도";
                yay(region, type, Gubun);
            } if (Gyeonggi.isSelected()) {
                region = "경기도";
                yay(region, type, Gubun);
            } if (Gyeongnam.isSelected()) {
                region = "경상남도";
                yay(region, type, Gubun);
            } if (Gyeongbuk.isSelected()) {
                region = "경상북도";
                yay(region, type, Gubun);
            } if (Gwangju.isSelected()) {
                region = "광주광역시";
                yay(region, type, Gubun);
            } if (Daegu.isSelected()) {
                region = "대구광역시";
                yay(region, type, Gubun);
            } if (Daejeon.isSelected()) {
                region = "대전광역시";
                yay(region, type, Gubun);
            } if (Busan.isSelected()) {
                region = "부산광역시";
                yay(region, type, Gubun);
            } if (Seoul.isSelected()) {
                region = "서울특별시";
                yay(region, type, Gubun);
            } if (Sejong.isSelected()) {
                region = "세종특별시";
                yay(region, type, Gubun);
            } if (Ulsan.isSelected()) {
                region = "울산광역시";
                yay(region, type, Gubun);
            } if (Incheon.isSelected()) {
                region = "인천광역시";
                yay(region, type, Gubun);
            } if (Jeonnam.isSelected()) {
                region = "전라남도";
                yay(region, type, Gubun);
            } if (Jeonbuk.isSelected()) {
                region = "전라북도";
                yay(region, type, Gubun);
            } if (Jeju.isSelected()) {
                region = "제주특별시";
                yay(region, type, Gubun);
            } if (Chungnam.isSelected()) {
                region = "충청남도";
                yay(region, type, Gubun);
            } if (Chungbuk.isSelected()) {
                region = "충청북도";
                yay(region, type, Gubun);
            }

            if (region == "" && type == "" && Gubun == ""){
                yay(region, type, Gubun);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void yay(String region, String type, String Gubun){
        List<Univ> univList = new Scrap().Scrap(region, type, Gubun);

        ObservableList<Univ> data = FXCollections.observableArrayList(univList);
        univTableView.setItems(data);
        bindUnivTableColumn();
    }

    private void bindUnivTableColumn() {
        TableColumn schoolName = (TableColumn) univTableView.getColumns().get(0);
        schoolName.setCellValueFactory(new PropertyValueFactory<Univ, String>("schoolName"));
        TableColumn campusName = (TableColumn) univTableView.getColumns().get(1);
        campusName.setCellValueFactory(new PropertyValueFactory<Univ, String>("campusName"));
        TableColumn schoolType = (TableColumn) univTableView.getColumns().get(2);
        schoolType.setCellValueFactory(new PropertyValueFactory<Univ, String>("schoolType"));
        TableColumn schoolGubun = (TableColumn) univTableView.getColumns().get(3);
        schoolGubun.setCellValueFactory(new PropertyValueFactory<Univ, String>("schoolGubun"));
        TableColumn adres = (TableColumn) univTableView.getColumns().get(4);
        adres.setCellValueFactory(new PropertyValueFactory<Univ, String>("adres"));
        TableColumn estType = (TableColumn) univTableView.getColumns().get(5);
        estType.setCellValueFactory(new PropertyValueFactory<Univ, String>("estType"));
        TableColumn link = (TableColumn) univTableView.getColumns().get(6);
        link.setCellValueFactory(new PropertyValueFactory<Univ, String>("link"));
    }

    @FXML private Label lbl_hello;

    @FXML
    public void handleAction(ActionEvent event){
        if(lbl_hello.getText().equals("")){
            lbl_hello.setText(" ");
        } else if (lbl_hello.getText().equals(" ")){
            lbl_hello.setText("      In");
        } else if (lbl_hello.getText().equals("      In")){
            lbl_hello.setText("  ");
        } else if (lbl_hello.getText().equals("  ")){
            lbl_hello.setText("Hmm..");
        } else if (lbl_hello.getText().equals("Hmm..")){
            lbl_hello.setText(" ");
        }
    }



    @FXML private Button SearchbyName;

    @FXML
    public void changeWindow(ActionEvent event) throws IOException {

        Stage stage = (Stage) SearchbyName.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UniAll2.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }
}