package org.dimigo.gui.UniAll;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Scrap2 {
    public static List<Univ2> Scrap(String text) {
        List<Univ2> univList = null;
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
                univList = list(result, text);

            }
            //예외처리
        } catch (Exception e) {
            e.printStackTrace();
            //값 넘기기
        }
        return univList;
    }


    private static List<Univ2> list(String s, String searchName) throws IOException {
        Map map = new ObjectMapper().readValue(s, Map.class);

        //dataSearch Map에서 content list 받아오기
        List<Map<String, String>> list = (List) ((Map) map.get("dataSearch")).get("content");


        //Scrap으로 보낼 returnlist
        List<Univ2> returnlist = new ArrayList<>();

        //for문으로 정보 받아오기
        for (Map<String, String> value : list) {

            String schoolName = value.get("schoolName");
            if(schoolName.contains(searchName)) {

                String adres = value.get("adres");
                if (adres.equals("9999")) {
                    adres = "경상남도 창원시 진해구 중원로 1 (속천동, 해군사관학교)";
                }

                String estType = value.get("estType");

                String schoolGubun = value.get("schoolGubun");
                if (schoolGubun.equals("null")){
                    schoolGubun = "전문대학";
                }



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

                returnlist.add(new Univ2(schoolName, campusName, schoolType, schoolGubun, adres, estType, link));
            }
        }
        return returnlist;
    }
}
