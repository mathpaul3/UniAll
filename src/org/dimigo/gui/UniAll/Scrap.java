package org.dimigo.gui.UniAll;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Scrap {

//    @SuppressWarnings("unchecked")
//    public static List<Univ> getUnivList(String keyword) throws Exception {
//        String response = Scrap("univ", keyword, "dang");
//
//        List<Univ> result = new ArrayList<>();
//        Map<String, Object> map = new ObjectMapper().readValue(response, Map.class);
//
//        List<Map<String, String>> list = (List<Map<String, String>>) map.get("items");
//
//        for (Map<String, String> univ : list){
//            String schoolName = univ.get("schoolName").replaceAll("\\<.*?>","");
//            String region = univ.get("region");
//            String estType = univ.get("estType");
//            String schoolGubun = univ.get("schoolGubun");
//        }
//    }


    //api 긁어오기
    public static List<Univ> Scrap(String region, String type, String Gubun) {
        List<Univ> univList = null;
        try {
            //불러올 URL
            String urlStr = "http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=b76b94a56aa1faf6d9c8658d8719d44c&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&perPage=457";
            URL url = new URL(urlStr);

            //데이터 받아오기
            BufferedReader bf;
            String line = "";
            String result = "";
            bf = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line = bf.readLine()) != null) {
                result = result.concat(line);
                univList = list(result, region, type, Gubun);

            }
            //예외처리
        } catch (Exception e) {
            e.printStackTrace();
            //값 넘기기
        }
        return univList;
    }


    private static List<Univ> list(String s, String changeregion, String changeestType, String changgeschoolGubun) throws IOException {
        Map map = new ObjectMapper().readValue(s, Map.class);


        //dataSearch Map에서 content list 받아오기
        List<Map<String, String>> list = (List) ((Map) map.get("dataSearch")).get("content");


        //Scrap으로 보낼 returnlist
        List<Univ> returnlist = new ArrayList<>();

        //for문으로 정보 받아오기
        for (Map<String, String> value : list) {
            String adres = value.get("adres");
            if (adres.equals("9999")) {
                adres = "경상남도 창원시 진해구 중원로 1 (속천동, 해군사관학교)";
            }
            //지역 선택시 주소 걸러내기
            if(adres.startsWith(changeregion)) {
                String estType = value.get("estType");

                //설립 유형 선택시 설립유형 걸러내기
                if(estType.startsWith(changeestType)) {
                    String schoolGubun = value.get("schoolGubun");
                    if (schoolGubun.equals("null")){
                        schoolGubun = "전문대학";
                    }
                        //학교 구분 선택시 학교 구분 걸러내기
                    if (schoolGubun.startsWith(changgeschoolGubun)) {
                        String schoolName = value.get("schoolName");
                        String campusName = value.get("campusName");

                        if (campusName.equals("null")) {
                            campusName = "본교";
                        }

                        String schoolType = value.get("schoolType");

                        if (schoolType.equals("null")) {
                            schoolType = "전문대학";
                        }

                        String link = value.get("link");

                        if (link.equals("null")) {
                            link = "링크가 없습니다!";
                        }


                        System.out.println(schoolName + " " + campusName + "(" + schoolType + ")");
                        System.out.println("구분 : " + schoolGubun);
                        System.out.println("주소 : " + adres);
                        System.out.println("설립유형 : " + estType);
                        System.out.println("학교 사이트 : " + link);
                        System.out.println();

                        returnlist.add(new Univ(schoolName, campusName, schoolType, schoolGubun, adres, estType, link));
                    }
                }
            }
        }
        return returnlist;
    }
}

